package com.example.demo;

import org.springframework.stereotype.Controller;                   //edited in
import org.springframework.ui.Model;                                //edited in
import org.springframework.web.bind.annotation.RequestMapping;      //edited in

@Controller
public class HomeController {

//    @RequestMapping("/")
//    public string home(Model model){
    @RequestMapping("/home")    //map to home.html
    public String home(Model model){
        model.addAttribute("myvar1","Yes, you can!");
        model.addAttribute("myvar2","Let's have fun!");  // edited in
        return "home";
    }





//    public class HomeController{        comment: Can't have two classes, just make two methods if mapping another page
//        @RequestMapping("/")
//        public string home(Model model){
//
//            mode.addAttribute("myvar2","Let's have fun!");
//            return "home";
//        }
//
//
//    }


}
