import java.util.Scanner;

/**
 * Clase que proporciona métodos para convertir números decimales a binario en
 * formato IEEE-754 de precisión simple.
 *
 * @author
 *         Dulce Ambrosio - 231143
 *         Daniel Chet - 231177
 *         Javier Benitez - 23405
 *         Javier Linares - 231135
 *         Anggelie Velásquez - 221181
 *         Cristian Túnchez - 231359
 */

public class IEEE754_Convertidor {

    /**
     * Convierte un número decimal en formato IEEE 754 de precisión simple a
     * binario.
     *
     * @param decimalNumber Número decimal a convertir.
     * @return Representación binaria del número en formato IEEE 754.
     */
    public static String decimalAIEEE754(float decimalNumber) {
        int floatBits = Float.floatToIntBits(decimalNumber);
        return Integer.toBinaryString(floatBits);
    }

    /**
     * Convierte un número binario en formato IEEE 754 de precisión simple a
     * decimal.
     *
     * @param binaryIEEE754 Número binario en formato IEEE 754.
     * @return Valor decimal del número binario en formato IEEE 754.
     */
    public static float IEEE754ADecimal(String binaryIEEE754) {
        int floatBits = Integer.parseInt(binaryIEEE754, 2);
        return Float.intBitsToFloat(floatBits);
    }

    /**
     * Realiza una demostración automática de la conversión de decimal a binario
     * IEEE 754 y viceversa.
     */
    public static void demonstration() {
        float decimalNumber = 25.75f;
        String binaryIEEE754 = decimalAIEEE754(decimalNumber);
        System.out.println("Demostración automática:");
        System.out.println("Número decimal: " + decimalNumber);
        System.out.println("Número binario IEEE 754: " + binaryIEEE754);
        float decimalResult = IEEE754ADecimal(binaryIEEE754);
        System.out.println("Número decimal obtenido: " + decimalResult);
    }

    /**
     * Método principal que maneja la entrada del usuario y muestra un menú para
     * realizar las conversiones.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("-------------------Menu-------------------");
            System.out.println("1. Convertir decimal a binario IEEE 754");
            System.out.println("2. Convertir binario IEEE 754 a decimal");
            System.out.println("3. Demostración automática");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el número decimal: ");
                    float decimalNumber = scanner.nextFloat();
                    String binaryIEEE754 = decimalAIEEE754(decimalNumber);
                    System.out.println("Decimal " + decimalNumber + " en binario IEEE 754: " + binaryIEEE754);
                    break;
                case 2:
                    System.out.print("Ingrese el número binario IEEE 754: ");
                    String binaryNumber = scanner.next();
                    float decimalResult = IEEE754ADecimal(binaryNumber);
                    System.out.println("Binario IEEE 754 " + binaryNumber + " en decimal: " + decimalResult);
                    break;
                case 3:
                    demonstration();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 4.");
                    break;
            }
        } while (option != 4);
        scanner.close();
    }
}