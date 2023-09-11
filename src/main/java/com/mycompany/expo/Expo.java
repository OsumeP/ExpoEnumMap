/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expo;

import java.util.EnumMap;

/**
 *
 * @author David Patarroyo
 */
public class Expo {

    public static void main(String[] args) {
        EnumMap<Menu.Platillo, String> menu = Menu.crearMap();
        Menu.getValue(menu, Menu.Platillo.SPAGHETTI);
        Menu.deleteValue(menu, Menu.Platillo.PIZZA);
    }
}
