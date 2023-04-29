package org.example;

public class LoginProxy implements Access {
    private Access user = new Login();

    @Override
    public boolean access(Credencial credencial) {
        if (!inExpired(credencial)) {
            return true;
        }
        return user.access(credencial);
    }

    @Override
    public boolean inExpired(Credencial credencial) {
        return user.inExpired(credencial);
    }
}
