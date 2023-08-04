// ******************************************************

// Java - Ejercitación inicial.

// ******************************************************

/*
1. Crear las variables correspondientes para leer tu nombre,
apellido y edad e imprimirlos por consola en una oración.*/

import java.util.ArrayList;
import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        //Creo el objeto Scanner para leer lo que se escriba en la consola
        Scanner escaner = new Scanner(System.in);
        //Leer nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = escaner.nextLine();
        // Leer el apellido
        System.out.print("Ingresa tu apellido: ");
        String apellido = escaner.nextLine();

        // Leer la edad
        System.out.print("Ingresa tu edad: ");
        int edad = escaner.nextInt();

        // Imprimir los datos
        System.out.println("Hola, " + nombre + " " + apellido + ". Tenes " + edad + " años.");
    }
}*/

// ******************************************************

/*
2. Realizar un pequeño programa que permita ingresar 3 números
e imprimir por consola cuál es el mayor.
 */

/*public class Main {
    public static void main(String[] args) {
        //Creo el objeto Scanner para leer lo que se escriba en la consola
        Scanner escaner = new Scanner(System.in);

        //Toma de datos por cansola
        System.out.print("Ingresa el primer número: ");
        double num1 = escaner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        double num2 = escaner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        double num3 = escaner.nextInt();

        // Comparación para encontrar el numero mas grande
        double mayor = num1;
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }

        System.out.println("El número mayor ingresado es: "+ mayor);

    }
}*/

// ******************************************************

/*
3. Realizar un pequeño programa que permita el ingreso de un
número e imprimir por consola su paridad.
 */

/*public class Main {
    public static void main(String[] args) {
        //Creo el objeto Scanner para leer lo que se escriba en la consola
        Scanner escaner = new Scanner(System.in);

        //Toma de datos por cansola
        System.out.print("Ingresa un número: ");
        long num = escaner.nextInt();

        // Comprobar si el numero ingresado es par o impar
        if (num % 2 == 0) {
            System.out.println("El número ingresado " +"'"+ num +"' "+ "es par.");
        } else {
            System.out.println("El número ingresado " +"'"+ num +"' "+ "es impar.");
        }


    }
}*/

// ******************************************************

/*
4. Crear el código correspondiente que permita ingresar 2 cadenas
de caracteres e imprima por consola si son iguales o no.
 */

/*public class Main {
    public static void main(String[] args) {
        //Creo el objeto Scanner para leer lo que se escriba en la consola
        Scanner escaner = new Scanner(System.in);

        //Toma de datos por cansola
        System.out.print("Ingresa una cadena de caracteres: ");
        String primerCadena = escaner.nextLine();

        System.out.print("Ingresa otra cadena de caracteres: ");
        String segundaCadena = escaner.nextLine();

        // Comparar cadenas
        if (primerCadena.equals(segundaCadena)) {
            System.out.println("Las cadenas de caracteres son iguales.");
        } else {
            System.out.println("Las cadenas de caracteres NO son iguales.");
        }


    }
}*/

// ******************************************************

/*
5. Realizar un pequeño programa que permita el ingreso de
números, almacenarlos en una colección hasta ingresar un 0.
 */

/*public class Main {
    public static void main(String[] args) {
        //Creo el objeto Scanner para leer lo que se escriba en la consola
        Scanner escaner = new Scanner(System.in);

        //Creo el array
        ArrayList numeros = new ArrayList<>();

        // Toma los números hasta que se ingrese un 0
        System.out.println("Ingresa los números (pulse 0 para terminar):");
        int numero;
        do {
            numero = escaner.nextInt();
            numeros.add(numero);
        } while (numero != 0);

        // Imprimir en consola los números ingresados
        System.out.println("Números ingresados:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + ", ");
        }
    }
}*/

// ******************************************************

/*
6. Crear una función que imprima un mensaje de bienvenida en la
consola.
 */

/*public class Main {
    public static void main(String[] args) {

        // Declaro la función de bienvenida
        mensajeBienvenida();
    }

    // Imprimir en consola el mensaje
    public static void mensajeBienvenida() {
        System.out.println("Bienvenido, ésta es la consola de Java");
    }

}*/

// ******************************************************

/*
7. Crear una función que reciba un número entero y devuelva si es
par o impar en forma de texto.
 */

/*public class Main {
    public static void main(String[] args) {
        // Llamamos a la función y mostramos el resultado en éste caso como ejemplo puse el "2" para probar
        int numero = 2;
        String resultado = paridad(numero);
        System.out.println("El número " + numero + " es " + resultado + ".");
    }
        // Función para determinar la paridad
        public static String paridad(int numero){
            if (numero % 2 == 0) {
                return "par";
            } else {
                return "impar";
            }
        }

    }*/

// ******************************************************

/*
8. Crear una función que reciba un número y devuelva si el mismo
es primo o no.
 */

/*public class Main {
    public static void main(String[] args) {
        // Llamamos a la función y mostramos el resultado, en éste caso como ejemplo puse el "2" para probar.
        int numero = 2;
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }

    // Función para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

}*/

// ******************************************************

/*
9. Crear una función que reciba una colección de números y
devuelva la suma de los números impares.
 */

/*public class Main {
    public static void main(String[] args) {
        // Creo una lista de números como ejemplo
        ArrayList numeros = new ArrayList();
        numeros.add(4);
        numeros.add(1);
        numeros.add(5);
        numeros.add(2);
        numeros.add(19);

        // Llamamos a la función y mostramos el resultado
        int sumaImpares = sumarNumerosImpares(numeros);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }

    // Función para sumar los números impares de una colección
    public static int sumarNumerosImpares(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                suma += numero;
            }
        }
        return suma;
    }

}*/

// ******************************************************

/*
10. Crear una función que reciba una colección de números e
imprima los números pares y la suma de los números primos.
 */

/*public class Main {
    public static void main(String[] args) {
        // Objeto Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        // Leer los números y almacenarlos en un array
        ArrayList numeros = new ArrayList();
        System.out.println("Ingresa los números (pulsa 0 para terminar):");
        int numero;
        do {
            numero = scanner.nextInt();
            numeros.add(numero);
        } while (numero != 0);

        // Llamamos a la función para imprimir los números pares
        imprimirNumerosPares(numeros);

        // Llamamos a la función para imprimir la suma de los números primos
        int sumaPrimos = sumarNumerosPrimos(numeros);
        System.out.println("Los números primos suman un total de: " + sumaPrimos);
    }

    // Función para imprimir los números pares de una colección
    public static void imprimirNumerosPares(ArrayList<Integer> numeros) {
        System.out.println("Los números pares ingresados son:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }

    // Función para sumar los números primos de una colección
    public static int sumarNumerosPrimos(ArrayList<Integer> numeros) {
        int sumaPrimos = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                sumaPrimos += numero;
            }
        }
        return sumaPrimos;
    }

    // Función para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}*/

// ******************************************************

/*
11. Crear una función que imprima por consola un pequeño
menú con las opciones básicas de una calculadora agregando
la opción 0 para salir del mismo.
 */

/*public class Main {
    public static void main(String[] args) {
        menu();
    }

    // Función del menú de la calculadora
    public static void menu() {
        System.out.println("Menú Calculadora");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("0) Salir");
    }
}*/

// ******************************************************

/*
12. Crear otra función que ocupe la del punto anterior para poder crear una pequeña calculadora usando switch.
    Tener en cuenta el caso de la división por 0.
 */

/*public class Main {
    public static void main(String[] args) {
        menu();
    }

    // Función del menú de la calculadora
    public static void menu() {
        Scanner escaner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Calculadora");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("0) Salir");
            System.out.print("Ingresa una opción: ");

            opcion = escaner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 0:
                    System.out.println("Cerrado");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
            }
        } while (opcion != 0);

        escaner.close();
    }

    // Funciones para realizar las operaciones
    public static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingresa el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("No se puede dividir entre 0.");
        } else {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

}*/

// ******************************************************

/*
13. Crear el algoritmo necesario para poder gestionar el ingreso a un boliche.
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Objeto Scanner para leer los datos ingresados.
        int capacidadMaxima = 500; // Capacidad máxima del boliche.
        int capacidadActual = 0; // Capacidad inicial (personas dentro del boliche)
        int dineroRecaudado = 0; // Dinero total recaudado

        // Muestra el menú en consola
        System.out.println("Menú principal:");
        System.out.println("1) Ingreso de datos");
        System.out.println("2) Capacidad disponible");
        System.out.println("3) Dinero recaudado");
        System.out.println("4) Salir");
        System.out.println("Seleccione una opción: ");

        int opcion = scanner.nextInt(); // Lee la opción ingresada por el usuario.

        // Condicionales para las opciones del menú

        if (opcion == 1) {
            System.out.println("Nombre: ");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            System.out.println("Edad: ");
            int edad = scanner.nextInt();
            System.out.println("DNI: ");
            int dni = scanner.nextInt();
            System.out.println("Tipo de pase (Normal / VIP / Descuento): ");
            scanner.nextLine();
            String tipoPase = scanner.nextLine();

            if (edad >= 21) {
                // Si es mayor de 21 y con pase VIP
                if (tipoPase.equalsIgnoreCase("VIP")) { // equalsIgnoreCase compara la cadena de texto contra un objeto ignorando mayúsculas y minúsculas.
                    System.out.println("Adelante, " + nombre);
                    capacidadActual++; // Incrementa la capacidad actual
                } else if (tipoPase.equalsIgnoreCase("Descuento")) {
                    System.out.print("La entrada normal con descuento vale $750 o la vip con descuento vale $1000, cuál comprás? ");
                    String tipoEntrada = scanner.nextLine();
                    if (tipoEntrada.equalsIgnoreCase("normal")) {
                        dineroRecaudado += 750;
                    } else if (tipoEntrada.equalsIgnoreCase("vip")) {
                        dineroRecaudado += 1000;
                    }
                    capacidadActual++;
                    System.out.println("Adelante, " + nombre);
            } else {
                    System.out.print("¿La entrada normal vale $1500 o la vip vale $2000, cuál comprás? ");
                    String tipoEntrada = scanner.nextLine();
                    if (tipoEntrada.equalsIgnoreCase("normal")) {
                        dineroRecaudado += 1500;
                    } else if (tipoEntrada.equalsIgnoreCase("vip")) {
                        dineroRecaudado += 2000;
                    }
                    capacidadActual++;
                    System.out.println("Adelante, " + nombre);
                }
            }else {
                    System.out.println("Ingreso solo para mayores de 21 años.");
                }

            } else if (opcion == 2) {
                int capacidadDisponible = capacidadMaxima - capacidadActual;
                System.out.println("Capacidad disponible: " + capacidadDisponible);
            } else if (opcion == 3) {
                System.out.println("Dinero recaudado: " + dineroRecaudado);
            } else if (opcion == 4) {
                System.out.println("Saliendo del sistema...");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
    }
}