package com.dstart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "ax^2 + bx + c";
        System.out.println("This program will ask you to input a, b, and c for the following equation:\n" + message);
        System.out.print("a: ");
        Double a = scanner.nextDouble();
        System.out.print("b: ");
        Double b = scanner.nextDouble();
        System.out.print("c: ");
        Double c = scanner.nextDouble();
        double multiplyTo = a * c;
        int i = 1;
        List<Integer> factorCheck = new ArrayList<Integer>();
        while (i <= multiplyTo) {
            double factor = multiplyTo / i;
            i++;
            if (factor % 1 == 0) {
                int factors = (int) Math.round(factor);
                factorCheck.add(factors);
            }
        }
        int minListIndex = factorCheck.size() - 1;
        int maxListIndex = 0;
        while (maxListIndex <= minListIndex) {
            int minListIndexValue = factorCheck.get(minListIndex);
            int maxListIndexValue = factorCheck.get((maxListIndex));
            int factorAdd = minListIndexValue + maxListIndexValue;
            minListIndex--;
            maxListIndex++;
            if (factorAdd == b && a == 1) {
                String equation = "(x + " + maxListIndexValue + ") (x + " + minListIndexValue + ")";
                System.out.println(equation);
            } else if (factorAdd == b && a != 1) {
                int y = 1;
                List<Integer> factorCheckA = new ArrayList<Integer>();
                while (y <= a) {
                    double factorA = a / y;
                    y++;
                    if (factorA % 1 == 0) {
                        int factorsA = (int) Math.round(factorA);
                        factorCheckA.add(factorsA);
                    }
                }
                int minListIndexA = factorCheckA.size() -1;
                int maxListIndexA = 0;
                while (maxListIndexA <= minListIndexA) {
                    int maxListIndexValueA = factorCheckA.get((maxListIndexA));
                    minListIndexA--;
                    maxListIndexA++;
                    int factoredA = (int) Math.round(a / maxListIndexValueA);
                    int factoredInit = (int) Math.round(maxListIndexValueA / maxListIndexValueA);
                    System.out.println("\n(" + maxListIndexValueA + "x + ");
                }
                int z = 1;
                List<Integer> factorCheckC = new ArrayList<Integer>();
                while (z <= c) {
                    double factorC = c / z;
                    z++;
                    if (factorC % 1 == 0) {
                        int factorsC = (int) Math.round(factorC);
                        factorCheckC.add(factorsC);
                    }

                }
                int minListIndexC = factorCheckC.size() -1;
                int maxListIndexC = 0;
                while (maxListIndexC <= minListIndexC) {
                    int maxListIndexValueC = factorCheckC.get((maxListIndexC));
                    minListIndexC--;
                    maxListIndexC++;
                    int factoredC = (int) Math.round(c / maxListIndexValueC);
                    int factoredInitC = (int) Math.round(maxListIndexValueC / maxListIndexValueC);
                    if (factoredC == 1){
                        System.out.println(maxListIndexValueC + ")" + "(" + factoredC + "x + " + factoredInitC + ")");
                    }
                }


            }

        }
    }
}
