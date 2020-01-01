package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTestSuite {

    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris");
        Mockito.verify(myPhone).launchApplication("Tetris");
    }
}