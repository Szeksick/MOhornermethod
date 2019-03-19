package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    @FXML private TextField inx;
    @FXML private TextField polynominal;
    @FXML private TableView resultab;

    private String polynom;

    public void Calculate(ActionEvent e) {
       float x = Float.parseFloat(inx.getText());
        polynom = polynominal.getText();
        //-22x^2+3x^1+6
        String[] parts = polynom.split("x\\^\\d+\\+?");
        for (String part : parts) {
            System.out.print(Float.parseFloat(part)+" ");
        }
        System.out.println();
        System.out.print(Float.parseFloat(parts[0])+" ");
        for(int i=1;i<parts.length+1;i++) {
            System.out.print(Float.parseFloat(parts[i-1])*x+" ");
        }
        System.out.println();

//        //columns
//        ArrayList<TableColumn> cols = new ArrayList<TableColumn>();
//        int i = 0;
//        for (String part : parts) {
//            cols.add(new TableColumn(toString(i)));
//            i++;
//        }
//        resultab.getColumns().addAll(cols);

    }
}
