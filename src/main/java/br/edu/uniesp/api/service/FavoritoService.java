package br.edu.uniesp.api.service;

import br.edu.uniesp.api.dto.CadastraFavoritoDto;
import br.edu.uniesp.api.model.Favorito;
import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.repository.FavoritoRepository;
import br.edu.uniesp.api.repository.FilmeRepository;
import br.edu.uniesp.api.repository.GeneroRepository;
import br.edu.uniesp.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FavoritoService {

    @Autowired
    private FavoritoRepository favoritoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    public Favorito salvar(CadastraFavoritoDto dto) throws Exception {
        Optional<Usuario> usuario = usuarioRepository.findById(dto.getIdUsuario());
        if (!usuario.isPresent()) throw new Exception("Usuário não encontrado");

        Favorito favorito = new Favorito();
        favorito.setUsuario(usuario.get());
        for (Integer idFilme : dto.getIdFilmes()) {
            Optional<Filme> filme = filmeRepository.findById(idFilme);
            if (filme.isPresent()) favorito.getFilmes().add(filme.get());
        }
        return favoritoRepository.save(favorito);
    }

    public Favorito atualizar(CadastraFavoritoDto dto, Integer id) throws Exception {
        Optional<Favorito> favoritoBuscado = favoritoRepository.findById(id);
        if(!favoritoBuscado.isPresent()) throw new Exception("Favorito não encontrado");
        favoritoBuscado.get().getFilmes().clear();
        Favorito favorito = favoritoBuscado.get();
//        favorito = favoritoRepository.save(favorito);

        for (Integer idFilme : dto.getIdFilmes()) {
            Optional<Filme> filme = filmeRepository.findById(idFilme);
            if (filme.isPresent()) favorito.getFilmes().add(filme.get());
        }
        return favoritoRepository.save(favorito);
    }

    public void deletar(int id) {
        favoritoRepository.deleteById(id);
    }

    public List<Favorito> listar() {
        return favoritoRepository.findAll();
    }
}
