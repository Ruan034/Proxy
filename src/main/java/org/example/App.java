package org.example;

public class App {
    public static void main(String[] args){
        Access login = new LoginProxy();
        final Credencial wrongCredencial = new Credencial("Ruan pablo", "123");
        final Credencial righCredencial = new Credencial("RuanADM", "syspwd");
        loginStatus(login, wrongCredencial);
        loginStatus(login, righCredencial);

    }
    private static void loginStatus(Access login, final Credencial credencial) {
        boolean access = login.access(credencial);
        if (access){
            System.out.println("login in: true");
        }else {
            System.out.println("login in: false");
        }
    }
}
