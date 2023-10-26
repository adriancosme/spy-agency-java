package com.agency.spy.registration.domain;

import com.agency.spy.shared.domain.MotherCreator;

public final class UserRegistrationNameMother {
    public static UserRegistrationName create(String value) {
        return new UserRegistrationName(value);
    }
    public static UserRegistrationName random() {
        return create(MotherCreator.random().name().firstName());
    }
}
