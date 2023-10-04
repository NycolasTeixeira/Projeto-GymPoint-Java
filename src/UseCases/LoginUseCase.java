package UseCases;

import DTO.LoginUserDTO;
import Entities.User;
import Repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;

public class LoginUseCase {

    private final UserRepository userRepository;

    public LoginUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(LoginUserDTO loginDTO) throws Exception {
        User user = this.userRepository.buscarPorEmail(loginDTO.getEmail());

        if (user == null) {
            throw new Exception("Usuário não cadastrado");
        }

        if (!BCrypt.checkpw(loginDTO.getPassword(), user.getSenha_hash())) {
            throw new Exception("Credenciais inválidas");
        }
        return user;
    }
}