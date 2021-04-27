package com.example.demo.service;


//import com.example.demo.mapper.TableName;


import com.example.demo.Entity.Tag;
import com.example.demo.Entity.Tree;
import com.example.demo.Entity.TreeList;
import com.example.demo.mapper.*;

import com.example.demo.util.TreeUtils;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class TreeService {


    @Autowired
    TreeMapper treeMapper;

    public List<Tree> Sel() {


        return treeMapper.Sel();
    }


    public Tree SelTree() {
        Tree tree = new Tree();
        int b = 0;
        for (int i = 0; i < treeMapper.SelTree().size(); i++) {
            String aa = treeMapper.SelTree().get(i).getId_structure();

            if (aa.equals("-1")) {
                tree.setId(treeMapper.SelTree().get(i).getId());
                tree.setTitle(treeMapper.SelTree().get(i).getTitle());
                tree.setEspath(treeMapper.SelTree().get(i).getEspath());
                tree.setId_parent_node(treeMapper.SelTree().get(i).getId_parent_node());
                tree.setId_seq(treeMapper.SelTree().get(i).getId_seq());
            }
        }
        TreeUtils.createTree(treeMapper.SelTree(), tree, "id", "id_parent_node", "children");
        return tree;
    }

    @Autowired
    TagMapper TagMapper;

    public List<Tag> getcjsj(String id_structure) {


        return TagMapper.Getcjsj(id_structure);
    }


    //根据表名称和字段名称 查询创建时间字段 根据当前时间对比
    @Autowired
    CreateTimeMapper createTimeMapper;

    public Map<String, Integer> getrgl() throws Exception {

        int jrrg = 0;
        int zs = 0;
        int ndrg =0;
        for (int i = 0; i < treeMapper.Sel().size(); i++) {

            String id_structure1 = treeMapper.Sel().get(i).getId_structure();
            int cjsj = TagMapper.Getcjsj(id_structure1).get(0).getId();
            String ct = "c" + cjsj;
            String id_structure = "esp_" + id_structure1;
            //拿到 表名称和 创建日期字段  开始执行查询
            List<Map<String, Object>> stringList = createTimeMapper.createtime(ct, id_structure);


            zs += stringList.size();
            for (int b = 0; b < stringList.size(); b++) {
                Map<String, Object> aa = stringList.get(b);
                String cjrq = (String) aa.get("cjsj");
                Date currentTime = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar c = Calendar.getInstance();
                c.setTime(new Date());
                c.add(Calendar.YEAR, -1);
                Date y = c.getTime();
                String year = formatter.format(y);
                System.out.println("过去一年："+year);
                //当前日期
                String dateString = formatter.format(currentTime);
                //这个是获取今日入馆
                if (cjrq.equals(dateString)) {
                    jrrg += 1;
                }
                //获取
                ;
                if(sdf.parse(cjrq).getTime()>sdf.parse(year).getTime()){
                    ndrg+=1;
                }



            }

        }
        Map<String, Integer> bb = new HashMap<>();
        bb.put("zs", zs);
        bb.put("jrrg", jrrg);
        bb.put("ndrg", ndrg);

        return bb;
    }





    //这里的方法获取档案系统里面所有的电子文件大小
    @Autowired
    SeleteFileTable seleteFileTable;
    @Autowired
    CHILDSTRUCTURE childstructure;

  public  int  selectFileTable(){


      int filesiz=0;
      for (int i=0;i<seleteFileTable.SeleteFileTable().size();i++) {
          String tablename= seleteFileTable.SeleteFileTable().get(i).get("tablename").toString();
          //执行电子文件字段名称查询
          int dzwjdx=0;
          if(null!=TagMapper.getdzwj(tablename)) {
               dzwjdx = TagMapper.getdzwj(tablename).get(0).getId();
          }else{
              continue;
          }
          String dzwj="0";
          if(null!=seleFIleSize.getAllFilesize("c" + dzwjdx, "esp_" + tablename)) {
              dzwj = seleFIleSize.getAllFilesize("c" + dzwjdx, "esp_" + tablename).get("zwjdx").toString();
          }

          if(dzwj!=null) {
              filesiz += Integer.parseInt(dzwj);
          }
      }
      System.out.println("==============总电子文件大小"+filesiz);
         filesiz= filesiz/1024/1024/1024;
    return  filesiz;
  }






    //这里是拿到前台的树结构 转成  list tree
    @Autowired
    TreeLsitMapper treeLsitMapper;

    @Autowired
    CHILDSTRUCTURE1 childstructure1;
    @Autowired
    SeleFIleSize seleFIleSize;


    public  List<TreeList>  getdata(String data,String is) {



          List<Tree> treeList= ss(data,is);
       // System.out.println(treeList.size());
        List<TreeList> lists=new ArrayList<>();
      for(int i=0;i<treeList.size();i++) {
          TreeList treeList1 = new TreeList();
          String tablename = treeList.get(i).getId_structure();
         // System.out.println("tablename" + tablename);
          String espath = treeList.get(i).getEspath();
          //去执行查询每个表的保管期限字段

          if (!tablename.equals("\"null\"") && !tablename.equals("0")) {
              int bgqx = 0;

              if (null == TagMapper.Getbgqx(tablename) || TagMapper.Getbgqx(tablename).toString().equals("[]")) {
                  continue;
              } else {
                  bgqx = TagMapper.Getbgqx(tablename).get(0).getId();

              }
              //获取这个节点的永久总数



              //统计电子文件数量  根据 当前表名称 去 ESS_CHILDSTRUCTURE 查询 拿到 id_childstructure   拿到这个继续  ESS_STRUCTURE 表判断 如果不是 doc
              //  继续去ESS_CHILDSTRUCTURE 查询如果是 doc直接根据path和 表名称查询电子文件大小
              //表名称去查询
            //  System.out.println("--------------"+tablename);
              childstructure.getfile(tablename).get("id_childstructure").toString();
              if (null!=childstructure.getfile(tablename).get("id_childstructure").toString() ) {
                  String tn = childstructure.getfile(tablename).get("id_childstructure").toString();


                  String estype = childstructure1.getfile1(tn).get("estype").toString();
                //  System.out.println("-----estype-----"+estype);
                  if (estype.equals("document")) {
                      //执行电子文件字段名称查询
                      int dzwjdx = TagMapper.getdzwj(tn).get(0).getId();
                      //调用查询

                     if(null!=seleFIleSize.getFilesize("c"+dzwjdx,"esp_"+tn,"'%"+espath+"%'")){
                         String  dzwj=seleFIleSize.getFilesize("c"+dzwjdx,"esp_"+tn,"'%"+espath+"%'").get("zwjdx").toString();
                          int aa=  Integer.parseInt(dzwj) /1024/1024/1024;
                          dzwj=""+aa;
                         treeList1.setFilesize(dzwj);
                     }
                  } else {
                      //继续查询下级
                  //    System.out.println("----------tn----"+tn);
                      String tn1 = childstructure.getfile(tn).get("id_childstructure").toString();
                      String estype1 = childstructure1.getfile1(tn1).get("estype").toString();
                      if (estype1.equals("document")) {
                          //执行电子文件字段名称查询
                          int dzwjdx = TagMapper.getdzwj(tn1).get(0).getId();
                          //执行电子文件查询
                        //  System.out.println("----------tn1----"+tn1);

                          if(null!=seleFIleSize.getFilesize("c"+dzwjdx,"esp_"+tn1,"'%"+espath+"%'")){
                              String  dzwj=seleFIleSize.getFilesize("c"+dzwjdx,"esp_"+tn1,"'%"+espath+"%'").get("zwjdx").toString();
                              int aa=  Integer.parseInt(dzwj) /1024/1024/1024;
                              dzwj=""+aa;
                              treeList1.setFilesize(dzwj);
                          }
                      } else {
                          String tn2 = childstructure.getfile(tn1).get("id_childstructure").toString();
                          String estype2 = childstructure1.getfile1(tn2).get("estype").toString();
                          if (estype2.equals("document")) {
                              //执行电子文件字段名称查询
                              int dzwjdx = TagMapper.getdzwj(tn2).get(0).getId();
                              //执行电子文件查询
                              if(null!=seleFIleSize.getFilesize("c"+dzwjdx,"esp_"+tn2,"'%"+espath+"%'")){
                                  String  dzwj=seleFIleSize.getFilesize("c"+dzwjdx,"esp_"+tn2,"'%"+espath+"%'").get("zwjdx").toString();
                                  int aa=  Integer.parseInt(dzwj) /1024/1024/1024;
                                  dzwj=""+aa;
                                  treeList1.setFilesize(dzwj);
                              }

                          }

                      }

                  }
                  ;
                  treeList1.setJdmc(treeList.get(i).getTitle());
                  treeList1.setBgqxyj(treeLsitMapper.selectzs("esp_" + tablename, "c" + bgqx, "永久",espath).get("zs").toString());
                  treeList1.setBgqxsn(treeLsitMapper.selectzs("esp_" + tablename, "c" + bgqx, "10年",espath).get("zs").toString());
                  treeList1.setBgqxssn(treeLsitMapper.selectzs("esp_" + tablename, "c" + bgqx, "30年", espath).get("zs").toString());
                  treeList1.setBgqxcq(treeLsitMapper.selectzs("esp_" + tablename, "c" + bgqx, "长期", espath).get("zs").toString());
                  treeList1.setAllfile(treeLsitMapper.selectqb("esp_" + tablename, espath).get("zs").toString());
                  lists.add(treeList1);
              } else {

                  continue;
              }




          }else{
              treeList1.setJdmc(treeList.get(i).getTitle());
              lists.add(treeList1);
          }


      }
        System.out.println("lists============"+lists);
      return lists;
       }


//工具方法用来解析前端树结构的方法
List<Tree>  treeList11=new ArrayList<>();
    public  List<Tree>  ss(String data,String is){
        System.out.println("======="+is);
           if(is.equals("aa")) {

               for(int i=0;i<treeList11.size();){
                   treeList11.remove(0);
                   System.out.println();
               }

           }
               JSONArray objArray = JSONArray.fromObject(data);
               for (int i = 0; i < objArray.size(); i++) {
                   Tree tree = new Tree();

                   if (objArray.size() > 1) {
                       tree.setTitle(objArray.getJSONObject(i).getString("title"));
                       tree.setId_structure(objArray.getJSONObject(i).getString("id_structure"));
                       tree.setEspath(objArray.getJSONObject(i).getString("espath"));
                       treeList11.add(tree);
                       if (objArray.getJSONObject(i).containsKey("children")) {
                           ss(objArray.getJSONObject(i).getString("children").toString(), "bb");
                       }
                       continue;
                   } else {
                       tree.setTitle(objArray.getJSONObject(i).getString("title"));
                       tree.setId_structure(objArray.getJSONObject(i).getString("id_structure"));
                       tree.setEspath(objArray.getJSONObject(i).getString("espath"));
                       treeList11.add(tree);
                       if (objArray.getJSONObject(i).containsKey("children")) {
                           ss(objArray.getJSONObject(i).getString("children").toString(), "bb");
                       }
                   }
               }


    return treeList11;
    }

}