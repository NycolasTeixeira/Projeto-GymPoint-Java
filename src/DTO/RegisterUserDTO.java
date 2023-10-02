package DTO;

import Enums.Function;

public class RegisterUserDTO {
    private final String name;
    private final String email;
    private final String password;
    private final Function  function_user;

    public RegisterUserDTO(String name, String email, String password, Function function_user) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.function_user = function_user;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Function getFunction_user() {
        return function_user;
    }
    
    
    
}
