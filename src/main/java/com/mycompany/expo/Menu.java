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
            SPAGHETTI,
            PIZZA,
            SOPA
        }
    
    public static void crearMap(){
     //Instanciar un objeto de un Enum:
        Menu.Platillo sopa = Menu.Platillo.SOPA;
        
        //Instanciar un EnumMap
        EnumMap<Platillo, String> menuMap = new EnumMap<>(Platillo.class);
        menuMap.put(Platillo.PIZZA, "25000$");
        menuMap.put(Platillo.SPAGHETTI, "18000$");
        System.out.println(menuMap);
    }
      
}
