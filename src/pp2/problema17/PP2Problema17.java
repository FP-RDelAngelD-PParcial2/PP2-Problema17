/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema17;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        n1=verificarNumero("numero 1 ");
        n2=verificarNumero("numero 2 ");
        
    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static int verificarNumero(String d){
        int a;
        do{
        a = solicitarDatos(d);
        }while(a<0);
        return a;
    }
    public static int maximoComunD(int a, int b){
        if(a>b){
            
        }
    }
}
