//Autor:    Alejandro Serna Collazos
//Abstract: Tarea de practica y acercamiento a GitHub

package tareagh;
import java.util.Scanner;
public class TareaGH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 273;
        int b = 597;
        float c = (float) 5.3; //segun la documentación, java asume los numeros de punto flotante como double automaticamente, es por eso que se tiene que forzar el float de 32 bits si se quiere especificamente este tipo de dato
        float d = (float) 7.5;
        int e = 1234;
        int f = 532;
        int g = e + f;
        int h = e - f;
        int i = e * f;
        double j = (double) e / (double) f;
        long k = 1; //long porque es un numero muy largo y cono solo el int corto termina dando un valor negativo corto
        long l = 0;
        // 1 ejercicio
        System.out.println("-----Primer ejercicio-----");
        System.out.println("Hola, ya se imprimir frases");
        // 2 ejercicio
        System.out.println("-----Segundo ejercicio-----");
        System.out.println(a+" y "+b);
        // 3 ejercicio
        System.out.println("-----Tercer ejercicio-----");
        System.out.println(c+" y "+d);
        // 4 ejercicio
        System.out.println("-----Cuarto ejercicio-----");
        System.out.println("La suma de "+e+" mas "+f+" es: "+g);
        // 5 ejercicio
        System.out.println("-----Quinto ejercicio-----");
        System.out.println("La resta de "+e+" menos "+f+" es: "+h);
        // 6 ejercicio
        System.out.println("-----Sexto ejercicio-----");
        System.out.println("La multiplicacion de "+e+" por "+f+" es: "+i);
        // 7 ejercicio
        System.out.println("-----Septimo ejercicio-----");
        System.out.println("La division de "+e+" entre "+f+" es: "+j);
        // 8 ejercicio
        System.out.println("-----Octavo ejercicio-----");
        for (i=1;i<4;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // 9 ejercicio
        System.out.println("-----Noveno ejercicio-----");
        for (i=1;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // 10 ejercicio
        System.out.println("-----Decimo ejercicio-----");
        for (i=1;i<10001;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // 11 ejercicio
        System.out.println("-----Decimoprimer ejercicio-----");
        for (i=5;i<11;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // 12 ejercicio
        System.out.println("-----Decimosegundo ejercicio-----");
        for (i=5;i<16;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // 13 ejercicio
        System.out.println("-----Decimotercer ejercicio-----");
        for (i=5;i<15001;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // 14 ejercicio
        System.out.println("-----Decimocuarto ejercicio-----");
        for (i=1;i<201;i++){
            System.out.print(i+". hola ");
        }
        System.out.println(" ");
        // 15 ejercicio
        System.out.println("-----Decimoquinto ejercicio-----");
        for (i=1;i<31;i++){
            int z = i*i;
            System.out.print("El cuadrado de "+i+" es: "+z+". ");
        }
        System.out.println(" ");
        // 16 ejercicio
        System.out.println("-----Decimosexto ejercicio-----");
        for (i=1;i<21;i++){
            k *= i;
        }
        System.out.println("La multiplicacion de los primeros 20 numeros naturales es: "+k);
        // 17 ejercicio
        System.out.println("-----Decimoseptimo ejercicio-----");
        for (i=1;i<101;i++){
            int n = i*i;
            l += n;
        }
        System.out.println("La suma de los cuadrados de los primeros 100 numeros naturales es: "+l);
        // 18 ejercicio
        System.out.println("-----Decimoctavo ejercicio-----");
        System.out.print("Ingresa un numero entero: ");
        int m = scan.nextInt();
        int n = 0;
        for (i=m+1;i<m+101;i++){
            n += i;
        }
        System.out.println("La suma de los siguientes 100 numeros es: "+n);
        // 19 ejercicio
        System.out.println("-----Decimonoveno ejercicio-----");
        System.out.print("Ingresa la cantidad de euros (con los centavos separados por una coma): ");
        double o = scan.nextDouble();
        double p = o * 1.06;
        System.out.println("La cantidad de dolares es: "+p);
        // 20 ejercicio
        System.out.println("-----Vigesimo ejercicio-----");
        System.out.print("Ingresa la base del rectangulo (con los decimales separados por una coma): ");
        double q = scan.nextDouble();
        System.out.print("Ingresa la altura del rectangulo (con los decimales separados por una coma): ");
        double r = scan.nextDouble();
        double s = q * r;
        System.out.println("El area total del rectangulo es: "+s);
        // 21 ejercicio
        System.out.println("-----Vigesimoprimer ejercicio-----");
        System.out.print("Ingresa el primer numero a comparar: ");
        int t = scan.nextInt();
        System.out.print("Ingresa el segundo numero a comparar: ");
        int u = scan.nextInt();
        if (t<u){
            System.out.println("El numero mayor es "+u+" y el numero menor es "+t);
        } else if (t>u){
            System.out.println("El numero mayor es "+t+" y el numero menor es "+u);
        } else {
            System.out.println("Los numeros son iguales");
        }
        // 22 ejercicio
        System.out.println("-----Vigesimosegundo ejercicio-----");
        System.out.print("Ingresa un numero entero: ");
        int v = scan.nextInt();
        if (v-1<1){
            System.out.println("No hay numeros enteros impares menores que uno y mayores a cero");
        } else {
            System.out.print("Los numeros impares menores a "+v+" son: ");
        }
        for (i=v-1;i>0;i--){
            if(i%2>0 && i!=1){
                System.out.print(i+", ");
            } else if (i==1){
                System.out.print(i);
                System.out.println(" ");
            }
        }
        // 23 ejercicio
        System.out.println("-----Vigesimotercer ejercicio-----");
        System.out.print("Ingresa el primer numero entero para el Algoritmo de Euclides: ");
        int aa = scan.nextInt();
        System.out.print("Ingresa el segundo numero entero para el Algoritmo de Euclides: ");
        int bb = scan.nextInt();
        while (bb!=0){
            int inter = bb;
            bb = aa % bb;
            aa = inter;
        }
        System.out.println("El maximo comun divisor entre los dos numeros es: "+aa);
        // 24 ejercicio
        System.out.println("-----Vigesimocuarto ejercicio-----");
        System.out.print("Ingresa el coeficiente a: ");
        double x = scan.nextDouble();
        System.out.print("Ingresa el coeficiente b: ");
        double y = scan.nextDouble();
        System.out.print("Ingresa el coeficiente c: ");
        double z = scan.nextDouble();
        if (x==0){
            System.out.println("No es una ecuación cuadrática, ya que 'a' no puede ser 0");
        } else {
            double disc = y * y - 4 * x * z; //calcular delta
            if (disc > 0) { //2 soluciones diferentes
                double x1 = (-y + Math.sqrt(disc)) / (2 * x);
                double x2 = (-y - Math.sqrt(disc)) / (2 * x);
                System.out.println("Las soluciones son x1 = "+x1+" y x2 = "+x2);
            } else if (disc == 0){ //1 solucion
                double xx = -y / (2 * x);
                System.out.println("La solucion doble es x = "+xx);
            } else { //sin solucion real
                System.out.println("La ecuacion no tiene soluciones reales");
            }
        }
        // 25 ejercicio
        System.out.println("-----Vigesimoquinto ejercicio-----");
        int nfac = 5;
        int resFactorial = factorial(nfac);
        System.out.println("El factorial de "+nfac+" es: "+resFactorial);
        int mAck = 3;
        int nAck = 4;
        int resAckermann = ackermann(mAck, nAck);
        System.out.println("El valor de A("+mAck+", "+nAck+") es: "+resAckermann);
        // 26 ejercicio
        System.out.println("-----Vigesimosexto ejercicio-----");
        System.out.print("Ingresa el primer numero entero a comparar: ");
        int primero = scan.nextInt();
        System.out.print("Ingresa el segundo numero entero a comparar: ");
        int segundo = scan.nextInt();
        System.out.print("Ingresa el tercer numero entero a comparar: ");
        int tercero = scan.nextInt();
        if (primero<segundo && segundo<tercero){
            System.out.println("El menor de los tres numeros es "+tercero+" y el mayor es "+primero);
        } else if (segundo<tercero && tercero<primero){
            System.out.println("El menor de los tres numeros es "+primero+" y el mayor es "+segundo);
        } else if (tercero<primero && primero<segundo){
            System.out.println("El menor de los tres numeros es "+segundo+" y el mayor es "+tercero);
        } else if (primero<tercero && tercero<segundo){
            System.out.println("El menor de los tres numeros es "+segundo+" y el mayor es "+primero);
        } else if (segundo<primero && primero<tercero){
            System.out.println("El menor de los tres numeros es "+tercero+" y el mayor es "+segundo);
        } else if (tercero<segundo && segundo<primero){
            System.out.println("El menor de los tres numeros es "+primero+" y el mayor es "+tercero);
        } else if (primero==segundo || primero==tercero || segundo==tercero){
            System.out.println("Dos o mas de los numeros ingresados tiene el mismo valor");
        }
        // 27 ejercicio
        System.out.println("-----Vigesimoseptimo ejercicio-----");
        double fahr = 0;
        while (true) {
            System.out.print("Introduce la temperatura en Fahrenheit (999 para salir): ");
            fahr = scan.nextDouble();  // Leer la temperatura en Fahrenheit
            if (fahr==999){
                break;  // Salir del bucle
            }
            double celsius = (5.0 / 9.0) * (fahr - 32);
            System.out.println(fahr+" grados Fahrenheit son "+celsius+" grados Celsius");
        }
        // 28 ejercicio
        System.out.println("-----Vigesimoctavo ejercicio-----");
        for (int ii=1; ii<6; ii++){
            System.out.println("Evaluando el caso del numero: "+ii);
            switch (ii){
                case 1:
                    System.out.println("El numero es 1");
                    break;
                case 2:
                    System.out.println("El numero es 2");
                    break;
                case 3:
                    System.out.println("El numero es 3");
                    break;
                case 4:
                    System.out.println("El numero es 4");
                    break;
                case 5:
                    System.out.println("El numero es 5");
                    break;
                default:
                    System.out.println("El numero no esta entre 1 y 5");
                    break; //si no se añade el break en cada caso, se crea un bucle infinito que finalmente lleva a un error
            }
        }
        // 29 ejercicio
        System.out.println("-----Vigesimonoveno ejercicio-----");
        System.out.println("Este ejercicio solo se puede ejecutar efectivamente desde el CMD");
//        System.out.println("Introduce datos (Ctrl+Z en Windows para finalizar):");
//        while (scan.hasNextLine()){
//            String input = scan.nextLine();  // Lee una línea de texto
//            System.out.println("Ingresaste: " + input);  // Muestra lo que se ha ingresado
//        }
//        System.out.println("Se ha alcanzado el fin de los datos (haz usado el comando Ctrl+Z)");
        // 30 ejercicio
        System.out.println("-----Trigesimo ejercicio-----");
        System.out.print("Los numeros primos entre 1 y 100 son: ");
        for (int num=2; num<101; num++){
            boolean esPrimo = true;
            for (int divisor=2; divisor<=Math.sqrt(num); divisor++){
                if (num%divisor == 0){
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo){
                System.out.print(num+" ");
            }
        }
        System.out.println(" ");
    }
    public static int factorial(int n){
        if (n==0){
            return 1; // Caso base
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }
    
    public static int ackermann(int m, int n){
        if (m==0){
            return n + 1; // Caso base
        } else if (n==0){
            return ackermann(m - 1, 1); // Caso cuando n es 0
        } else {
            return ackermann(m - 1, ackermann(m, n - 1)); // Llamada recursiva doble
        }
    }
}
