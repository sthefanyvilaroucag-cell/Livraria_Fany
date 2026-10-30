package com.seduc.LivrariaFany.repository;


import com.seduc.LivrariaFany.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
