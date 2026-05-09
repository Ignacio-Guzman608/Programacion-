//<>6. Validación de Entrada (Básica): Pide al usuario que ingrese una contraseña (simulada) hasta que sea correcta.
import java.util.Scanner;
public class RepasoBucles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String user = "Gladys";
        String passWord = "AmoChayanne";
        Boolean correcta = false;
        String intento = "";
        while (!correcta){
            System.out.print(user + ", Ingrese su contraseña: ");
            intento = sc.nextLine(); 
            if (!intento.equals(passWord)) System.out.print("¡INCORRECTO!  ");
            else correcta = true; 
        }
        sc.close();
        System.out.print("Contraseña correcta");
    }
}
//1. Contar hasta 10: Imprime los números del 1 al 10.
//public class RepasoBucles {    
//    public static void main(String[] args){
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//    }
//}

//2. Números Pares: Imprime todos los números pares del 0 al 20.
//public class RepasoBucles {    
//    public static void main(String[] args){
//        for(int i = 0; i <= 20; i = i + 2){
//            System.out.println(i);
//        }
//    }
//}

//3. Suma de Números: Calcula la suma de los números del 1 al 100 e imprímela. 
//public class RepasoBucles {
//    public static void main(String[] args){
//        int suma = 0;
//        for(int i = 0; i <= 100; i++){
//            suma = suma + i;
//        }
//        System.out.println(suma);
//    }

//4. Cuenta Regresiva: Imprime una cuenta regresiva desde 5 hasta 1, y luego "¡Despegue!".  
//public class RepasoBucles {
//    public static void main(String[] args){
//        int i = 5;
//        while (i >= 0){
//            System.out.println(i);
//            i--;
//        }
//        System.out.println("¡Despegue!");
//    }
//}

//5. Adivina el Número (Simple): Simula un juego donde tienes que adivinar un número fijo. 
// El bucle continúa hasta que el número sea adivinado. 
//import java.util.Scanner;
//public class RepasoBucles {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int rigthNum = 67;
//        int num = 0;
//        while (num != rigthNum){
//            System.out.print(" intenta adivinar el numero secreto: ");
//            num = sc.nextInt(); 
//            if (num != rigthNum) System.out.print("¡INCORRECTO!");
//        }
//        sc.close();
//        System.out.print("¡67, NUMERO CORRECTO!");
//    }
//}