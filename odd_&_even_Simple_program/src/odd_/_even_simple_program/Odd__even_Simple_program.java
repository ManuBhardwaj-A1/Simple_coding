/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd_._even_simple_program;

import java.util.Scanner;

/**
 *
 * @author Manu Bhardwaj
 */
public class Odd__even_Simple_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
