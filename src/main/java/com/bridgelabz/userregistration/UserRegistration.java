package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    String namePattern = "^[A-Z][a-z]{2,}$";
    String emailPattern = "^([a-z]{1,}[0-9a-z]{0,}([_+-.]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$";
    String mobilePattern = "^[1-9]{1,3}[ ][1-9][0-9]{9}$";
    String passwordPattern = "^(?=.*\\d)(?=.*[A-Z]).{8,}$";

    public Boolean checkName(String firstName) {
        return Pattern.matches(namePattern, firstName);
    }

    public boolean checkEmail(String email) {
        return Pattern.matches(emailPattern, email);
    }

    public boolean checkMobile(String mobile) {
        return Pattern.matches(mobilePattern, mobile);
    }

    public boolean checkPassword(String password) {
        return Pattern.matches(passwordPattern, password);
    }
}
