import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Admin on 23.10.2016.
 */
public class JavaFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Scene login = new Scene(vbox, 300, 200);
        primaryStage.setScene(login);
        primaryStage.show();

        Label pealkiriKasutajanimi = new Label("Palun sisesta kasutajanimi");
        TextField kasutajanimiField = new TextField();
        //Button submitButton = new Button("Login");
        //vbox.getChildren().addAll(pealkiriKasutajanimi, kasutajanimiField, submitButton);
        Label pealkiriParool = new Label ("Palun sisesta parool");
        TextField paroolField = new TextField();
        Button submitButton = new Button("Login");

        vbox.getChildren().addAll(pealkiriKasutajanimi, kasutajanimiField, pealkiriParool,  paroolField, submitButton);

        Circle ringpunane = new Circle (50);
        ringpunane.setFill(Color.RED);
        Circle ringkollane = new Circle (100);
        ringkollane.setFill(Color.YELLOW);
        ringkollane.setStroke(Color.BLACK);
        ringkollane.setStrokeWidth(5);
        ringpunane.setStroke(Color.BLACK);
        ringpunane.setStrokeWidth(5);

        ringkollane.setCenterX(150);
        ringkollane.setCenterY(150);

        ringpunane.setCenterY(150);
        ringpunane.setCenterX(150);

        Pane pane = new Pane ();
        pane.getChildren().add(ringkollane);
        pane.getChildren().add(ringpunane);
        Scene seesStseen = new Scene(pane, 300, 300);


        submitButton.setOnAction(event -> {
            String kasutajanimi = kasutajanimiField.getText();
            String parool = paroolField.getText();
            if (kasutajanimi.equals("Username") && parool.equals("Password" )){
                System.out.println("Pass on õige");
                primaryStage.setScene(seesStseen);
            } else {
                System.out.println("Pass on vale");
                VBox vbox2 = new VBox();
                Scene error = new Scene(vbox2, 300, 200);
                primaryStage.setScene(error);
                primaryStage.show();

                Label erroritekst = new Label("Vale kasutajanimi või parool. Ligipääs piiratud");
                vbox2.getChildren().addAll(erroritekst);
                primaryStage.show();


            }
        });




    }
}
