package com.agency.spy.registration.application.registration;

import com.agency.spy.registration.domain.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class UserRegistrator {
    private final PasswordEncoder encoder;
    private final UserRegistrationRepository repository;

    public UserRegistrator(PasswordEncoder encoder, UserRegistrationRepository repository) {
        this.encoder = encoder;
        this.repository = repository;
    }

    public void register(UserRegistrationId id, UserRegistrationName name, UserRegistrationEmail email, UserRegistrationPassword password, UserRegistrationRole role, UserRegistrationStatus status) {
        this.ensureUserIsNotAlreadyRegistered(email);
        String hashedPassword = this.encoder.encode(password.value());
        UserRegistration user = UserRegistration.create(id, name, email, new UserRegistrationPassword(hashedPassword), role, status);
        this.repository.save(user);
    }

    private void ensureUserIsNotAlreadyRegistered(UserRegistrationEmail email) {
        Optional<UserRegistration> user = this.repository.search(email);
        if (user.isPresent()) {
            throw new EmailAlreadyExist(email);
        }
    }
}
