/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zoologico;

/**
 * 
 * @author David Massana
 */
public class Animal {
    private String especie;
    private String comida;
    private String color;
    private char sexo;

    public Animal(String especie, String comida, String color, char sexo) {
        this.especie = especie;
        this.comida = comida;
        this.color = color;
        this.sexo = sexo;
    }
    
    
    public void dormir(){
        System.out.println("Esta durmiendo...");
    }
    
    public void comer(String especie, String comida){
        this.comida = comida;
        this.especie = especie;
        System.out.println(especie + "esta comiendo " + comida);
    }

    public String getEspecie() {
        return especie;
    }

    public String getComida() {
        return comida;
    }

    public String getColor() {
        return color;
    }

    public char getSexo() {
        return sexo;
    }
    
    @Override
    public String toString() {
        return " Animal: " + especie + " Comida: " + comida +" Color: " + color +" sexo: " + sexo;
    }
    
}
