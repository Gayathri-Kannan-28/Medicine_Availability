package com.example.demo8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Expiry implements Initializable {
        @FXML
        private TableView<Expiry1> airlineTableView;

        @FXML
        private Label airlinedetails;

        @FXML
        private TableColumn<Expiry1, String> benifits;

        @FXML
        private Button dharsh;

        @FXML
        private TableColumn<Expiry1, String> dose;

        @FXML
        private TableColumn<Expiry1, String> expiryduration;

        @FXML
        private TableColumn<Expiry1, String> manudetails;

        @FXML
        private TableColumn<Expiry1, String> medicinename;

        @FXML
        private TableColumn<Expiry1, String> side;

        @FXML
        void onnext(ActionEvent event) throws IOException {

            FXMLLoader expiryfxmlloader = new FXMLLoader(this.getClass().getResource("manufacture_date.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene((Parent)expiryfxmlloader.load(), 859.0, 486.0));
            stage.show();
        }
    ObservableList<Expiry1> list= FXCollections.observableArrayList(
            new Expiry1("paracitamol","liver damage","China","2Mon","250mg","relief fever"),
            new Expiry1("amoxicillin","allergy","africa","1mon","200mg","relief ear_inf"),
            new Expiry1("ibuprofen","heart burn","nepal","3mon","500mg","reduce infla")
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        medicinename.setCellValueFactory(new PropertyValueFactory<Expiry1,String>("medicine_name"));
        side.setCellValueFactory(new PropertyValueFactory<Expiry1,String>("side_"));
        manudetails.setCellValueFactory(new PropertyValueFactory<Expiry1,String>("menudetails"));
        expiryduration.setCellValueFactory(new PropertyValueFactory<Expiry1,String>("expiry"));
        dose.setCellValueFactory(new PropertyValueFactory<Expiry1,String>("dose_"));
        benifits.setCellValueFactory(new PropertyValueFactory<Expiry1,String>("benifits"));
        airlineTableView.setItems(list);
    }
};
