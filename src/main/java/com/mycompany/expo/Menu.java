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
            SOPA;
            /*
            private int precio;
            
            private Platillo(int precio){
                this.precio = precio;
            } */
        }
    
    public static EnumMap<Platillo, String> crearMap(){
     //Instanciar un objeto de un Enum:
        Platillo sopa = Platillo.SOPA;
        
        //Instanciar un EnumMap
        EnumMap<Platillo, String> menuMap = new EnumMap<>(Platillo.class);
        menuMap.put(Platillo.PIZZA, "25000$");
        menuMap.put(Platillo.SPAGHETTI, "18000$");
        menuMap.put(Platillo.SPAGHETTI, "17000$");
        System.out.println(menuMap);
        
        return menuMap;
        //Remove
        //System.out.println("Se eliminó: " + menuMap.remove(Platillo.PIZZA));
    }
    
    public static String getValue(EnumMap<Platillo, String> menu, Platillo value){
        try{
            String recoverValue = menu.get(value);
            if (recoverValue != null){
                System.out.println("Valor recuperado: " + recoverValue);
                return recoverValue;
            }
            System.out.println("No había nada");
        }catch (Exception ex){
            System.out.println("error: " + ex);
        }
        return "No hay nada";
    }
    
    public static void deleteValue(EnumMap<Platillo, String> menu, Platillo value){
        try{
            String deletedValue = menu.remove(value);
            if (deletedValue != null){
                System.out.println("Valor eliminado: " + deletedValue);
            }else{
                System.out.println("No había nada");
            }
        }catch (Exception ex){
            System.out.println("error: " + ex);
        }
    }
    
      
}
