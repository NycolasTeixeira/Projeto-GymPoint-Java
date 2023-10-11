
package Repositories;

import Entities.Gym;
import java.util.List;


public interface GymRepository {
    public Gym create(Gym gym);
    public Gym SearchGymName(String nome);
    public List<Gym> buscarAcademias(String termo);
}
