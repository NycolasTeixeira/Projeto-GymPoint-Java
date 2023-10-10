/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseCases;

import DTO.CriarAcademiaDTO;
import Entities.Gym;
import Repositories.GymRepository;

/**
 *
 * @author nycolas_teixeira
 */
public class CriarAcademiaUseCase {
    private final GymRepository academiaRepository;

    public CriarAcademiaUseCase(GymRepository academiaRepository) {
        this.academiaRepository = academiaRepository;
    }

    public Gym executar(CriarAcademiaDTO dto){
     Gym academia = new Gym(dto.getNome(),dto.getTelefone(), dto.getDescricao(), dto.getLatitude(), dto.getLongitude());
     this.academiaRepository.create(academia);
        return academia;
    }
    
}
