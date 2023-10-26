package com.agency.spy.registration.domain;

import java.util.Random;

public final class UserRegistrationRoleMother {
    private static final Random random = new Random();

    public static UserRegistrationRole create(String value) {
        return UserRegistrationRole.valueOf(value);
    }

    public static UserRegistrationRole random() {
        UserRegistrationRole[] roles = UserRegistrationRole.values();
        return create(roles[random.nextInt(roles.length)].toString());
    }
}
