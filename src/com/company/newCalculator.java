package com.company;

public class newCalculator {

    public static void main(String[] args) {

            if (args.length < 2) {
                System.out.println("zu wenig Input!");
            }
            int x;
            switch (args[1]) {
                case "+":
                    x = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    System.out.println("Das Ergebnis lautet: " + x);
                    break;
                case "-":
                    x = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    System.out.println("Das Ergebnis lautet: " + x);
                    break;
                case "x":
                    x = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    System.out.println("Das Ergebnis lautet: " + x);
                    break;
                case "/":
                    x = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    System.out.println("Das Ergebnis lautet: " + x);
                    break;
                case "%":
                    x = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
                    System.out.println("Das Ergebnis lautet: " + x);
                    break;
                default:
                    System.out.println("Operation wird nicht unterstützt!");
            }
    }
}