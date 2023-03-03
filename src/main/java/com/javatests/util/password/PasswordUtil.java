package com.javatests.util.password;

import static com.javatests.util.password.PasswordUtil.SecurityLevel.*;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){

        if(password.length() < 8){
            return WEAK;
        }

        //Esta expresion regular indica que el password contiene varias veces letras de la A a la Z
        if (password.matches("[a-zA-Z]+")){
            return WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")){
            return MEDIUM;
        }

        return STRONG;

    }

}
