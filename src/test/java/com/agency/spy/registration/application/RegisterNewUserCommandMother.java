package com.agency.spy.registration.application;

import com.agency.spy.registration.application.registration.RegisterNewUserCommand;
import com.agency.spy.registration.domain.*;

public final class RegisterNewUserCommandMother {
    public static RegisterNewUserCommand create(UserRegistrationId id, UserRegistrationName name, UserRegistrationEmail email, UserRegistrationPassword password, UserRegistrationRole role, UserRegistrationStatus status) {
        return new RegisterNewUserCommand(
            id.value(),
            name.value(),
            email.value(),
            password.value(),
            role.toString(),
            status.toString()
        );
    }

    public static RegisterNewUserCommand random() {
        return create(
            UserRegistrationIdMother.random(),
            UserRegistrationNameMother.random(),
            UserRegistrationEmailMother.random(),
            UserRegistrationPasswordMother.random(),
            UserRegistrationRoleMother.random(),
            UserRegistrationStatusMother.create("ACTIVE")
        );
    }
}
