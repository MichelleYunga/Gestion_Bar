package com.example.demo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
