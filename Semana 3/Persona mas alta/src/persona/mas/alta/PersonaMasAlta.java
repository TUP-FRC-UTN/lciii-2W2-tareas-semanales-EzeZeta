
package persona.mas.alta;

import java.util.Scanner;

public class PersonaMasAlta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double altura;
        String nombreMasAlto;
        int bandera;
        int contador;
        String nombrePersona;

        double acu;

        entrada = new Scanner(System.in);
        altura = 0;
        bandera = 0;
        contador = 0;
        acu = 0;
        nombreMasAlto = "";
        nombrePersona = "";

        for (int i = 0; i < 2; i++) {
            
            System.out.println("Ingrese el nombre: ");
            
            nombrePersona = entrada.next();
            //entrada.nextLine();
            System.out.println("Ingrese altura: ");
            altura = entrada.nextInt();

            if (bandera == 0) {
                nombreMasAlto = nombrePersona;
                acu = altura;
                bandera++;

            } else {
                if (acu < altura) {
                    nombreMasAlto = nombrePersona;
                }

            }

        }
        System.out.println("El nombre de la persona mas alta es:  " + nombreMasAlto);

    }

}
