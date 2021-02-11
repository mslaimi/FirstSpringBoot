package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
	List<Personne> findByNomAndPrenom(String nom, String prenom);
}
