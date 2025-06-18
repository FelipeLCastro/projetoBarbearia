package com.barbearia.assinatura.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    private LocalDateTime dataHora;
    private String servico;

    // Getters e setters
}
