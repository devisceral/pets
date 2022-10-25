package br.com.devisceral.backend.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devisceral.backend.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{
  
}
