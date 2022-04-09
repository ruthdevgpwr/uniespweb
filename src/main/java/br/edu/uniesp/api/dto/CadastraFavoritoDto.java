package br.edu.uniesp.api.dto;

import java.util.List;

public class CadastraFavoritoDto {
    private Integer idUsuario;
    private List<Integer> idFilmes;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Integer> getIdFilmes() {
        return idFilmes;
    }

    public void setIdFilmes(List<Integer> idFilmes) {
        this.idFilmes = idFilmes;
    }
}
