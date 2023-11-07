/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_01;

/**
 *
 * @author Usuario15
 */
public class Main_S15_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Calculadora miCalculadora = new Calculadora(20, 15);

        System.out.println("Suma: " + miCalculadora.sumar(3));
        System.out.println("Resta: " + miCalculadora.restar(2));
        System.out.println("Multiplicación: " + miCalculadora.multiplicar(4));
        System.out.println("División: " + miCalculadora.dividir(2));
        
       
        Animal_01 animal1 = new Animal_01();

        animal1.preguntar();
        animal1.mostrarInformacion();
        animal1.emitirSonido();
      
        

    }

}