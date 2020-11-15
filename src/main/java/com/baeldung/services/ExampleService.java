package com.baeldung.services;

import com.baeldung.requestresponsebody.LoginForm;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public boolean fakeAuthenticate(LoginForm lf) {
        return true;
    }
}