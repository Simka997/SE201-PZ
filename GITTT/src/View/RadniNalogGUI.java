package View;

import com.sun.javafx.css.Combinator;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadniNalogGUI extends Application {

    private Button btn = new Button("Kreiraj nalog");
    private Button bt_odustani  = new Button("Odustani");

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField tf1 = new TextField();
        TextField tf_preduzece = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf_opis = new TextField();
        TextField tf_sektor = new TextField();

        tf1.setMaxHeight(30);
        tf1.setMinWidth(30);
        tf1.setMaxHeight(30);
        tf1.setMaxWidth(30);
        Label l1 = new Label("Redni broj naloga:");

        Label l_preduzece = new Label("Izdaje preduzece:");
        Label l_opis = new Label("Opis:");
        Label l_sektor = new Label("Izdaje sektor:");
        Label l_status = new Label("Status radnog naloga:");
        Label l2 = new Label("Datum izdavanja:");
        Label l_odgovornoLice = new Label("Izdaje odgovorno lice:");
        Label l4 = new Label("Porucilac usluge:");
        Label l5 = new Label("Mesto");
        Label l6 = new Label("Adresa");
        ComboBox cb = new ComboBox();
        cb.getItems().addAll("", "Bepgrad", "Novi Sad", "Zrenjanin");
        ComboBox cb_status = new ComboBox();
        cb_status.getItems().addAll("", "true", "folse");
        HBox dugmici_hb = new HBox(btn, bt_odustani);
        dugmici_hb.setAlignment(Pos.CENTER);

        VBox v = new VBox();
        v.getChildren().addAll(l1, tf1, l2, tf2, l_odgovornoLice, tf3, l4, tf4, l5, cb, l6, tf5, l_preduzece, tf_preduzece, l_sektor, tf_sektor, l_opis, tf_opis, l_status, cb_status, dugmici_hb);
        v.setAlignment(Pos.BASELINE_LEFT);

        Scene scene = new Scene(v, 500, 500);
        primaryStage.setTitle("Radni Nalog");
        primaryStage.setScene(scene);
        primaryStage.show();
        btn.setOnAction((event) -> {
            
            
        });
    }
    
}
