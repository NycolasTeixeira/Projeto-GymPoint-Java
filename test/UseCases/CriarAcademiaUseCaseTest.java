/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseCases;

import DTO.CriarAcademiaDTO;
import Entities.Gym;
import Repositories.GymRepository;
import Repositories.InMemory.InMemoryGymRepository;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author nycolas_teixeira
 */
public class CriarAcademiaUseCaseTest {

    private GymRepository academiaRepository;
    private CriarAcademiaUseCase criarAcademiaUseCase;

    @Before
    public void setUp() {
        this.academiaRepository = new InMemoryGymRepository();
        this.criarAcademiaUseCase = new CriarAcademiaUseCase(academiaRepository);
    }

    @Test
    public void testeAcademiaCDadosValidos() {

        String nome = "Academia Senai";
        String telefone = "000";
        String desc = "teste";
        Double latitude = -48.000;
        Double longitude = -48.000;

        CriarAcademiaDTO dto = new CriarAcademiaDTO(nome, telefone, desc, latitude, longitude);

      Gym academia =  this.criarAcademiaUseCase.executar(dto);
        
        
        TestCase.assertEquals("Academia Senai", academia.getNome());
        TestCase.assertEquals("000", academia.getTel());

    }

}
