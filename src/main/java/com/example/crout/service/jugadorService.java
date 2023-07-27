package com.example.crout.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crout.models.jugadorModel;
import com.example.crout.repositories.jugadoresRepository;

@Service
public class jugadorService {

    @Autowired
    jugadoresRepository jugadoresRepository;

    // buscar todos los registros
    public ArrayList<jugadorModel> obtenerJugadores() {
        return (ArrayList<jugadorModel>) jugadoresRepository.findAll();
    }

    public Optional<jugadorModel> obtenerporId(Integer Id) {
        return jugadoresRepository.findById(Id);
    }

    // metodo pra guardar un jugador
    public jugadorModel guardar(jugadorModel jugador) {
        return jugadoresRepository.save(jugador);
    }

    public boolean eliminar(Integer Id) {
        try {
            jugadoresRepository.deleteById(Id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}
