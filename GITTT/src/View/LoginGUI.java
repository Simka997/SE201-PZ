package View;

import View.RadniNalogGUI;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LoginGUI extends Application {

    private static LoginGUI login;
    private ComboBox<String> combo;
    private VBox root = new VBox();
    private TextField username = new TextField();
    private PasswordField password = new PasswordField();
    private Button btn_login = new Button("Login");
    private HBox hb = new HBox();

    @Override
    public void start(Stage primaryStage) {

        //  BazaPodataka.konekcija();
        srediRoot();
        password.setText("");
        Scene scene = new Scene(root, 400, 500);

        primaryStage.setTitle("SE-PZ");
        primaryStage.setScene(scene);

        btn_login.setOnAction(
                new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event
            ) {

                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                      
                        try {
                            if (combo.getValue().compareTo("Projektant") == 0) {
                                new  RadnoVremeGUI().start(new Stage());
                                new RadniNalogGUI().start(new Stage());
                            }else if(combo.getValue().compareTo("Montazer") == 0){}
                            else if(combo.getValue().compareTo("Radnik sa sektora UGRADNJE")==0){}
                        } catch (Exception ex) {

                        }
                    }
                });

            }
        }
        );
        primaryStage.show();
    }

    public void srediRoot() {
        napuniCombo();
        GridPane grid = new GridPane();
        hb.getChildren().add(napuniCombo());
        grid.add(hb, 0, 0);
        grid.add(new Label("Username: "), 0, 1);
        grid.add(new Label("Password: "), 0, 2);

        grid.add(username, 2, 1);
        grid.add(password, 2, 2);
        root.setAlignment(Pos.CENTER);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(20);
        root.setSpacing(20);
        root.getChildren().addAll(grid, btn_login);
    }

    public ComboBox napuniCombo() {
        combo = new ComboBox<>();
        combo.getItems().addAll("Projektant", "Montazer", "Radnik sa sektora UGRADNJE");
        combo.getSelectionModel().selectFirst();
        return combo;
    }

    public static LoginGUI getInstace() {
        if (login == null) {
            login = new LoginGUI();
        }
        return login;
    }

    public ComboBox<String> getCombo() {
        return combo;
    }

    public TextField getUsername() {
        return username;
    }

    public PasswordField getPassword() {
        return password;
    }

    public Button getDugme() {
        return btn_login;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
