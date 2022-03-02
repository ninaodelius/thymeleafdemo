package se.nina.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import se.nina.thymeleafdemo.entity.Villager;

import java.util.List;

//@RepositoryRestResource(path="residents")

public interface VillagerRepository  extends JpaRepository <Villager, Integer> {
    //no need to write code. get CRUD methods for free.

    //add a method to sort by name
    //spring data jpa will parse the method name, find all by, orderby,name,
    //looks for specific format and pattern and creates appropriate query
    public List<Villager> findAllByOrderByName();
}
