package com.agency.spy.shared.infrastructure;

import com.agency.spy.shared.UuidGenerator;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public abstract class UnitTestCase {
    protected UuidGenerator uuidGenerator;

    @BeforeEach
    protected void setUp() {
        uuidGenerator = mock(UuidGenerator.class);
    }

    public void shouldGenerateUuid(String uuid) {
        when(uuidGenerator.generate()).thenReturn(uuid);
    }

    public void shouldGenerateUuids(String uuid, String... others) {
        when(uuidGenerator.generate()).thenReturn(uuid, others);
    }
}
