package org.spring.demo.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMyPage() {
        return "main-menu";
    }

    @RequestMapping("/processFromVersionTwo")
    public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
        String result = "Yo! " + theName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/showform")
    public String showForm(HttpServlet servlet, Model model) {
        String name = servlet.getInitParameter("myName");
        return "showform";
    }

}
