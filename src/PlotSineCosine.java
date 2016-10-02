import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/**
 * Created by scott_000 on 10/1/2016.
 */
public class PlotSineCosine extends Application {
    @Override

    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("Plot");
        primaryStage.setScene(scene);
        primaryStage.show();

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++){
            list.add(x + 200.0);
            list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));

        }
        Line line1 = new Line(list.get(0),list.get(1), list.get(2), list.get(3));
        line1.setStroke(Color.RED);
        pane.getChildren().add(line1);
        Line line2 = new Line(list.get(4),list.get(5), list.get(6), list.get(7));
        line2.setStroke(Color.BLUE);
        pane.getChildren().add(line2);

    }


    public static void main(String[] args) {

        Application.launch(args);

    }

}
