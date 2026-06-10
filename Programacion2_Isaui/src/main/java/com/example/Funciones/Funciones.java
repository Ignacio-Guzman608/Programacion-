package com.example.Funciones;

public class Funciones {
    //1
    public static void mostrarSaludo() {
        System.out.println("Hola, mundo");
    }

    //2
    public static void saludar(String name) {
        String greeting = ("Hola, " + name);
        System.out.println(greeting);
    }

    //3
    public static double calculateRectanguleArea(double base, double height) {
        return base * height;
    }

    //4
    public static String switchToUppper(String strChain) {
        return strChain.toUpperCase(); //JAAJAJJA
    }

    //5
    public static void showMenu() {
        System.out.println("" +
                "###############_MENU_###############\n" +
                "#  OPCION 1                        #\n" +
                "#  OPCION 2                        #\n" +
                "#  OPCION 3                        #\n" +
                "###############_MENU_###############");
    }

    //6
    public static boolean esPar(int number) {
        double remainder = number % 2;
        return remainder == 0 ? true : false ;
    }

    //7
    public static int toSquared(int base) {
        return base * base;
    }

    //8
    public static int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }

    //9
    public static int sumarNumeros(int... numeros) {
        int add = 0;
        for (int numero : numeros) {
            add += numero;
        }
        return add;
    }

    //10
    public static double getAverage(double[] numbers) {
        double add = 0;
        for (int i = 0; i < numbers.length; i++) {
            add += numbers[i];
        }
        return add / numbers.length;
    }

    //11
    public static boolean isExisting(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    //12
    public static int countMatches(String[] words, String clave) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isEqual = words[i].equals(clave);
            if (isEqual) counter++;
        }
        return counter;
    }

    //13
    public static void printNumbers(int[] numbers) {
        int cantidad = numbers.length;
        String msjFinal = "";
        for (int i = 0; i < numbers.length ; i++) {
            String strNumber = String.valueOf(numbers[i]);
            msjFinal += "[" + strNumber + "]";
            if (numbers.length != i + 1) {
                msjFinal += ", ";
            }
        }
        System.out.println(msjFinal);
    }

    //14
    public static int[] flipArray(int[] unfliped) {
        int cantElements = unfliped.length;
        int[] fliped = new int[cantElements];

        for (int i = 0; i < cantElements; i++) {
            fliped[i] = unfliped[cantElements - 1 - i];
        }
        return fliped;
    }

    //15
    public static String getBestStudents(String[] estudiantes, double[] notas) {
        int highestNote = 0;
        int indexHighestNote = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > highestNote) {
                highestNote = (int) notas[i];
                indexHighestNote = i;
            }
        }
        String bestStudents = "";
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == highestNote) {
                bestStudents += estudiantes[i] + "  ";
            }
        }
        return bestStudents;
    }
}


