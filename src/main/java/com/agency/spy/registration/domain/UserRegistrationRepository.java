package com.agency.spy.registration.domain;

import java.util.Optional;

public interface UserRegistrationRepository {
    void save(UserRegistration user);
    Optional<UserRegistration> search(UserRegistrationEmail email);
}
