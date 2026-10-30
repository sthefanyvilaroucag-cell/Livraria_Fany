package com.seduc.LivrariaFany.controller;

import com.seduc.LivrariaFany.entity.Livro;
import com.seduc.LivrariaFany.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {


private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> mostrarLivro(){
        return service.mostrarLivro();
    }

    @PostMapping
    public void criarLivro(@RequestBody Livro a){
        service.informarLivro(a);
    }
}
