import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application
        implements EventHandler<ActionEvent> {

    TextField number1 = new TextField();
    TextField number2 = new TextField();
    Label result = new Label("Result:");

    Button add = new Button("+");
    Button subtract = new Button("-");
    Button multiply = new Button("*");
    Button divide = new Button("/");

    public void start(Stage stage) {
        number1.setPromptText("Enter first number");
        number2.setPromptText("Enter second number");

        add.setOnAction(this);
        subtract.setOnAction(this);
        multiply.setOnAction(this);
        divide.setOnAction(this);

        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(add, subtract, multiply, divide);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
            new Label("Simple Calculator"),
            number1, number2, buttons, result
        );

        Scene scene = new Scene(layout, 350, 200);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public void handle(ActionEvent event) {
        try {
            double a = Double.parseDouble(number1.getText());
            double b = Double.parseDouble(number2.getText());
            double answer;

            if (event.getSource() == add) {
                answer = a + b;
            } else if (event.getSource() == subtract) {
                answer = a - b;
            } else if (event.getSource() == multiply) {
                answer = a * b;
            } else {
                if (b == 0) {
                    throw new ArithmeticException();
                }
                answer = a / b;
            }

            result.setText("Result: " + answer);

        } catch (NumberFormatException e) {
            result.setText("Please enter valid numbers.");
        } catch (ArithmeticException e) {
            result.setText("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}