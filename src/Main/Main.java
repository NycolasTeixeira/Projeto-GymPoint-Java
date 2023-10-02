package Main;

import Entities.User;
import Enums.Function;
import Repositories.Hibernate.HibernateUsuarioRepository;
import io.github.cdimascio.dotenv.Dotenv;
import Repositories.UserRepository;

public class Main {

    public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        UserRepository repository = new HibernateUsuarioRepository();
        User u = repository.create(new User("Lucas", "lucasbn@gmail.com", "123", Function.USUARIO));
        System.out.println(u.getNome());
    }

}
