package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    //HashMap<Integer, Roupa>  guardaRoupa;
    HashMap<Integer,Roupa> guardaRoupa = new HashMap<>();

    int contador = 0;

    public int guardarRoupas(Roupa listadeRoupas){
        guardaRoupa.put(++contador, listadeRoupas);
        return contador;
    }

    public void mostrarRoupas() {
        System.out.println("*********** INVENTARIO - ARMARIO **************");
        for (Map.Entry<Integer, Roupa> roupaEntry: guardaRoupa.entrySet()) {
            System.out.println(roupaEntry.getKey()+" - "+ roupaEntry.getValue().toString());
        }
    }

    public void devolverRoupas(Integer contador){
        System.out.println("*********** REMOVENDO ROUPA ID: " + contador + "**************");
        guardaRoupa.remove(contador);
        guardaRoupa.get(contador);
    }


}
