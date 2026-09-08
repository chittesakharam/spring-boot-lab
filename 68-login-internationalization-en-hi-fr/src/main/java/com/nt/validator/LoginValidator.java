package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Login;

@Component
public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Login.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Login login = (Login) target;

        // Username Validation
        if (login.getUsername() == null || login.getUsername().trim().isEmpty()) {
            errors.rejectValue("username", "msg.unamereq");
        }

        // Password Validation
        if (login.getPassword() == null || login.getPassword().trim().isEmpty()) {
            errors.rejectValue("password", "msg.passreq");
        }

        // Stop further validation if any field errors exist
        if (errors.hasErrors()) {
            return;
        }

        // Check Invalid Credentials
        if (!login.getUsername().equals("admin") ||
            !login.getPassword().equals("admin123")) {

            errors.reject("msg.validate");
        }
    }
}