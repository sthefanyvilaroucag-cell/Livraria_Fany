package com.seduc.LivrariaFany.service;

import com.seduc.LivrariaFany.entity.Livro;
import com.seduc.LivrariaFany.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> mostrarLivro() {
        List<Livro> livrosList = new ArrayList<>();
        return livrosList = repository.findAll();
    }

    public void informarLivro(Livro animation){
        Livro livro = new Livro();
        livro.setAutor(animation.getAutor());
        livro.setCodigo(animation.getCodigo());
        livro.setEditora(animation.getEditora());
        livro.setGenero();
        livro.setNome(animation.getNome());
        livro.setNumeroPaginas(animation.getNumeroPaginas());
        livro.setPreco(animation.getPreco());
        repository.save(livro);
    }
}
