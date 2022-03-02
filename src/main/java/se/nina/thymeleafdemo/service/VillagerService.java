package se.nina.thymeleafdemo.service;


import se.nina.thymeleafdemo.entity.Villager;

import java.util.List;

public interface VillagerService {

    public List<Villager> findAll();

    public Villager findById(int theId);

    public void save(Villager theVillager);

    public void deleteById(int theId);

}