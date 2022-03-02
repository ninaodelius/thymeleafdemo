package se.nina.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import se.nina.thymeleafdemo.entity.Villager;

//@RepositoryRestResource(path="residents")

public interface VillagerRepository  extends JpaRepository <Villager, Integer> {
    //no need to write code. get CRUD methods for free.
}
