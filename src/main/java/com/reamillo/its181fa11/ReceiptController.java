package com.reamillo.its181fa11;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;

public class ReceiptController implements Initializable {

    public Label roleText;
    public Label grossText;
    public Label feeText;
    public Label ssdText;
    public Label taxText;
    public Label totText;
    public Label netText;

    InputSingleton data = InputSingleton.getInstance();
    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roleText.setText(data.getUserRole());
        grossText.setText(String.valueOf(data.getGross()));
        feeText.setText(String.valueOf(data.getFee()));
        ssdText.setText(String.valueOf(data.getSSD()));
        taxText.setText(String.valueOf(data.getTax()));
        totText.setText(String.valueOf(data.getTotDed()));
        netText.setText(String.valueOf(data.getNetPay()));
    }
}
