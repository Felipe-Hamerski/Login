package com.felipehamerski.login.controller;

import com.felipehamerski.login.App;
import com.felipehamerski.login.dao.UserDAO;
import com.felipehamerski.login.model.Usuário;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpScreenController {

    @FXML
    private PasswordField confirmationPasswordField;

    @FXML
    private TextField emailTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Label msgLoggedLabel;

    @FXML
    private PasswordField userPasswordField;

    @FXML
    private TextField userTextField;

    private Usuário user;
    private UserDAO userDAO;
    
    @FXML
    public void cadastrar(ActionEvent event) throws IOException {
        if(userPasswordField.getText().equals(confirmationPasswordField.getText())){
            user = new Usuário(userTextField.getText(), userPasswordField.getText());
            userDAO = new UserDAO();
            userDAO.addUser(user);
            System.out.println("Usuário cadastrado com sucesso");
            App.setRoot("LoginScreen");
        }
    }
}