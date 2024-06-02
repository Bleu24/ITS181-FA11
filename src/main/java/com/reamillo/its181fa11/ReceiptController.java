package com.reamillo.its181fa11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReceiptController implements Initializable {

    @FXML
    public Label roleText;
    @FXML
    public Label grossText;
    @FXML
    public Label feeText;
    @FXML
    public Label ssdText;
    @FXML
    public Label taxText;
    @FXML
    public Label totText;
    @FXML
    public Label netText;

    InputSingleton data = InputSingleton.getInstance();
    @FXML
    private Button returnButton;

    @FXML
    private Stage stage;
    private Scene scene;

    @Deprecated
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roleText.setText(data.getUserRole());
        grossText.setText(String.valueOf(data.getGross()));
        feeText.setText(String.valueOf(data.getFee()));
        ssdText.setText(String.valueOf(data.getSSD()));
        taxText.setText(String.valueOf(data.getTax()));
        totText.setText(String.valueOf(data.getTotDed()));
        netText.setText(String.valueOf(data.getNetPay()));
    }

    @FXML
    public void onReturnClicked(ActionEvent actionEvent) throws IOException {
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load((getClass().getResource("hello-view.fxml")));
        scene = new Scene(root);
        stage.setTitle("Receipt");
        stage.setScene(scene);
        stage.show();
    }

}
