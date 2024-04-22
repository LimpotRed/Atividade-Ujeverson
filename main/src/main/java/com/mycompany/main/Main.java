
package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma função matemática (por exemplo, x^2 + 3x + 5):");
        String function = scanner.nextLine();
        
        Function f = new Function(function);
        String derivative = f.calculateDerivative();
        
        System.out.println("A derivada da função é: " + derivative);
        
        scanner.close();
    }
    }

