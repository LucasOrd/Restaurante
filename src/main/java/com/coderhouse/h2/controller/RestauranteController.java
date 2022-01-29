package com.coderhouse.h2.controller;

import com.coderhouse.h2.model.Restaurante;
import com.coderhouse.h2.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import java.util.Map;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.models.media.MediaType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coder-house")
public class RestauranteController {

    private final RestauranteService service;


    @Operation(summary = "Método para crear un restaurante",
            description = "Permite crear restaurantes en OpenApi",
            tags = {"Restaurantes"})
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Se creó el restaurante"),
                    @ApiResponse(responseCode = "400", description = "Hay un error en el request ", content = @Content),
                    @ApiResponse(responseCode = "500", description = "Ocurrió un error inesperado", content = @Content)
            }
    )
    @PostMapping("/restaurante")
    public Map createRestaurante(@RequestBody Restaurante restaurante) {
        return service.createRestaurante(restaurante);
    }


    @PutMapping("/restaurante/{id}")
    public Restaurante updateRestauranteById(@PathVariable Long id, @RequestBody  Restaurante restaurante) {
        return service.updateRestauranteById(restaurante, id);
    }

    @GetMapping("/mensajes/example")
    public String getMensajesString() {;
        return "Ejemplo de respuesta puerto 8081";
    }

}
