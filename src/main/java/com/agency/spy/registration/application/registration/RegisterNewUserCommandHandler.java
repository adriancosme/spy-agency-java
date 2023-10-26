package com.agency.spy.registration.application.registration;


import com.agency.spy.registration.domain.*;
import com.agency.spy.shared.bus.CommandHandler;
import com.agency.spy.shared.domain.Service;

@Service
public final class RegisterNewUserCommandHandler implements CommandHandler<RegisterNewUserCommand> {
    private final UserRegistrator registrator;
    public RegisterNewUserCommandHandler(UserRegistrator registrator) {
        this.registrator = registrator;
    }

    @Override
    public void handle(RegisterNewUserCommand command) {
        UserRegistrationId id = new UserRegistrationId(command.id());
        UserRegistrationName name = new UserRegistrationName(command.name());
        UserRegistrationEmail email = new UserRegistrationEmail(command.email());
        UserRegistrationPassword password = new UserRegistrationPassword(command.password());
        UserRegistrationRole role = UserRegistrationRole.valueOf(command.role());
        UserRegistrationStatus status = UserRegistrationStatus.valueOf(command.status());
        registrator.register(id, name, email, password, role, status);
    }
}
