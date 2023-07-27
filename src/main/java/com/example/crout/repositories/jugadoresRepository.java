package com.example.crout.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crout.models.jugadorModel;

@Repository
public interface jugadoresRepository extends CrudRepository<jugadorModel, Integer> {
    // No hace falta declarar metodos estaticos, por que estos metodos ya estan
    // declarados en la dependencia
    // fingByid()
    // fingAll()
    // DeleteByid()
}
