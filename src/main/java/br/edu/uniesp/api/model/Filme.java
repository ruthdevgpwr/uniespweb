package br.edu.uniesp.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

//Representa a entidade, camada mais próxima do banco de dados - o banco de dados vai ser criado em cima dessa classe
//cada atributo é uma coluna no banco de dados
//serializable

@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;

    private String titulo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
