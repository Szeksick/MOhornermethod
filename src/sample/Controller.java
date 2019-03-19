package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class Controller {
    @FXML private TextField inx;
    @FXML private TextField polynominal;
    @FXML private TextField resultinput;

    private String polynom;

    public void Calculate(ActionEvent e) {
        if (inx.getText() == null || inx.getText().trim().isEmpty() || polynominal.getText() == null || polynominal.getText().trim().isEmpty() ) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Błąd kalkulatora");
            alert.setHeaderText(null);
            alert.setContentText("Proszę upewnić się, że pola są uzupełnione");
            alert.showAndWait();
        }else {
            try {
                float x = Float.parseFloat(inx.getText());
                polynom = polynominal.getText();
                //wielomian rozdzielany do tablicy z wyrażenia regularnego
                String[] parts = polynom.split("x\\^\\d+\\+?");
                //Obliczenia metodą Hornera
                float result;
                result = Float.parseFloat(parts[0]);
                for (int i = 1; i < parts.length; i++) {
                    System.out.println(result);
                    result = result * x + Float.parseFloat(parts[i]);
                    }
                    resultinput.setText(String.valueOf(result));
                }
            catch (Exception exept) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Błąd kalkulatora");
                alert.setHeaderText(null);
                alert.setContentText("Proszę upewnić się, że pola są uzupełnione właściwie");
                alert.showAndWait();
            }
        }
    }
}
