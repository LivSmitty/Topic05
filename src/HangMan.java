import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.awt.geom.Arc2D;

/**
 * Created by scott_000 on 10/2/2016.
 */
public class HangMan extends Application{

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //create bottom arc
        Shape arc1 = new Arc(80, 225, 50, 50, 0, 180);
        arc1.setFill(Color.TRANSPARENT);
        arc1.setStroke(Color.BLACK);
        pane.getChildren().add(arc1);

        //line up from arc - main pole
        Line line1 = new Line(80, 175, 80, 40);
        line1.setStroke(Color.BLACK);
        pane.getChildren().add(line1);

        //top line, extends from main pole
        Line line2 = new Line(80, 40, 175, 40);
        line2.setStroke(Color.BLACK);
        pane.getChildren().add(line2);

        //small line horizontal line, attaches to head
        Line line3 = new Line(175, 40, 175, 60);
        line3.setStroke(Color.BLACK);
        pane.getChildren().add(line3);

        //head
        Circle circle = new Circle();
        circle.setCenterX(175);
        circle.setCenterY(90);
        circle.setRadius(30);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.TRANSPARENT);
        pane.getChildren().add(circle);

        //Hangman's body
        Line line4 = new Line(175, 120, 175,175);
        line4.setStroke(Color.BLACK);
        pane.getChildren().add(line4);

        //right leg
        Line line5 = new Line(175, 175, 200, 200);
        line5.setStroke(Color.BLACK);
        pane.getChildren().add(line5);


        //left leg
        Line line6 = new Line(175, 175, 155, 200);
        line6.setStroke(Color.BLACK);
        pane.getChildren().add(line6);

        //right arm
        Line line7 = new Line(175, 130, 200, 150);
        line7.setStroke(Color.BLACK);
        pane.getChildren().add(line7);

        //left arm
        Line line8 = new Line(175, 130, 150, 150);
        line8.setStroke(Color.BLACK);
        pane.getChildren().add(line8);

        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Hang Man");
        primaryStage.setScene(scene);
        primaryStage.show();



    }


}
