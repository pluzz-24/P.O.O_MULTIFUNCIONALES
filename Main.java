package Ejercicio2;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" PRUEBA DE DISPOSITIVOS ");
        System.out.println("\nCual tipo de accion desea realizar? ");
        System.out.println("\n1) Imprimir\n2) Imprimir y copiar\n3) Imprimir, copiar y escanear\n4) Imprimir matricialmente\n5) Todas las anterirores ");
        int opcion = sc.nextInt();


        MULTIFUNCIONAL001 m1 = new MULTIFUNCIONAL001();
        MULTIFUNCIONAL002 m2 = new MULTIFUNCIONAL002();
        MULTIFUNCIONAL003 m3 = new MULTIFUNCIONAL003();
        ImpresoraMatricial mat = new ImpresoraMatricial();
        MULTIFUNCIONALFULL mFull = new MULTIFUNCIONALFULL();



        switch (opcion) {
            case 1:
                m1.imprimir();
                break;
            case 2:
                m2.imprimir();
                m2.copiar();
                break;
            case 3:
                m3.imprimir();
                m3.copiar();
                m3.escaner();
                break;
            case 4:
                mat.imprimir();
                break;
            case 5:
                mFull.imprimir();
                mFull.copiar();
                mFull.escaner();
                mFull.fax();
                break;
            default:
                System.out.println("Opción inválida.");
        }
        sc.close();
}
}

























