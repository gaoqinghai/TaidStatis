package com.example.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.Entity.Tree;

import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
     *
     * @company
     * @author superboo
     * @version 3.0
     * @date 2014-5-21 上午09:45:51
     */
    public class JXTree {
        public String getJsonStr1() {
            String jsonStr = "{"
                    + "\"list\": ["
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463881.shtml\","
                    + "\"title\": \"秦皇岛市城市管理局数字城管GPS车辆管理系统公开采购\","
                    + "\"time\": \"2014-05-20 18:58:50\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463904.shtml\","
                    + "\"title\": \"宁晋县公安局贾家口派出所工程\","
                    + "\"time\": \"2014-05-20 18:52:10\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463903.shtml\","
                    + "\"title\": \"宁晋县公安局耿庄桥派出所工程\","
                    + "\"time\": \"2014-05-20 18:49:30\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463838.shtml\","
                    + "\"title\": \"河北医科大学食堂油改气项目公开招标公告\","
                    + "\"time\": \"2014-05-20 18:03:48\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463601.shtml\","
                    + "\"title\": \"青龙满族自治县教育局2014年中小学校舍安全工程公开招标公告\","
                    + "\"time\": \"2014-05-20 17:06:12\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463590.shtml\","
                    + "\"title\": \"清东陵孝陵主神道一孔、五孔、七孔石桥修缮工程监理公开招标公告\","
                    + "\"time\": \"2014-05-20 17:03:24\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463668.shtml\","
                    + "\"title\": \"晋州市教育局中小学计算机采购项目公开招标公告\","
                    + "\"time\": \"2014-05-20 16:58:58\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463666.shtml\","
                    + "\"title\": \"固安县畜牧兽医局检测设备采购公开招标公告\","
                    + "\"time\": \"2014-05-20 16:57:07\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463446.shtml\","
                    + "\"title\": \"宁晋县2014年高标准基本农田建设项目勘查设计公开招标公告\","
                    + "\"time\": \"2014-05-20 16:44:24\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463210.shtml\","
                    + "\"title\": \"内丘县教育局幼儿园玩教具采购项目公开招标公告\","
                    + "\"time\": \"2014-05-20 16:30:42\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463186.shtml\","
                    + "\"title\": \"黄骅市2014年农桥重建工程（第一批）公开招标公告\","
                    + "\"time\": \"2014-05-20 16:27:35\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463134.shtml\","
                    + "\"title\": \"柏乡县2014年农业综合开发高标准农田建设项目公开招标公告\","
                    + "\"time\": \"2014-05-20 16:22:06\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463048.shtml\","
                    + "\"title\": \"石家庄市第一中学东校区校园数字广播系统改造工程预中标公告\","
                    + "\"time\": \"2014-05-20 16:13:10\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462957.shtml\","
                    + "\"title\": \"唐山市园林绿化管理局唐山植物园建成区景观提升工程一标段河北省政府采购公开招标公告\","
                    + "\"time\": \"2014-05-20 15:42:20\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462954.shtml\","
                    + "\"title\": \"唐山市园林绿化管理局唐山植物园建成区景观提升工程一标段监理河北省政府采购公开招标公告\","
                    + "\"time\": \"2014-05-20 15:40:55\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462951.shtml\","
                    + "\"title\": \"唐山市园林绿化管理局唐山市城市道路景观提升绿化工程设计河北省政府采购公开招标公告\","
                    + "\"time\": \"2014-05-20 15:39:35\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462600.shtml\","
                    + "\"title\": \"唐山市第二医院采购悬吊式数字放射成像系统公开招标公告\","
                    + "\"time\": \"2014-05-20 14:48:55\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462528.shtml\","
                    + "\"title\": \"石家庄市体育运动学校体育器材采购项目公开招标公告\","
                    + "\"time\": \"2014-05-20 14:33:12\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462243.shtml\","
                    + "\"title\": \"河北宏信招标有限公司河北师范大学生物制造中试平台设备采购（二次）公开招标公告\","
                    + "\"time\": \"2014-05-20 12:03:08\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462156.shtml\","
                    + "\"title\": \"河北化工医药职业技术学院电机与电气控制及物化实验仪器设备采购公开招标公告\","
                    + "\"time\": \"2014-05-20 11:19:41\"" + "}" + "],"
                    + "\"page\": \"总18163篇 共909页 \"" + "}";
            return jsonStr;
        }

        public String getJsonStr2() {
            String jsonStr = "{"
                    + "\"list\": ["
                    + "{"
                    + "\"url\": \"http://www.ceshi.gov.cn\","
                    + "\"title\": \"这是一个我测试加入的东西\","
                    + "\"time\": \"2014-05-21 18:58:50\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463881.shtml\","
                    + "\"title\": \"秦皇岛市城市管理局数字城管GPS车辆管理系统公开采购\","
                    + "\"time\": \"2014-05-20 18:58:50\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463904.shtml\","
                    + "\"title\": \"宁晋县公安局贾家口派出所工程\","
                    + "\"time\": \"2014-05-20 18:52:10\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463903.shtml\","
                    + "\"title\": \"宁晋县公安局耿庄桥派出所工程\","
                    + "\"time\": \"2014-05-20 18:49:30\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463838.shtml\","
                    + "\"title\": \"河北医科大学食堂油改气项目公开招标公告\","
                    + "\"time\": \"2014-05-20 18:03:48\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463601.shtml\","
                    + "\"title\": \"青龙满族自治县教育局2014年中小学校舍安全工程公开招标公告\","
                    + "\"time\": \"2014-05-20 17:06:12\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463590.shtml\","
                    + "\"title\": \"清东陵孝陵主神道一孔、五孔、七孔石桥修缮工程监理公开招标公告\","
                    + "\"time\": \"2014-05-20 17:03:24\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463668.shtml\","
                    + "\"title\": \"晋州市教育局中小学计算机采购项目公开招标公告\","
                    + "\"time\": \"2014-05-20 16:58:58\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463666.shtml\","
                    + "\"title\": \"固安县畜牧兽医局检测设备采购公开招标公告\","
                    + "\"time\": \"2014-05-20 16:57:07\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463446.shtml\","
                    + "\"title\": \"宁晋县2014年高标准基本农田建设项目勘查设计公开招标公告\","
                    + "\"time\": \"2014-05-20 16:44:24\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463210.shtml\","
                    + "\"title\": \"内丘县教育局幼儿园玩教具采购项目公开招标公告\","
                    + "\"time\": \"2014-05-20 16:30:42\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463186.shtml\","
                    + "\"title\": \"黄骅市2014年农桥重建工程（第一批）公开招标公告\","
                    + "\"time\": \"2014-05-20 16:27:35\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463134.shtml\","
                    + "\"title\": \"柏乡县2014年农业综合开发高标准农田建设项目公开招标公告\","
                    + "\"time\": \"2014-05-20 16:22:06\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3463048.shtml\","
                    + "\"title\": \"石家庄市第一中学东校区校园数字广播系统改造工程预中标公告\","
                    + "\"time\": \"2014-05-20 16:13:10\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462957.shtml\","
                    + "\"title\": \"唐山市园林绿化管理局唐山植物园建成区景观提升工程一标段河北省政府采购公开招标公告\","
                    + "\"time\": \"2014-05-20 15:42:20\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462954.shtml\","
                    + "\"title\": \"唐山市园林绿化管理局唐山植物园建成区景观提升工程一标段监理河北省政府采购公开招标公告\","
                    + "\"time\": \"2014-05-20 15:40:55\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462951.shtml\","
                    + "\"title\": \"唐山市园林绿化管理局唐山市城市道路景观提升绿化工程设计河北省政府采购公开招标公告\","
                    + "\"time\": \"2014-05-20 15:39:35\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462600.shtml\","
                    + "\"title\": \"唐山市第二医院采购悬吊式数字放射成像系统公开招标公告\","
                    + "\"time\": \"2014-05-20 14:48:55\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462528.shtml\","
                    + "\"title\": \"石家庄市体育运动学校体育器材采购项目公开招标公告\","
                    + "\"time\": \"2014-05-20 14:33:12\""
                    + "},"
                    + "{"
                    + "\"url\": \"http://www.ccgp.gov.cn/cggg/dfbx/gkzb/201405/t20140520_3462243.shtml\","
                    + "\"title\": \"河北宏信招标有限公司河北师范大学生物制造中试平台设备采购（二次）公开招标公告\","
                    + "\"time\": \"2014-05-20 12:03:08\"" + "}],"
                    + "\"page\": \"总18164篇 共909页 \"" + "}";
            return jsonStr;
        }
        @SuppressWarnings("rawtypes")
        public List<Tree>  analysisJson(Object objJson){
            //如果obj为json数组
            List<Tree> treeList=new ArrayList<>();
            Tree tree = new Tree();
            if(objJson instanceof JSONArray){
                JSONArray objArray = (JSONArray)objJson;
                for (int i = 0; i < objArray.size(); i++) {
                    tree.setTitle(objArray.getJSONObject(i).getString("title"));
                    tree.setId(objArray.getJSONObject(i).getString("id"));
                    tree.setId_structure(objArray.getJSONObject(i).getString("Id_structure"));
                    treeList.add(tree);
                    analysisJson(objArray.get(i));
                }
            }
            //如果为json对象
            else if(objJson instanceof JSONObject){
                JSONObject jsonObject = (JSONObject)objJson;
                Iterator it = (Iterator) jsonObject.keySet();
                while(it.hasNext()){
                    String key = it.next().toString();
                    Object object = jsonObject.get("children");
                    //如果得到的是数组
                    if(object instanceof JSONArray){
                        JSONArray objArray = (JSONArray)object;
                        tree.setTitle(objArray.getJSONObject(0).getString("title"));
                        tree.setId(objArray.getJSONObject(0).getString("id"));
                        tree.setId_structure(objArray.getJSONObject(0).getString("Id_structure"));
                        treeList.add(tree);
                        analysisJson(objArray);
                    }
                    //如果key中是一个json对象
                    else if(object instanceof JSONObject){
                       // analysisJson();
                        tree.setTitle(((JSONObject) object).getString("title"));
                        tree.setId(((JSONObject) object).getString("id"));
                        tree.setId_structure(((JSONObject) object).getString("id_structure"));
                        treeList.add(tree);
                    }
                    //如果key中是其他
                    else{
                        System.out.println("["+key+"]:"+object.toString()+" ");
                    }
                }
            }

            return treeList;
        }

    }


