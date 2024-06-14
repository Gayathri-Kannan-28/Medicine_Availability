//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo8;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccount {
    @FXML
    private Button Login;
    @FXML
    private Button Signup;
    @FXML
    private AnchorPane anchor;
    @FXML
    private Text acounttext;
    @FXML
    private Text enrtycredits;
    @FXML
    private Text haveaccounttext;
    @FXML
    private ImageView image;

    public CreateAccount() {
    }

    @FXML
    public void login() throws IOException {
        FXMLLoader entranfxmlloader = new FXMLLoader(this.getClass().getResource("hello-view.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene((Parent)entranfxmlloader.load(), 859.0, 486.0));
        stage.show();
    }

    @FXML
    public void signup() throws IOException {
        FXMLLoader createfxmlloader = new FXMLLoader(this.getClass().getResource("Hello.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene((Parent)createfxmlloader.load(), 859.0, 486.0));
        stage.show();
    }
}
