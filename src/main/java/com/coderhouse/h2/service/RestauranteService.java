package com.coderhouse.h2.service;

import com.coderhouse.h2.model.Restaurante;

import java.util.Map;

public interface RestauranteService {

    Map createRestaurante(Restaurante restaurante);
    Restaurante getRestauranteById(Long id);
    Restaurante updateRestauranteById(Restaurante restaurante, Long id);
    void delete(Restaurante user, Long id);


}
