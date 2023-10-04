package UseCases.Factories;

import Repositories.Hibernate.HibernateUsuarioRepository;
import Repositories.UserRepository;
import UseCases.LoginUseCase;

public class MakeLoginUseCase {
    public static LoginUseCase make() {
        UserRepository userRepository = new HibernateUsuarioRepository(); 
        return new LoginUseCase(userRepository);
    }
}


