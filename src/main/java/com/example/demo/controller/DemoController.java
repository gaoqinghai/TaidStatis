package com.example.demo.controller;

import com.example.demo.Entity.Tree;
import com.example.demo.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class DemoController {

      @Autowired
      private TreeService treeService;



    @RequestMapping("/")
    public String hello(){
    return "/pages_login.html";
    }
    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }
    @RequestMapping("/home.html")
    
    public String home(Map<String,String>  omap){
        Map<String, Integer> map = null;
try {
    map  = treeService.getrgl();
}catch (Exception e){
    
}
    int  filesize=treeService.selectFileTable();
        int jrrg=   map.get("jrrg");
        int zs=map.get("zs");
        int ndrg=map.get("ndrg");
         omap.put("jrrg",""+jrrg);
         omap.put("zs",""+""+zs);
        omap.put("ndrg",""+""+ndrg);
        omap.put("filesize",""+filesize);
        return "home";
    }
    @RequestMapping("/forms_checkbox.html")
    public String forms_checkbox(){
        return "forms_checkbox";
    }
    @RequestMapping("/forms_elements.html")
    public String forms_elements(){
        return "forms_elements";
    }
    @RequestMapping("/forms_radio.html")
    public String forms_radio(){
        return "forms_radio";
    }
    @RequestMapping("/forms_switch.html")
    public String forms_switch(){
        return "forms_switch";
    }
    @RequestMapping("/ftdms-config.html")
    public String ftdmsconfig(){
        return "ftdms-config";
    }

    @RequestMapping("/js_chartjs.html")
    public String js_chartjs(){
        return "js_chartjs";
    }
    @RequestMapping("/js_colorpicker.html")
    public String js_colorpicker(){
        return "js_colorpicker";
    }
    @RequestMapping("/js_datepicker.html")
    public String js_datepicker(){
        return "js_datepicker";
    }
    @RequestMapping("/js_msg.html")
    public String js_msg(){
        return "js_msg";
    }
    @RequestMapping("/js_notify.html")
    public String js_notify(){
        return "js_notify";
    }
    @RequestMapping("/js_sliders.html")
    public String js_sliders(){
        return "js_sliders";
    }
    @RequestMapping("/js_tags_input.html")
    public String js_tags_input(){
        return "js_tags_input";
    }
    @RequestMapping("/pages_add_doc.html")
    public String pages_add_doc(){
        return "pages_add_doc";
    }
    @RequestMapping("/pages_config.html")
    public String pages_config(){
        return "pages_config";
    } @RequestMapping("/pages_data.html")
    public String pages_data(){
        return "pages_data";
    }
    @RequestMapping("/pages_edit_pwd.html")
    public String pages_edit_pwd(){
        return "pages_edit_pwd";
    }
    @RequestMapping("/pages_guide.html")
    public String pages_guide(){
        return "pages_guide";
    }
    @RequestMapping("/pages_login.html")
    public String pages_login(){
        return "pages_login";
    }
    @RequestMapping("/pages_permission.html")
    public String pages_permission(){
        return "pages_permission";
    }
    @RequestMapping("/pages_permission2.html")
    public String pages_permission2(){
        return "pages_permission2";
    }
    @RequestMapping("/pages_profile.html")
    public String pages_profile(){
        return "pages_profile";
    }
    @RequestMapping("/pagination.html")
    public String pagination(){
        return "pagination";
    }
    @RequestMapping("/ui_buttons.html")
    public String ui_buttons(){
        return "ui_buttons";
    }
    @RequestMapping("/ui_cards.html")
    public String ui_cards(){
        return "ui_cards";
    }
    @RequestMapping("/ui_grid.html")
    public String ui_grid(){
        return "ui_grid";
    }
    @RequestMapping("/ui_icons.html")
    public String ui_icons(){
        return "ui_icons";
    }
    @RequestMapping("/ui_other.html")
    public String ui_other(){
        return "ui_other";
    }
    @RequestMapping("/ui_progress.html")
    public String ui_progress(){
        return "ui_progress";
    }
    @RequestMapping("/ui_step.html")
    public String ui_step(){
        return "ui_step";
    }
    @RequestMapping("/ui_tables.html")
    public String ui_tables(){
        return "ui_tables";
    }
    @RequestMapping("/ui_tabs.html")
    public String ui_tabs(){
        return "ui_tabs";
    }



//这个是实现统计页面的html比较重要

    @RequestMapping("/js_chartjs1.html")
    public String js_chartjs1(Model model){

        Tree tree = treeService.SelTree();
        String aa=    tree.toString().replaceAll("=",":").replaceAll("Tree","");
        model.addAttribute("message",aa);


        return "js_chartjs1";
    }
    @RequestMapping("/js_chartjs2.html")
    public String js_chartjs2(){


        return "js_chartjs2";
    }


}


