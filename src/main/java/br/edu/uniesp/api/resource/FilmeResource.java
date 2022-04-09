package br.edu.uniesp.api.resource;


import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//resource tbm conhecida como controller - onde bate quando é feita uma requisição

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired //injeta o service dentro da classe FilmeResource
    private FilmeService service;

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return filme;
    }

    @GetMapping
    public List<Filme> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping
    public Filme atualizar(@RequestBody Filme filme) throws Exception {
        return service.atualizar(filme);
    }

}
