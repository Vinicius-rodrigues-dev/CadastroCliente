package com.adv.cadastro.entity;


import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table (name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String nomePai;
    private String nomeMae;
    private String endereco;

}
