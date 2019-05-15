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
public class Serpiente extends Animal implements Actions_Animals {

    private boolean isVenenosa;
    private String tipoCaza; //Si es venenosa, primero inyectan en la victima y luego se la comen... Si no, matan asfixiando a la empresa.
    private double longitud;
    
    public Serpiente(boolean isVenenosa, String tipoCaza, double longitud, String especie, String comida, String color, char sexo) {
        super(especie, comida, color, sexo);
        this.isVenenosa = isVenenosa;
        if(isVenenosa)
            this.tipoCaza = "Inyectan veneno en la presa y la ingieren";
        else
            this.tipoCaza = "Estrangulan a la presa";
        this.longitud = longitud;
    }
    
    
    @Override
    public String tipoRuido() {
        String ruido = "zzzzzzzz";
        return ruido;
    }

    @Override
    public String posicionDormir() {
        String cadena = "Duerme enrollada...";
        return cadena;
    }

    public boolean isIsVenenosa() {
        return isVenenosa;
    }

    public String getTipoCaza() {
        return tipoCaza;
    }

    public double getLongitud() {
        return longitud;
    }

    
}
