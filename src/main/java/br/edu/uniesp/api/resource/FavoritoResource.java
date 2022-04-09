package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.dto.CadastraFavoritoDto;
import br.edu.uniesp.api.model.Favorito;
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.service.FavoritoService;
import br.edu.uniesp.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorito")
public class FavoritoResource {
    @Autowired
    private FavoritoService service;


    @PostMapping
    public Favorito salvar(@RequestBody CadastraFavoritoDto dto) throws Exception {
        return service.salvar(dto);
    }

    @GetMapping
    public List<Favorito> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }

    @PutMapping("{id}")
    public Favorito atualizar(@RequestBody CadastraFavoritoDto dto, @PathVariable int id) throws Exception {
        return service.atualizar(dto, id);
    }
}
