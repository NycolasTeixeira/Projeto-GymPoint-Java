package UseCases;

import Entities.Gym;
import Repositories.GymRepository;
import java.util.List;

public class BuscarAcademias {

    private final GymRepository academiaRepository;

    public BuscarAcademias(GymRepository academiaRepository) {
        this.academiaRepository = academiaRepository;
    }

    public List<Gym> executar(String termo) {
        return this.academiaRepository.buscarAcademias(termo);
    }

}
