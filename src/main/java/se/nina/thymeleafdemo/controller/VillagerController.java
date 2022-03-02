package se.nina.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.nina.thymeleafdemo.model.Villager;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/villagers")
public class VillagerController {

    //load villager data
    private List<Villager> theVillagers;

    @PostConstruct
    private void loadData() {

        //create villagers
        Villager vil1 = new Villager(1, "Julian", "Smug", "Horse");
        Villager vil2 = new Villager(2, "Gaston", "Cranky", "Rabbit");
        Villager vil3 = new Villager(3, "Sprinkle", "Peppy", "Penguin");
        //create the list
        theVillagers = new ArrayList<>();

        //add to the list
        theVillagers.add(vil1);
        theVillagers.add(vil2);
        theVillagers.add(vil3);

    }

    //add mapping for "/list"
    @GetMapping("/list")
    public String listVillagers(Model theModel) {

        //add to the spring model
        theModel.addAttribute("villagers", theVillagers);

        return "list-villagers";
    }

}
