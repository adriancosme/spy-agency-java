package com.agency.spy.registration.application;


import com.agency.spy.registration.RegistrationModuleUnitTestCase;
import com.agency.spy.registration.application.registration.RegisterNewUserCommand;
import com.agency.spy.registration.application.registration.RegisterNewUserCommandHandler;
import com.agency.spy.registration.application.registration.UserRegistrator;
import com.agency.spy.registration.domain.UserRegistration;
import com.agency.spy.registration.domain.UserRegistrationMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class RegisterNewUserTest extends RegistrationModuleUnitTestCase {
    private RegisterNewUserCommandHandler handler;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        handler = new RegisterNewUserCommandHandler(new UserRegistrator(encoder, repository));
    }

    @Test
    void create_a_valid_user() {
        RegisterNewUserCommand command = RegisterNewUserCommandMother.random();
        UserRegistration user = UserRegistrationMother.fromRequest(command);
        when(encoder.encode(user.getPassword().value())).thenReturn(user.getPassword().value());
        handler.handle(command);
        shouldHaveSaved(user);
    }
}
