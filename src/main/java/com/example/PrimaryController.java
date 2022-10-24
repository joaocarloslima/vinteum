package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PrimaryController {

    @FXML private HBox mesaDoJogador;
    @FXML private HBox mesaDoComputador;
    @FXML private ImageView monte;

    @FXML private Label pontosMesa;
    @FXML private Label pontosJogador;
    @FXML private Label resultado;

    public void turno(){

    }

    public void atualizar(){
        
    }

    public void novoJogo(){

    }

    public void pedirCarta(){

    }

    public void parar(){

    }
    

    // private ImageView imagemCarta(Carta carta) {
    //    return new ImageView(App.class.getResource(carta.imagePath()).toString());
    // }

}
