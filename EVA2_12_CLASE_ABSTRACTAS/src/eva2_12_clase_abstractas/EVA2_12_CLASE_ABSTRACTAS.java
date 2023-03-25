/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_clase_abstractas;

/**
 *
 * @author hp
 */
public class EVA2_12_CLASE_ABSTRACTAS {

    /**
     * @param args the command line arguments
     * //clases abstractas solo sirven para generalizar, pero no para crear objetos
//solo para heredar, como superclases

//metodos abstractos sirven con cabecera pero no implementacion
//servirian solo para cuando hereden lo tengan y este obligado a sobreescribirlo


//interfaces es un tipo de dato abstracto pero solo tiene metodos abstractos
     */
    public static void main(String[] args) {
     
        //las clases abstractas solo sirven para heredar y generalizar
    //no sirven para crear objetos
   
    
    Prueba prueba = new Prueba();
    PruebaAbstract pA = new PruebaAbstract() {};
    }
    
}

//No se pueden crear objetos de clases abstractas

abstract class PruebaAbstract{
    
}