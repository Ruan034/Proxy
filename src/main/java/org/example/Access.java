package org.example;

public interface Access {
    public  boolean access(Credencial credencial);

    public  boolean inExpired(Credencial credencial);

}
