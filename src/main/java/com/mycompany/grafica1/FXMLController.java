package com.mycompany.grafica1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
//import javafx.scene.shape.Polygon;

public class FXMLController implements Initializable {

    @FXML
    private Canvas canvas;

    private GraphicsContext lienzo;
    boolean mostrar;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.GREEN);
        lienzo.strokeRect(10, 10, 60, 30);

    }

    @FXML
    private void handleButton2Action(ActionEvent event) {

        lienzo.setFill(Color.BLUE);
        lienzo.fillRect(80, 10, 100, 60);
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.RED);
        lienzo.strokeRect(80, 10, 100, 60);

    }

    @FXML
    private void handleButton3Action(ActionEvent event) {

        double x[] = {100, 150, 200};
        double y[] = {200, 125, 200};

        lienzo.setLineWidth(2);
        lienzo.setFill(Color.GREEN);
        lienzo.fillPolygon(x, y, 3);
        /*        lienzo.setStroke(Color.GREEN);
        lienzo.strokePolygon(x, y, 3);

        Polygon polygon = new Polygon();
        lienzo.setLineWidth(2);
        lienzo.setFill(Color.GREEN);
        polygon.getPoints().addAll(new Double[]{
            0.0, 0.0,
            202.0, 102.0,
            102.0, 202.0});
        Polygon polygon =new Polygon();
        polygon.getPoints().addAll(10d,10d,20d,5d,40d,10d,20d,150d);
        polygon.setFill(Color.GREEN);
        polygon.setStrokeWidth(2);
        polygon.setStroke(Color.BLACK); */ //pruebas de codigo que no me sirvio T_T
    }

    @FXML
    private void handleButton4Action(ActionEvent event) {

        double x[] = {250, 300, 350, 300};
        double y[] = {200, 150, 200, 250};

        lienzo.setLineWidth(2);
        lienzo.setFill(Color.rgb(0, 90, 10, .20));
        lienzo.fillPolygon(x, y, 4);
        lienzo.setStroke(Color.DARKRED);
        lienzo.strokePolygon(x, y, 4);
    }

    @FXML
    private void handleButton5Action(ActionEvent event) {

        lienzo = canvas.getGraphicsContext2D();

        double w = canvas.getWidth();

        double h = canvas.getHeight();

        lienzo.clearRect(2, 2, w - 3, h - 3);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        lienzo = canvas.getGraphicsContext2D();

        double w = canvas.getWidth();

        double h = canvas.getHeight();

        lienzo.clearRect(0, 0, w, h);

        lienzo.setStroke(new Color(.15, .15, .15, .95));

        lienzo.setLineWidth(2);

        lienzo.strokeRect(0, 0, w, h);

        mostrar = false;

    }
}
