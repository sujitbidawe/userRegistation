package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    String namePattern = "^[A-Z][a-z]{2,}$";
    public Boolean checkName(String firstName) {
        return Pattern.matches(namePattern, firstName);
    }
}
