package Main;

import Desktop.Views.*;
import io.github.cdimascio.dotenv.Dotenv;

public class Main {

    public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
