package com.example.inicial1.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Audited
@Table(name = "domicilio")
public class Domicilio extends Base {



    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @OneToOne
    private Persona persona;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
