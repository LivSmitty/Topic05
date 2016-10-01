import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by scott_000 on 10/1/2016.
 */
public class BarGraph extends Application{

    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();

        Rectangle r1 = new Rectangle(25, 10, 20, 30);
        r1.setStroke(Color.RED);
        r1.setFill(Color.RED);


        pane.getChildren().add(new Text(80, 20, "Pojects - 20%"));
        pane.getChildren().add(r1);

        Rectangle r2 = new Rectangle(25, 50, 10, 30);
        r2.setStroke(Color.BLUE);
        r2.setFill(Color.BLUE);
        pane.getChildren().add(new Text(80, 67, "Quiz - 10%"));
        pane.getChildren().add(r2);

        Rectangle r3 = new Rectangle(25, 90, 30, 30);
        r3.setStroke(Color.GREEN);
        r3.setFill(Color.GREEN);
        pane.getChildren().add(new Text(80, 107, "Midterm - 30%"));
        pane.getChildren().add(r3);

        Rectangle r4 = new Rectangle(25, 130, 40, 30);
        r4.setStroke(Color.ORANGE);
        r4.setFill(Color.ORANGE);
        pane.getChildren().add(new Text(80, 157, "Final Exam - 40%"));
        pane.getChildren().add(r4);

        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
