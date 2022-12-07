package br.ufc.trabalhofinalpds.aplicacao;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;

public class BancoImobiliarioControlador {

    @FXML
    private Label erroquant;

    @FXML
    private TextField quant;

    @FXML
    private VBox menu;

    @FXML
    private HBox tabuleirocima;

    @FXML
    private HBox tabuleirobaixo;

    @FXML
    private VBox tabuleiroesquerda;

    @FXML
    private VBox tabuleirodireita;

    @FXML
    private ImageView cartaview;

    private List<Node> casas;

    @FXML
    public void initialize() {
        System.out.println("Iniciando interface...");
    }

    public void onIniciar(){
        String texto = quant.getText();
        try {
            int quant = Integer.parseInt(texto);
            if(quant < 2 || quant > 6){
                throw new NumberFormatException();
            }
            menu.setVisible(false);
            prepararCasas();
        } catch (NumberFormatException e){
            erroquant.setVisible(true);
        }
    }

    private void prepararCasas(){
//        casas.addAll(tabuleirobaixo.getChildren());
//        casas.addAll(tabuleiroesquerda.getChildren());
//        casas.addAll(tabuleirocima.getChildren());
//        casas.addAll(tabuleirodireita.getChildren());
        tabuleirobaixo.getChildren().forEach(c -> {
            System.out.println(c.getId());
        });
    }

}
