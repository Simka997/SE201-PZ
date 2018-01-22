/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author sm
 */
public class RadnoVremeGUI extends Application {

    private Button btn_pocetak = new Button("POČETAK RADNOG VREMENA");

    private Button btn_naTeren = new Button("VREME IZLASKA NA TEREN");

    private Button btn_kraj = new Button("KRAJ RADNOG VREMENA");
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vb = new VBox(btn_pocetak, btn_naTeren, btn_kraj);
        vb.setAlignment(Pos.CENTER);
        btn_naTeren.setDisable(true);
        btn_kraj.setDisable(true);
        Scene scene = new Scene(vb, 500, 500);
        primaryStage.setTitle("Radni Nalog");
        primaryStage.setScene(scene);
        primaryStage.show();
        btn_pocetak.setOnAction((event) -> {
            btn_pocetak.setDisable(true);
            btn_naTeren.setDisable(false);
            btn_kraj.setDisable(false);
            System.currentTimeMillis();
        });

    }

}
