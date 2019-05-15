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
public class Tigre extends Animal implements Actions_Animals{

    private String patronRayas; //onduladas, rectas, circulares
    
    public Tigre(String especie, String comida, String color, char sexo, String patronRayas){
        super(especie, comida, color, sexo);
        this.patronRayas = patronRayas;
    }
    
    @Override
    public void dormir(){
        System.out.println("El tigre ");
        super.dormir();
    }
    
    @Override
    public String tipoRuido() {
        String ruido = "Roarrrr";
        return ruido;
    }

    public String getPatronRayas(){
        return patronRayas;
    }

    @Override
    public String posicionDormir() {
        String cadena = "Esta dormido arrecostado sobre sus patas...";
        return cadena;
    }

}
