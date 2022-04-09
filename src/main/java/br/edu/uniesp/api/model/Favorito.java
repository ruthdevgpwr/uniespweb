package br.edu.uniesp.api.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Favorito {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private Usuario usuario;

    @OneToMany
    private List<Filme> filmes = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
