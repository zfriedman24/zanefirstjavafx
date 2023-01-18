

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Construct the controls
        Label label1 = new Label ("Lets add some GUI controls");
        Label label2 = new Label("How can we do this?");
        Label label3 = new Label("We'll start with labels");
        Label label4 = new Label("We'll start with Button");
        label1.setFont(new Font("Arial", 24));
        Button pressMe = new Button("Press Me!");
        ListView listView = new ListView();
        listView.getItems().add("Item 1");
        listView.getItems().add("Item 2");
        listView.getItems().add("Item 3");
        primaryStage.setTitle("Color Picker");
            ColorPicker colorPicker = new ColorPicker();
            Color value = colorPicker.getValue();
            DatePicker datePicker = new DatePicker();
        primaryStage.setTitle("JavaFX App");
            ProgressBar progressBar = new ProgressBar(0);
                progressBar.setProgress(0.5);
        primaryStage.setTitle("Next Up,");
            TextArea textArea = new TextArea();
        primaryStage.setTitle("ChoiceBox Experiment 1");
            ChoiceBox choiceBox = new ChoiceBox();
                choiceBox.getItems().add("Labels");
                choiceBox.getItems().add("Buttons");
        pressMe.setOnAction(actionEvent -> {
            label2.setText("We did it!");
            label3.setText("Congratulations");
        });
        pressMe.setOnAction(action -> {
            LocalDate value1 = datePicker.getValue();
        });

        // Layout the controls
        HBox hbox1 = new HBox(progressBar, label1, label2, label3, textArea);
        VBox vbox1 = new VBox(hbox1, label4, pressMe, choiceBox, colorPicker, listView);
        Scene scene = new Scene(vbox1, 1000, 500);

        // Open the stage curtains
        primaryStage.setTitle("My First JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}