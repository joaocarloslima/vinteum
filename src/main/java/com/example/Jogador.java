package com.example;

import java.util.ArrayList;
import java.util.List;


public class Jogador {
    private int pontos;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou;

public void receberCarta(Carta carta){
    cartas.add(carta);
    pontos += carta.getNumero();
}

public void parar(){
    parou = true;
;
}
public int getPontos(){
    return pontos;

}
public List(Carta)

    
}

