package com.sujah.configconsumer.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileControllerWithHTML {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping("/profilehtml")
    public String getConfig(Model model){
        model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min", memberProfileConfiguration.getMinRentPeriod());
        return "mprofile";
    }

}
