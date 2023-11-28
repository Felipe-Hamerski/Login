package com.felipehamerski.login.dao;

import com.felipehamerski.login.model.Usuário;
import java.util.ArrayList;

public class UserDAO {
    private ArrayList<Usuário> users = new ArrayList<>();
    
    public void addUser(Usuário usuário){
        users.add(usuário);
    }
    
    public void printUsers() {
        for (Usuário usuário: users){
            System.out.println("Usuário: "+usuário.getUser());
            System.out.println("Senha: "+usuário.getPassword());
        }
    }
}