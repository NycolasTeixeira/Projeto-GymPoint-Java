/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop.Controllers;

import DTO.CriarAcademiaDTO;
import Entities.Gym;
import UseCases.Factories.MakeBuscarAcademiasUseCase;
import UseCases.Factories.MakeCriarAcademiaUseCase;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nycolas_teixeira
 */
public class GymController {

    public Gym CriarAcademia(CriarAcademiaDTO dto) {
        try {

            return MakeCriarAcademiaUseCase.make().executar(dto);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar a academia");
           
            return null;
        }

    }

    public List<Gym> BuscarAcademia(String termo) {

        try {
            return MakeBuscarAcademiasUseCase.make().executar(termo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar");
            return null;

        }

    }

}
