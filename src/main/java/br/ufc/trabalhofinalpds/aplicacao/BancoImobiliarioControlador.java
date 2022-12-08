package br.ufc.trabalhofinalpds.aplicacao;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

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
    private ImageView casaview;

    @FXML
    private AnchorPane centroTab;

    private List<Node> casas;


    @FXML
    public void initialize() {
        casas = new ArrayList<>();
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
            centroTab.setVisible(true);
        } catch (NumberFormatException e){
            erroquant.setVisible(true);
        }
    }

    private void prepararCasas(){
        casas.addAll(tabuleirobaixo.getChildren());
        casas.addAll(tabuleiroesquerda.getChildren());
        casas.addAll(tabuleirocima.getChildren());
        casas.addAll(tabuleirodireita.getChildren());

        casas.sort(Comparator.comparingInt(c -> Integer.parseInt(c.getId())));

        casas.forEach(c -> {
            Pane cp = (Pane) c;
            ImageView img = (ImageView) cp.getChildren().get(0);
            img.setMouseTransparent(true);

            AtomicReference<Image> ultimaImagem = new AtomicReference<>();
            c.setOnMouseEntered(e -> {
                ultimaImagem.set(casaview.getImage());
                casaview.setImage(img.getImage());
            });

            c.setOnMouseExited(e -> {
                casaview.setImage(ultimaImagem.get());
                ultimaImagem.set(null);
            });
        });

        mostrarCasa(0);
    }

    public void mostrarCasa(int i){
        Pane casa = (Pane) casas.get(i);
        ImageView imagemCasa = (ImageView) casa.getChildren().get(0);
        casaview.setImage(imagemCasa.getImage());
    }

}
