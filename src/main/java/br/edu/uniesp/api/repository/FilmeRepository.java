package br.edu.uniesp.api.repository;


import br.edu.uniesp.api.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//camada repository é a que vai fazer as querys no banco de dados
// o repository depende do model, o service depende do repository e o resource depende do service

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {
}
