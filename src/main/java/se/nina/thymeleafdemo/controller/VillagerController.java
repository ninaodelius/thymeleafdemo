package se.nina.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.nina.thymeleafdemo.entity.Villager;
import se.nina.thymeleafdemo.service.VillagerService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/villagers")
public class VillagerController {

    private VillagerService villagerService;

    public VillagerController(VillagerService theVillagerService) {
        villagerService = theVillagerService;
    }


    //add mapping for "/list"
    @GetMapping("/list")
    public String listVillagers(Model theModel) {

        //get villagers from db
        List<Villager> theVillagers = villagerService.findAll();

        //add to the spring model
        theModel.addAttribute("villagers", theVillagers);

        return "villagers/list-villagers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        //create model attribute to bind form data
        Villager theVillager = new Villager();

        theModel.addAttribute("villager", theVillager);

        return "villagers/villager-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("villagerId") int theId,
                                    Model theModel) {
        //get the villager from the service
        Villager theVillager = villagerService.findById(theId);
        //set the villager as a model attribute to pre-populate the form
        theModel.addAttribute("villager", theVillager);
        //send over to our form
        return "villagers/villager-form";
    }

    @PostMapping("/save")
    public String saveVillager(@ModelAttribute("villager") Villager theVillager) {
        //save the villager
        villagerService.save(theVillager);

        //use a redirect to prevent duplicate submissions
        return "redirect:/villagers/list";
    }


}
