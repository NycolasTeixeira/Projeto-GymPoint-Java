package Repositories;

import Entities.User;

public interface UserRepository {
    public User create(User user);
    public User buscarPorEmail(String emai); 
}
