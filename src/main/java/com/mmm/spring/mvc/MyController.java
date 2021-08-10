package com.mmm.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
// we can also use annotation @RequestMapping for class/ in this case it will be added before @RequestMapping of method
//@RequestMapping("/showDetails")
public class MyController {


    @RequestMapping("/")
    public String showFirstView (){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetailsView (){
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetailsView (){
//        return "show-emp-details-view";
//    }

//    //with model and HttpServletRequest
//    @RequestMapping("/showDetails")
//    public String showEmpDetailsView (HttpServletRequest request, Model model){
//
//        String name = request.getParameter("empName");
//        name = "Mr. "+ name;
//        model.addAttribute("empName", name);
//        return "show-emp-details-view";
//    }

    //with model and annotation RequestParam
    @RequestMapping("/showDetails")
    public String showEmpDetailsView (@RequestParam ("empName") String empName, Model model){
//
//        String name = request.getParameter("empName");
        empName = "Mr. "+ empName;
        model.addAttribute("empName", empName);
        return "show-emp-details-view";
    }
}
