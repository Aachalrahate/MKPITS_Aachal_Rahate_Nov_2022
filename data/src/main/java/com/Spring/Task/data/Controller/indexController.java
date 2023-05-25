package com.Spring.Task.data.Controller;

import com.Spring.Task.data.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class indexController {
    @GetMapping("/")
   public String index(){
        return "index";
    }
    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user,Model model){
        System.out.println(user.toString());

        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getEmail());
        System.out.println(user.getDob());
        model.addAttribute("firstname",user.getFname());
        model.addAttribute("lastname",user.getLname());
        model.addAttribute("email",user.getEmail());
        model.addAttribute("dob",user.getDob());

        return "Welcome";
    }

}
