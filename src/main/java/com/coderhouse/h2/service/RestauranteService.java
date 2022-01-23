package com.coderhouse.h2.service;

import com.coderhouse.h2.model.Restaurante;

import java.util.List;

public interface RestauranteService {

    Restaurante createRestaurante(Restaurante restaurante);
    Restaurante getRestauranteById(Long id);
    Restaurante updateRestauranteById(Restaurante restaurante, Long id);
    void delete(Restaurante user, Long id);


}
