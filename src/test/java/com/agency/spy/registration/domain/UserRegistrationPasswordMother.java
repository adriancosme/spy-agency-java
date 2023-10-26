package com.agency.spy.registration.domain;

import com.agency.spy.shared.domain.MotherCreator;

public final class UserRegistrationPasswordMother {

    public static UserRegistrationPassword create(String value) {
        return new UserRegistrationPassword(value);
    }
    public static UserRegistrationPassword random() {
        return create(MotherCreator.random().internet().password());
    }
}
