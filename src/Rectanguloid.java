import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class Rectanguloid extends Application{

    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();

        Rectangle r1 = new Rectangle(80, 20, 60, 50);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.TRANSPARENT);
        pane.getChildren().add(r1);

        Rectangle r2 = new Rectangle(60, 30, 60, 50);
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.TRANSPARENT);
        pane.getChildren().add(r2);

        Line line1 = new Line(80, 20, 60, 30);
        line1.setStroke(Color.BLACK);
        pane.getChildren().add(line1);

        Line line2 = new Line(140, 20, 120, 30);
        line2.setStroke(Color.BLACK);
        pane.getChildren().add(line2);

        Line line3 = new Line(80, 70, 60, 80);
        line3.setStroke(Color.BLACK);
        pane.getChildren().add(line3);

        Line line4 = new Line(140, 70, 120, 80);
        line4.setStroke(Color.BLACK);
        pane.getChildren().add(line4);

        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("Rectanguloid");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
