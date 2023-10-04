package DTO;

import org.mindrot.jbcrypt.BCrypt;

public class LoginUserDTO {
    private final String email;
    private final String password;

    public LoginUserDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
