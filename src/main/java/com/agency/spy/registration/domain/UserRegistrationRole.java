package com.agency.spy.registration.domain;

public enum UserRegistrationRole {
    BOSS("BOSS"),
    MANAGER("MANAGER"),
    HITMAN("HITMAN");

    String value;

    UserRegistrationRole(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
