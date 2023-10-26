package com.agency.spy.registration.domain;

import com.agency.spy.shared.DomainError;

public class EmailAlreadyExist extends DomainError {
    public EmailAlreadyExist(UserRegistrationEmail email) {
        super("email_already_exist", String.format("Email <%s> already exist", email.value()));
    }
}
