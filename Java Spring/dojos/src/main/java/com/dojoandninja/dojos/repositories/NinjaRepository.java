package com.dojoandninja.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojoandninja.dojos.models.Dojo;
import com.dojoandninja.dojos.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();

    List<Ninja> findAllByDojo(Dojo dojo);
}
