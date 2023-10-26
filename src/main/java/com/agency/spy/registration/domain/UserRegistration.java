package com.agency.spy.registration.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public final class UserRegistration {

    private final UserRegistrationId id;

    private final UserRegistrationName name;

    private final UserRegistrationEmail email;

    private final UserRegistrationPassword password;

    private final UserRegistrationRole role;

    private final UserRegistrationStatus status;

    public UserRegistration(UserRegistrationId id, UserRegistrationName name, UserRegistrationEmail email, UserRegistrationPassword password, UserRegistrationRole role, UserRegistrationStatus status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    private UserRegistration() {
        this.id = null;
        this.name = null;
        this.email = null;
        this.password = null;
        this.role = null;
        this.status = null;
    }

    public static UserRegistration create(UserRegistrationId id, UserRegistrationName name, UserRegistrationEmail email, UserRegistrationPassword password, UserRegistrationRole role, UserRegistrationStatus status) {
        return new UserRegistration(id, name, email, password, role, status);
    }
}
