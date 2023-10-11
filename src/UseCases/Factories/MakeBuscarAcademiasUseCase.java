
package UseCases.Factories;

import Repositories.GymRepository;
import Repositories.Hibernate.HibernateGymRepository;
import UseCases.BuscarAcademias;
import UseCases.CriarAcademiaUseCase;


public class MakeBuscarAcademiasUseCase {
      public static BuscarAcademias make() {
        GymRepository repo = new HibernateGymRepository();
        return new BuscarAcademias(repo);
    }
}
