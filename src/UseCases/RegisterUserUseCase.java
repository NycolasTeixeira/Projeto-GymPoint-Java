package UseCases;

import DTO.RegisterUserDTO;
import Entities.User;
import Repositories.UserRepository;


public class RegisterUserUseCase {
    
    private final UserRepository userRepository;
    
    public RegisterUserUseCase(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public User execute(RegisterUserDTO registerUserDTO) throws Exception{ 
        
        User user = this.userRepository.buscarPorEmail(registerUserDTO.getEmail());
        if(user != null){
            throw new Exception("Usuario ja existe");
        }
        
        User u = new User(registerUserDTO.getName(), registerUserDTO.getEmail(), registerUserDTO.getPassword(), registerUserDTO.getFunction_user());
                
        return this.userRepository.create(u);
    }
}