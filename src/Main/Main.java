package Main;

import Desktop.Views.*;
import Entities.Gym;
import Repositories.GymRepository;
import Repositories.Hibernate.HibernateGymRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.hibernate.Hibernate;

public class Main {

    public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
       new Login().setVisible(true);
       
    
    }

}
