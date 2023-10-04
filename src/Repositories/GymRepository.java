
package Repositories;

import Entities.Gym;


public interface GymRepository {
    public Gym create(Gym gym);
    public Gym SearchGymName(String nome);
}
