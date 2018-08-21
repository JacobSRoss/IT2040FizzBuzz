/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Jacob 2015
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        int i = 0;
        
        for(i=1;i<101;i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0){
                System.out.print("Fizz ");
            } else if (i % 5 == 0){
                System.out.print("Buzz ");
            }else {
                System.out.print(i + " ");
            }
        }
        
    }
    
}
