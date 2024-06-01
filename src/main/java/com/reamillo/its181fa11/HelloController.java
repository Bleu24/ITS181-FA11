package com.reamillo.its181fa11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    //Initialize variables
    @FXML
    private TextField hoursField;
    @FXML
    private TextField dependentsField;
    @FXML
    public ChoiceBox<String> roleField = new ChoiceBox<>();
    private String[] role = {"Analyst", "Programmer", "Tester"};
    private Stage stage;
    private Scene scene;

    //Initializes the singleton
    InputSingleton data = InputSingleton.getInstance();

    @FXML
    public void onCalculateClick(ActionEvent actionEvent) throws IOException {

        //sets values for the singleton to pass it to ReceiptController
        data.setDependent(Integer.parseInt(dependentsField.getText()));
        data.setRole(roleField.getValue());
        data.setGross(Integer.parseInt(hoursField.getText()));
        data.setFee(data.getGross());
        data.setSSD(data.getGross());
        data.setTax(data.getGross(), data.getUserDep());
        data.setTotDed(data.getFee(), data.getSSD(), data.getTax());
        data.setNetPay(data.getGross(), data.getTotDed());

        // Creates a new pane (a receipt pane)
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load((getClass().getResource("receipt.fxml")));
        scene = new Scene(root);
        stage.setTitle("Receipt");
        stage.setScene(scene);
        stage.show();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roleField.getItems().addAll(role);
    }
}



