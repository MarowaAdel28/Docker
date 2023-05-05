package gov.iti.jets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gov.iti.jets.entity.User;
import gov.iti.jets.service.UserService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/form")
public class FormController {

    @Autowired
    UserService userService;
    
    @GetMapping
    public String getForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping
    public String postForm(@Valid @ModelAttribute("user") User user, BindingResult result) {

        // ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
        // UserService userService = aContext.getBean("userService", UserService.class);
        if(result.hasErrors()) {
            return "form";
        }
        System.out.println(user);
        if(userService.insert(user)) {
        return "suceess";

        }
        return "form";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        System.out.println("set user service");
        this.userService = userService;
    }
}
