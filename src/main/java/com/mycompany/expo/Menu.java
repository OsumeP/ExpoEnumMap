/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expo;

import java.util.EnumMap;

/**
 *
 * @author David Patarroyo
 */
public class Menu {
    enum Platillo{
            SPAGHETTI (1),
            PIZZA (3),
            SOPA (4);
            
            private int precio;
            
            private Platillo(int precio){
                this.precio = precio;
            } 
        }
    
    public static void crearMap(){
     //Instanciar un objeto de un Enum:
        Platillo sopa = Platillo.SOPA;
        
        //Instanciar un EnumMap
        EnumMap<Platillo, String> menuMap = new EnumMap<>(Platillo.class);
        menuMap.put(Platillo.PIZZA, "25000$");
        menuMap.put(Platillo.SPAGHETTI, "18000$");
        menuMap.put(Platillo.SPAGHETTI, "17000$");
        System.out.println(menuMap);
        //Get
        System.out.println(menuMap.get(Platillo.PIZZA));
        System.out.println(menuMap.get(Platillo.SOPA));
        //Remove
        System.out.println("Se eliminó: " + menuMap.remove(Platillo.PIZZA));
    }
      
}
