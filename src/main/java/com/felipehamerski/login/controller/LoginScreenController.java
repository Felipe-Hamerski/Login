package com.felipehamerski.login.controller;

import com.felipehamerski.login.App;
import com.felipehamerski.login.dao.UserDAO;
import com.felipehamerski.login.model.Usuário;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginScreenController {

    @FXML
    private TextField emailTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Label msgLoggedLabel;

    @FXML
    private Hyperlink signUpHyperlink;

    @FXML
    private PasswordField userPasswordField;

    @FXML
    private TextField userTextField;

    @FXML
    public void createAccount(ActionEvent event) throws IOException {
        App.setRoot("SignUpScreen");
    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        for (Usuário user: UserDAO.getUsers()){
            if (userTextField.getText().equals("Salomão") && emailTextField.getText().equals("salomao@gmail.com") && userPasswordField.getText().equals("123456")){
            msgLoggedLabel.setText("Login realizado com sucesso");
            App.setRoot("UsersScreen");
        }else{
            msgLoggedLabel.setText("Usuário ou senha incorretos, tente novamente");
            }
        }
    }
}
    
