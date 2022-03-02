package se.nina.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.nina.thymeleafdemo.entity.Villager;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/villagers")
public class VillagerController {




    //add mapping for "/list"
    @GetMapping("/list")
    public String listVillagers(Model theModel) {

        //add to the spring model
        theModel.addAttribute("villagers", theVillagers);

        return "list-villagers";
    }

}
