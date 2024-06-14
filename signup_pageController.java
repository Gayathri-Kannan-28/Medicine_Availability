//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo8;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.bson.Document;

import java.io.IOException;

public class signup_pageController {
    @FXML
    private TextField Username;
    @FXML
    private PasswordField password;

    @FXML
    private TextField otp;

    public signup_pageController() {
    }

    @FXML
    void successfully_creates(ActionEvent event) throws IOException {

        String User_name = Username.getText();
        String Password = password.getText();
        Integer OTP= Integer.valueOf(otp.getText());

        // Create a MongoDB client and connect to the database
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            // Access the desired database
            MongoDatabase database = mongoClient.getDatabase("Project");

            // Create a new document to store the username and password
            Document userDocument = new Document()
                    .append("UserName", User_name)
                    .append("Password", Password)
                    .append("OTP", OTP);

            // Insert the document into a collection
            database.getCollection("Signup").insertOne(userDocument);

            // Print a success message
            System.out.println("Username and password stored in MongoDB!");


            FXMLLoader signupfxmlloader = new FXMLLoader(this.getClass().getResource("expiry.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene((Parent) signupfxmlloader.load(), 859.0, 486.0));
            stage.show();
        }
    }
};

