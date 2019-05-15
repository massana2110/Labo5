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
public class Vaca extends Animal implements Actions_Animals{

    private double peso;
    
    public Vaca(String especie, String comida, String color, char sexo, double peso) {
        super(especie, comida, color, sexo);
        this.peso = peso;
    }

    @Override
    public void dormir(){
        System.out.println("La vaca");
        super.dormir();
    }
    @Override
    public String tipoRuido() {
        String ruido = "Muuuuuu";
        return ruido;
    }

    @Override
    public String posicionDormir() {
        String cadena = "Duermen entremetiendo las patas en suelo...";
        return cadena;
    }

}
