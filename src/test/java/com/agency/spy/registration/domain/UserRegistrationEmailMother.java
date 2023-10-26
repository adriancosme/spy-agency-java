package com.agency.spy.registration.domain;

import com.agency.spy.shared.domain.EmailMother;

public class UserRegistrationEmailMother {
    public static UserRegistrationEmail create(String value) {
        return new UserRegistrationEmail(value);
    }
    public static UserRegistrationEmail random() {
        return create(EmailMother.random());
    }
}
