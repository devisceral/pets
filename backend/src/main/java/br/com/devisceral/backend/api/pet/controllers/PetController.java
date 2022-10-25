package br.com.devisceral.backend.api.pet.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devisceral.backend.api.pet.dtos.PetResponse;
import br.com.devisceral.backend.api.pet.mappers.PetMapper;
import br.com.devisceral.backend.core.models.Pet;
import br.com.devisceral.backend.core.repositories.PetRepository;

@RestController
public class PetController {

  @Autowired
  private PetRepository petRepository;

  @Autowired
  private PetMapper petMapper;
  
  @GetMapping("/pets")
  public List<PetResponse> findAll(){
    var pets =  petRepository.findAll();
    var petResponses = new ArrayList<PetResponse>();
    for (Pet pet : pets) {
      petResponses.add(petMapper.toResponse(pet));
    }
    return petResponses;
  }
}
