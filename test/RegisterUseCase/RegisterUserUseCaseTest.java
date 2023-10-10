/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegisterUseCase;

import DTO.RegisterUserDTO;
import Entities.User;
import Enums.Function;
import static Enums.Function.ADMINISTRADOR;
import Repositories.InMemory.InMemoryUsuarioRepository;
import Repositories.UserRepository;
import UseCases.LoginUseCase;
import UseCases.RegisterUserUseCase;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nycolas_teixeira
 */
public class RegisterUserUseCaseTest {

    private UserRepository userRepository;
    private RegisterUserUseCase registerUserUseCase;

    @Before
    public void setUp() {
        this.userRepository = new InMemoryUsuarioRepository();
        this.registerUserUseCase = new RegisterUserUseCase(this.userRepository);

    }

    @Test
    public void RegisterUserValid() throws Exception {

        String name = "nycolas";
        String email = "nycolas@gmail.com";
        String password = "123";
        Function function_user = ADMINISTRADOR;

        RegisterUserDTO dto = new RegisterUserDTO(name, email, password, function_user);

        User u = this.registerUserUseCase.execute(dto);

        TestCase.assertEquals("nycolas", u.getNome());
        TestCase.assertEquals("nycolas@gmail.com", u.getEmail());
        TestCase.assertEquals(function_user.ADMINISTRADOR, u.getFuncao_usuario());

    }

    @Test
    public void TesteRegistrarUserEmailExistente() {

        String name = "nycolas";
        String email = "nycolas@gmail.com";
        String password = "123";
        Function function_user = ADMINISTRADOR;

        User usuario = new User(name, email, email, function_user);

        this.userRepository.create(usuario);
        RegisterUserDTO dto = new RegisterUserDTO(name, email, password, function_user);

        try {
            User u = this.registerUserUseCase.execute(dto);
        } catch (Exception ex) {
            TestCase.assertEquals("Usuario ja existe", ex.getMessage());
        }

    }

}
