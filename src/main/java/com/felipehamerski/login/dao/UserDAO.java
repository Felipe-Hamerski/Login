package com.felipehamerski.login.dao;

import com.felipehamerski.login.model.Usuário;
import java.util.ArrayList;

public class UserDAO {
    private static ArrayList<Usuário> users = new ArrayList<>();
    
    public void addUser(Usuário usuário){
        users.add(usuário);
    }

    public static ArrayList<Usuário> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<Usuário> users) {
        UserDAO.users = users;
    }
    
    public void printUsers() {
        for (Usuário usuário: users){
            System.out.println("Usuário: "+usuário.getUser());
            System.out.println("Senha: "+usuário.getPassword());
        }
    }
}