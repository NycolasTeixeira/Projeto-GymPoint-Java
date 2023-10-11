/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseCases.Factories;

import Repositories.GymRepository;
import Repositories.Hibernate.HibernateGymRepository;
import UseCases.CriarAcademiaUseCase;

/**
 *
 * @author nycolas_teixeira
 */
public class MakeCriarAcademiaUseCase {

    public static CriarAcademiaUseCase make() {
        GymRepository repo = new HibernateGymRepository();
        return new CriarAcademiaUseCase(repo);
    }
}
