package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {

    private List<Carta> cartas = new ArrayList<>();

    public Monte(){
        for ( Naipe naipe: Naipe.values()){
            for(int i = 1; i <= 13; i++)
                cartas.add(new Carta(i,naipe));
            
        }
        
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta virar(){
        return cartas.remove(0);

    }
    


}
