package com.agency.spy.registration.domain;

import com.agency.spy.shared.domain.UuidMother;

public final class UserRegistrationIdMother {
    public static UserRegistrationId create(String value) {
        return new UserRegistrationId(value);
    }

    public static UserRegistrationId random() {
        return create(UuidMother.random());
    }
}
