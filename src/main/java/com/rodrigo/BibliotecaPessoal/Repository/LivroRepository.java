package com.rodrigo.BibliotecaPessoal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.BibliotecaPessoal.Models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> { }
