/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories.InMemory;

import Entities.Gym;
import Repositories.GymRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nycolas_teixeira
 */
public class InMemoryGymRepository implements GymRepository {

    ArrayList<Gym> academias = new ArrayList<>();

    @Override
    public Gym create(Gym academia) {
        academias.add(academia);
        return academia;

    }

    public Gym SearchGymName(String nome) {
        for (Gym academia : academias) {
            if (academia.getNome().equals(nome)) {
                return academia;
            }
        }
        return null;
    }

    @Override
    public List<Gym> buscarAcademias(String termo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
