package com.barbearia.assinatura.model;

import jakarta.persistence.*;

@Entity
public class PlanoAssinatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;
    private String descricao;

    // Getters e setters
}
