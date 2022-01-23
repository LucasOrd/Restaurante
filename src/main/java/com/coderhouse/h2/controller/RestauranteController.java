package com.coderhouse.h2.controller;

import com.coderhouse.h2.model.Restaurante;
import com.coderhouse.h2.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coder-house")
public class RestauranteController {

    private final RestauranteService service;

    @PostMapping("/restaurante")
    public Restaurante createRestaurante(@RequestBody Restaurante restaurante) {
        return service.createRestaurante(restaurante);
    }


    @PutMapping("/restaurante/{id}")
    public Restaurante updateRestauranteById(@PathVariable Long id, @RequestBody  Restaurante restaurante) {
        return service.updateRestauranteById(restaurante, id);
    }

}
