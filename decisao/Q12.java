/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisao;

import java.util.Scanner;

/**
 *
 * @author Ermeson
 */
public class Q12 {
    
    public static void main(String[] args) {
        
      Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int numero = tc.nextInt();
        
        if(numero >= 0){
            System.out.println("É POSITIVO");
        }else{
            System.out.println("É NEGATIVO");
        }
        
        
    }
    
}
