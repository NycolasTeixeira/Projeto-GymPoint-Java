package Desktop.Controllers;

import DTO.LoginUserDTO;
import DTO.RegisterUserDTO;
import Entities.User;
import UseCases.Factories.MakeLoginUseCase;
import UseCases.Factories.MakeRegisterUserUseCase;
import javax.swing.JOptionPane;

public class UserController {
    public User CreateUser(RegisterUserDTO user){
        try {
            return MakeRegisterUserUseCase.make().execute(user);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao conseguimos cadastrar");
            return null;
        }
    }

    public User loginUser(LoginUserDTO loginDTO) {
        try {
            return MakeLoginUseCase.make().execute(loginDTO);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro de autenticação: " + ex.getMessage());
        return null; 
        }
    }
}
