package com.agency.spy.registration.application.registration;

import com.agency.spy.shared.bus.Command;

public record RegisterNewUserCommand(String id, String name, String email, String password, String role,
                                     String status) implements Command {
}
