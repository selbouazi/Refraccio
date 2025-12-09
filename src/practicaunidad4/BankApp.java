package practicaunidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe principal que gestiona les operacions sobre un compte bancari.
 * Permet ingressar, retirar diners i consultar el saldo mitjançant un menú interactiu.
 * 
 * @author Soulaimane El Bouazi Houman
 */
public class BankApp {

    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Demana a l'usuari una quantitat i la ingressa al compte.
     *
     * @param comptePrincipal compte sobre el qual es realitza l'ingrés
     */
    public static void ingresar(CCuenta comptePrincipal) {
        try {
            System.out.println("Quant de	sitja ingressar?: ");
            double cantidad = Double.parseDouble(dato.readLine());
            comptePrincipal.ingresar(cantidad);
            System.out.println("Ingrés realitzat correctament");
        } catch (NumberFormatException e) {
            System.out.println("Error: heu d'introduir un número vàlid");
        } catch (Exception e) {
            System.out.println("Error en l'ingrés: " + e.getMessage());
        }
    }

    /**
     * Demana a l'usuari una quantitat i la retira del compte.
     *
     * @param comptePrincipal compte sobre el qual es realitza la retirada
     */
    public static void retirar(CCuenta comptePrincipal) {
        try {
            System.out.println("Quant desitja retirar?: ");
            double cantidad = Double.parseDouble(dato.readLine());
            comptePrincipal.retirar(cantidad);
            System.out.println("Retirada realitzada correctament");
        } catch (NumberFormatException e) {
            System.out.println("Error: heu d'introduir un número vàlid");
        } catch (Exception e) {
            System.out.println("Error en la retirada: " + e.getMessage());
        }
    }

    /**
     * Mostra el menú d'operacions i retorna l'opció seleccionada per l'usuari.
     *
     * @return opció seleccionada (1 = ingressar, 2 = retirar, 3 = finalitzar)
     */
    public static int mostrarMenu() {
        int opcion = 0;
        try {
            System.out.println("\nMENÚ D'OPERACIONS");
            System.out.println("-----------------");
            System.out.println("1 - Ingressar");
            System.out.println("2 - Retirar");
            System.out.println("3 - Finalitzar");
            System.out.print("Seleccioneu una opció: ");
            opcion = Integer.parseInt(dato.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: heu d'introduir un número vàlid");
        }
        return opcion;
    }

    /**
     * Gestiona el flux principal del programa, mostrant el menú i executant les operacions
     * sobre el compte fins que l'usuari decideix finalitzar.
     *
     * @param comptePrincipal compte sobre el qual es realitzen les operacions
     */
    public static void gestionarCompte(CCuenta comptePrincipal) {
        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    ingresar(comptePrincipal);
                    break;
                case 2:
                    retirar(comptePrincipal);
                    break;
                case 3:
                    System.out.println("Finalitzem l'execució");
                    break;
                default:
                    System.out.println("Opció errònia");
            }
        } while (opcion != 3);
    }

    /**
     * Punt d'entrada del programa. Crea un compte principal amb dades inicials
     * i inicia la gestió de les operacions.
     *
     * @param args arguments de la línia de comandes (no utilitzats)
     */
    public static void main(String[] args) {
        CCuenta comptePrincipal = new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);
        gestionarCompte(comptePrincipal);
        double saldoActual = comptePrincipal.getSaldo();
        System.out.println("El saldo actual és: " + saldoActual);
    }
}
