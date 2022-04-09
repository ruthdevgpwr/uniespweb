package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroResource {
    @Autowired
    private GeneroService service;


    @PostMapping
    public Genero salvar(@RequestBody Genero genero) {
        genero = service.salvar(genero);
        return genero;
    }

    @GetMapping
    public List<Genero> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }

    @PutMapping
    public Genero atualizar(@RequestBody Genero genero) throws Exception {
        return service.atualizar(genero);
    }
}
