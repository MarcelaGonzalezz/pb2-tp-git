import java.util.Scanner;

public class Calculadora {
    public static void main(final String[] args) {
        Integer a;
        Integer b;
        Integer opcion;
        Integer resultado=0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Ingrese su operación \n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir");
            opcion = teclado.nextInt();
        }while(opcion < 1 && opcion > 4);

        if(opcion.equals(1)){
            System.out.println("Ingrese el primer numero");
            a = teclado.nextInt();
            System.out.println("Ingrese el segundo numero");
            b = teclado.nextInt();
            resultado = a + b;
            System.out.println("El resultado es " + resultado.toString());
        }else{
            if(opcion.equals(2)){
                System.out.println("Ingrese el primer numero");
                a = teclado.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = teclado.nextInt();
                resultado = a - b;
                System.out.println("El resultado es " + resultado.toString());
            }else{
                if(opcion.equals(3)){
                    System.out.println("Ingrese el primer numero");
                    a = teclado.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b = teclado.nextInt();
                    resultado = a * b;
                    System.out.println("El resultado es " + resultado.toString());
                }else{
                    if(opcion.equals(3)){
                        System.out.println("Ingrese el primer numero");
                        a = teclado.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        b = teclado.nextInt();
                        resultado = a / b;
                        System.out.println("El resultado es " + resultado.toString());
                    }else
                        System.out.println("opcion invalida");
                }
            }
        }
        
    }

}
