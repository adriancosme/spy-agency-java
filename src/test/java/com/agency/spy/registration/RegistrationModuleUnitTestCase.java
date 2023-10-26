package com.agency.spy.registration;

import com.agency.spy.registration.domain.UserRegistration;
import com.agency.spy.registration.domain.UserRegistrationEmail;
import com.agency.spy.registration.domain.UserRegistrationRepository;
import com.agency.spy.shared.infrastructure.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.mockito.Mockito.*;

public class RegistrationModuleUnitTestCase extends UnitTestCase {
    protected PasswordEncoder encoder;
    protected UserRegistrationRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        encoder = mock(PasswordEncoder.class);
        repository = mock(UserRegistrationRepository.class);
    }

    public void shouldHaveSaved(UserRegistration user) {
        verify(repository, atLeastOnce()).save(user);
    }
}
