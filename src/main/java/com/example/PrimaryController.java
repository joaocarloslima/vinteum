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
        // pontosJogador.setText("Jogador: " + jogo.getJogador().getPontos());
        // pontosMesa.setText("Mesa: " + jogo.getMesa().getPontos());
        
        // mesaDoJogador.getChildren().clear();
        // mesaDoComputador.getChildren().clear();

        // jogo.getJogador().getMao().forEach((carta) -> mesaDoJogador.getChildren().add(imagemCarta(carta)));
        // jogo.getMesa().getMao().forEach((carta) -> mesaDoComputador.getChildren().add(imagemCarta(carta)));
    }

    public void novoJogo(){
        // jogo = new Jogo();
        // mesaDoJogador.getChildren().clear();
        // mesaDoComputador.getChildren().clear();
        // pontosJogador.setText("Jogador: 0");
        // pontosMesa.setText("Mesa: 0");
        // resultado.setText("");
    }

    public void pedirCarta(){

    }

    public void parar(){

    }
    

    // private ImageView imagemCarta(Carta carta) {
    //    return new ImageView(App.class.getResource(carta.imagePath()).toString());
    // }

}
