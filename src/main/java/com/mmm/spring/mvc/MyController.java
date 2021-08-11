package com.mmm.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
// we can also use annotation @RequestMapping for class/ in this case it will be added before @RequestMapping of method
//@RequestMapping("/showDetails")
public class MyController {


    @RequestMapping("/")
    public String showFirstView (){

        return "first-view";
    }

//    @RequestMapping("/askDetails")
//    public String askEmpDetailsView (){
//        return "ask-emp-details-view";
//    }

    // using of model
    @RequestMapping("/askDetails")
    public String askEmpDetailsView (Model model){
//        //default values of new object will be in view
//        model.addAttribute("employee", new Employee());

        Employee emp = new Employee();
        emp.setName("Ivan");
        emp.setSurname("Ivanov");
        emp.setSalary(500);
        emp.setPhoneNumber("123-12-12");
        model.addAttribute("employee", emp);

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

//    //with model and annotation RequestParam
//    @RequestMapping("/showDetails")
//    public String showEmpDetailsView (@RequestParam ("empName") String empName, Model model){
////
////        String name = request.getParameter("empName");
//        empName = "Mr. "+ empName;
//        model.addAttribute("empName", empName);
//        return "show-emp-details-view";
//    }

//    //using data from model from askDetails
//    @RequestMapping("/showDetails")
//    public String showEmpDetailsView (@ModelAttribute ("employee") Employee employee){
//
//        //we can change values of ModelAttribute employee
//
//        String name = employee.getName();
//        employee.setName("Mr. "+name);
//
//        return "show-emp-details-view";
//    }

    //using validation
    @RequestMapping("/showDetails")
    public String showEmpDetailsView (@Valid @ModelAttribute ("employee") Employee employee, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }
}
