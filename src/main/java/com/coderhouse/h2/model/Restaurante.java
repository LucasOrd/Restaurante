package com.coderhouse.h2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Table(name = "restaurante")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @JsonProperty("hora_inicio")
    private int horaInicio;
    @JsonProperty("hora_fin")
    private int horaFin;
    @JsonProperty("fecha_creacion")
    private int fechaCreacion;
    @OneToMany(mappedBy = "id")
    private List<Ciudad> ciudad;

}