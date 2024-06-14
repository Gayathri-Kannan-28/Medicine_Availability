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

public class logincontroller {
    private final static String HOST = "localhost";
    private final static int PORT = 27017;
    @FXML
    private TextField User_name;
    @FXML
    private PasswordField password;

   public logincontroller() {
   }
   /*     MongoClient mongoClient = new MongoClient(HOST, PORT);


        MongoDatabase mongoDatabase = mongoClient.getDatabase("Project");

        //  create a collection
        MongoCollection coll = mongoDatabase.getCollection("login.");
        //  call the find all method
        MongoCursor<Document> cursor = coll.find().iterator();


        @Override
        public void initialize (URL location, ResourceBundle resources){
            table.setEditable(true);

            try {


                    Document doc = cursor.next();
                    Username = doc.getString("User_name");
                    Password = doc.getString("password");

            }

        }
    }*/
                @FXML
                void onlogin (ActionEvent event) throws IOException {
                    String Username = User_name.getText();
                    String Password = password.getText();


                    try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {

                        MongoDatabase database = mongoClient.getDatabase("Project");


                        Document userDocument = new Document()
                                .append("UserName", Username)
                                .append("Password", Password);


                        database.getCollection("login").insertOne(userDocument);


                        System.out.println("Username and password stored in MongoDB!");


                        FXMLLoader signupfxmlloader = new FXMLLoader(this.getClass().getResource("expiry.fxml"));
                        Stage stage = new Stage();
                        stage.setScene(new Scene((Parent) signupfxmlloader.load(), 859.0, 486.0));
                        stage.show();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }
            };
