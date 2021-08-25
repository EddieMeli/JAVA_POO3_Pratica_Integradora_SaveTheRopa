package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//
        List lstMarca = new ArrayList();
        List lstModelo = new ArrayList();

        lstMarca.add("1");
        lstMarca.add("5");


        lstModelo.add("Modelo1");
        lstModelo.add("Modelo2");


        GuardaRoupa objguardaRoupa = new GuardaRoupa();

        for (int i = 0 ; i < lstMarca.size() ; i++) {
            Roupa roupa = new Roupa(lstMarca.get(i).toString(), lstModelo.get(i).toString());
            int id = objguardaRoupa.guardarRoupas(roupa);

            System.out.println("Roupa Guardada... ID: "+ id);
        }

        // -- Display estoque
        objguardaRoupa.mostrarRoupas();

        // -- Remover
        objguardaRoupa.devolverRoupas(1);


        // -- Display estoque
        objguardaRoupa.mostrarRoupas();


        // -- Display Remover
        objguardaRoupa.devolverRoupas(2);


        // -- Display estoque
        objguardaRoupa.mostrarRoupas();






    }
}
