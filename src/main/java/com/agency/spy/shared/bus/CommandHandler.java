package com.agency.spy.shared.bus;

public interface CommandHandler<T extends Command> {
    void handle(T command);
}
