package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField inx;
    @FXML
    private TextField polynominal;
    private String polynom = polynominal.getText();

    public void Calculate(ActionEvent e) {

        System.out.println();

    }
}
