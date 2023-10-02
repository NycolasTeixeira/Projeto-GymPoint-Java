package Repositories.InMemory;

import Entities.User;
import java.util.ArrayList;
import Repositories.UserRepository;

public class InMemoryUsuarioRepository implements UserRepository {

    private final ArrayList<User> usuarios = new ArrayList<>();

    @Override
    public User create(User usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    @Override
    public User buscarPorEmail(String emai) {
        for (User usuario : this.usuarios) {
            if (usuario.getEmail().equals(emai)) {
                return usuario;
            }
        }
        return null;
    }

}
