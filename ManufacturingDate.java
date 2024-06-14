package com.example.demo8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class ManufacturingDate {

    @FXML
    public DatePicker eg;

    @FXML
    private Label enter;

    @FXML
    private Button submit;

    @FXML
    public Label label;

    public void getDate(ActionEvent actionEvent){
        LocalDate date =eg.getValue();
        String Dayname=date.getMonth().toString();
        label.setText("The Expiry Date ends at this Year April");
    }

}
