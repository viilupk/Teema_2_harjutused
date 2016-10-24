import javafx.application.Application;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.text.CollationKey;

/**
 * Created by Admin on 23.10.2016.
 */
public class Harjutus1_lipud extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox ();
        Scene lipud = new Scene (vbox, 300, 400,Color.ANTIQUEWHITE);
        primaryStage.setScene(lipud);
        primaryStage.show();

        Rectangle sinine = new Rectangle (50, 50, 165, 35);
        sinine.setFill(Color.BLUE);

        Rectangle must = new Rectangle(50,85, 165,35);
        must.setFill(Color.BLACK);

        Rectangle valge = new Rectangle(50, 120, 165, 35);
        valge.setFill(Color.WHITE);



        Rectangle jaapanipõhi = new Rectangle(50, 200, 165, 110);
        jaapanipõhi.setFill(Color.WHITE);

        Circle punane = new Circle(132, 255, 37);
        punane.setFill(Color.RED);

        Pane pane = new Pane();
        pane.getChildren().addAll(sinine, must, valge, jaapanipõhi, punane);
        Scene sesStseen = new Scene (pane, 300, 400, Color.ANTIQUEWHITE);
        primaryStage.setScene(sesStseen);









    }
}
