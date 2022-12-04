package br.ufc.trabalhofinalpds.aplicacao;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BancoImobiliarioControlador {

    @FXML
    private Label erroquant;

    @FXML
    private TextField quant;

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
        } catch (NumberFormatException e){
            erroquant.setVisible(true);
        }
    }
}
