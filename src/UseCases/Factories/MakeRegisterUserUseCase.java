package UseCases.Factories;

import Repositories.Hibernate.HibernateUsuarioRepository;
import Repositories.UserRepository;
import UseCases.RegisterUserUseCase;


public class MakeRegisterUserUseCase {
    public static RegisterUserUseCase make(){
        UserRepository userRepository = new HibernateUsuarioRepository();
        return new RegisterUserUseCase(userRepository);
    }
}
