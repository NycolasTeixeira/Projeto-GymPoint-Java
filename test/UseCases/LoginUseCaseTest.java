/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseCases;

import DTO.LoginUserDTO;
import Entities.User;
import Enums.Function;
import Repositories.InMemory.InMemoryUsuarioRepository;
import Repositories.UserRepository;
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
public class LoginUseCaseTest {

    private UserRepository usuarioRepository;
    private LoginUseCase loginUseCase;

    @Before
    public void setUp() {
        this.usuarioRepository = new InMemoryUsuarioRepository();
        this.loginUseCase = new LoginUseCase(this.usuarioRepository);
    }

    @Test
    public void TesteLoginValid() throws Exception {
        String email = "nycolas@exemplo.com";
        String senha = "123";
        String nome = "nycolas";
        Function f = Function.ADMINISTRADOR;

        User user = new User(nome, email, senha, f);

        this.usuarioRepository.create(user);

        LoginUserDTO dto = new LoginUserDTO(email, senha);
        User u = this.loginUseCase.execute(dto);

        TestCase.assertEquals("nycolas@exemplo.com", u.getEmail());
        TestCase.assertEquals("nycolas", u.getNome());
        TestCase.assertEquals(Function.ADMINISTRADOR, u.getFuncao_usuario());

    }

    @Test
    public void TesteLoginInvalid() {
        String email = "nycolas@exemplo.com";
        String senha = "123";

        try {
            LoginUserDTO dto = new LoginUserDTO(email, senha);
            User u = this.loginUseCase.execute(dto);
        } catch (Exception e) {
            TestCase.assertEquals("Usuário não cadastrado", e.getMessage());

        }

    }

    @Test
    public void tesLoginSenhaInvalid() {

        String email = "nycolas@exemplo.com";
        String senha = "123";
        String nome = "nycolas";
        Function f = Function.ADMINISTRADOR;

        User user = new User(nome, email, senha, f);

        this.usuarioRepository.create(user);

        try {
            LoginUserDTO dto = new LoginUserDTO(email, "1234");
            User u = this.loginUseCase.execute(dto);
        } catch (Exception e) {
            TestCase.assertEquals("Credenciais inválidas", e.getMessage());
        }

    }

}
