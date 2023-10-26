package com.agency.spy.registration.domain;

import com.agency.spy.registration.application.registration.RegisterNewUserCommand;

public class UserRegistrationMother {
    public static UserRegistration create(
        UserRegistrationId id,
        UserRegistrationName name,
        UserRegistrationEmail email,
        UserRegistrationPassword password,
        UserRegistrationRole role,
        UserRegistrationStatus status
    ) {
        return UserRegistration.create(id, name, email, password, role, status);
    }

    public static UserRegistration fromRequest(RegisterNewUserCommand request) {
        return create(
            UserRegistrationIdMother.create(request.id()),
            UserRegistrationNameMother.create(request.name()),
            UserRegistrationEmailMother.create(request.email()),
            UserRegistrationPasswordMother.create(request.password()),
            UserRegistrationRoleMother.create(request.role()),
            UserRegistrationStatusMother.create(request.status())
        );
    }

    public static UserRegistration random() {
        return create(
            UserRegistrationIdMother.random(),
            UserRegistrationNameMother.random(),
            UserRegistrationEmailMother.random(),
            UserRegistrationPasswordMother.random(),
            UserRegistrationRoleMother.random(),
            UserRegistrationStatus.ACTIVE
        );
    }

    public static UserRegistration withRole(UserRegistrationRole role) {
        return create(
            UserRegistrationIdMother.random(),
            UserRegistrationNameMother.random(),
            UserRegistrationEmailMother.random(),
            UserRegistrationPasswordMother.random(),
            role,
            UserRegistrationStatus.ACTIVE
        );
    }

    public static UserRegistration withStatus(UserRegistrationStatus status) {
        return create(
            UserRegistrationIdMother.random(),
            UserRegistrationNameMother.random(),
            UserRegistrationEmailMother.random(),
            UserRegistrationPasswordMother.random(),
            UserRegistrationRoleMother.random(),
            status
        );
    }
}
