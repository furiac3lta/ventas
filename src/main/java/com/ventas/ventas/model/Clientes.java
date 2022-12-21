package com.ventas.ventas.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    @Column(name = "nombre", nullable = false, length = 70)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 150)
    private String apellido;
    @Column(name = "direccion", nullable = true, length = 150)
    private String direccion;
    @Column(name = "telefono", nullable = true, length = 12)
    private String telefono;
    @Column(name = "email", nullable = false, length = 150)
    private String email;
}
