package br.edu.uniesp.api.repository;


import br.edu.uniesp.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//assinatura é dizer o tipo, os parametros, nome e o que o metodo vai receber(entrada e a saída do método), mas nao vai ter o "miolo" dele
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
