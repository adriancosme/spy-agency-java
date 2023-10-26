package com.agency.spy.registration.domain;

import java.util.Random;

public final class UserRegistrationStatusMother {
    private static final Random random = new Random();
    public static UserRegistrationStatus create(String value) {
        return UserRegistrationStatus.valueOf(value);
    }

    public static UserRegistrationStatus random() {
        UserRegistrationStatus[] roles = UserRegistrationStatus.values();
        return create(roles[random.nextInt(roles.length)].toString());
    }
}
