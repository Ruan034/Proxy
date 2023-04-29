package org.example;

import java.util.Random;

public class Login implements Access{
    @Override
    public boolean access(Credencial credencial) {
        return new SystemCredencial(credencial).canAccess();
    }

    @Override
    public boolean inExpired(Credencial credencial) {
        final Random random = new Random();
        final int nextInt = random.nextInt(2);
        return nextInt == 0;
    }
}
