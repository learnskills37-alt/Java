import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegistrationPage extends Application
        implements EventHandler<ActionEvent> {

    Label message = new Label();

    public void start(Stage stage) {
        Label nameLabel = new Label("Enter your name:");
        TextField nameField = new TextField();

        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group);

        Label courseLabel = new Label("Select course:");
        ComboBox<String> course = new ComboBox<>();
        course.getItems().addAll("Java", "Python", "C++");

        CheckBox terms = new CheckBox("Accept terms and conditions");

        Button submit = new Button("Submit");
        submit.setOnAction(this);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
            nameLabel, nameField,
            male, female,
            courseLabel, course,
            terms, submit, message
        );

        Scene scene = new Scene(layout, 350, 400);
        stage.setTitle("Registration Page");
        stage.setScene(scene);
        stage.show();
    }

    public void handle(ActionEvent event) {
        message.setText("Registration successful");
    }

    public static void main(String[] args) {
        launch(args);
    }
}