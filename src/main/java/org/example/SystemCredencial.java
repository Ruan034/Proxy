package org.example;

public class SystemCredencial {
    private Credencial credencial;
    private String username;
    private String password;

    public SystemCredencial(Credencial credencial){
        this.credencial = credencial;
        this.username = "sysAdmin";
        this.password = "syspwd";
    }
    public boolean canAccess(){
        final boolean isUsernameOK = username.equals(credencial.getUsername());
        final boolean isPasswordOK = password.equals(credencial.getPassword());
        boolean sucess = isUsernameOK && isPasswordOK;
        if (sucess){

        }
        return sucess;
    }
}
