package com.seduc.LivrariaFany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String autor;
    private String codigo;
    private String NumeroPaginas;
    private Genero genero;
    private String editora;
    private double preco;

    public Livro() {
    }

    public Livro(String nome, String autor, String codigo, String numeroPaginas, Genero genero, String editora, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.codigo = codigo;
        NumeroPaginas = numeroPaginas;
        this.genero = genero;
        this.editora = editora;
        this.preco = preco;
    }

    public Livro(int id, String nome, String autor, String codigo, String numeroPaginas, Genero genero, String editora, double preco) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.codigo = codigo;
        NumeroPaginas = numeroPaginas;
        this.genero = genero;
        this.editora = editora;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        NumeroPaginas = numeroPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero() {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
