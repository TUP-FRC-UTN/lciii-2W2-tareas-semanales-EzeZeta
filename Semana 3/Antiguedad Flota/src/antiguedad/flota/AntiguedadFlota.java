
package antiguedad.flota;


import java.util.Scanner;
import java.util.Calendar;


public class AntiguedadFlota {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Calendar fechaActual = Calendar.getInstance();
        
        int anioFab;
        int antiguedad;
        int anioActual;
        int contAutos;
        int cantPocoUso;
        int contAutosMuyAnt;
        int cero;
 
        
        anioActual = fechaActual.get(Calendar.YEAR);
        contAutos=0;
        cantPocoUso=0;
        contAutosMuyAnt=0;
        //antiguedad = 0;
        cero=0;
        
        System.out.println("Bienvenido al programa de clasificacion vehicular");
        System.out.println("Recuerde que para salir debera ingresar 0 en Año de Fabricacion");
        do {
            
            System.out.println("Ingrese el año de fabricacion: ");
            
            anioFab = lector.nextInt();
            
            if (anioFab == 0) {
            cero = 0;
            }
            else {
                cero=1;
                antiguedad = anioActual - anioFab;
                
                if (antiguedad >= 0 && antiguedad <= 5){                    
                    System.out.println("Clasificacion: NUEVO");
                    contAutos ++;
                }
                else {
                    if (antiguedad >= 5 && antiguedad <= 10){
                        System.out.println("Clasificacion: POCO USO");
                        contAutos++;
                        cantPocoUso++;
                    }
                    else {
                        if (antiguedad >=10 && antiguedad <= 20){
                            System.out.println("Clasificacion: MUCHO USO");
                            contAutos++;
                        }
                        else {
                            if (antiguedad >= 20)
                            {
                                System.out.println("Clasificacion: MUY ANTIGUO");
                                contAutos++;
                                contAutosMuyAnt++;
                            }
                        }
                    }
                }
             }
        }
        while (cero !=0);
            System.out.println("La cantidad de total de autos es: "+ contAutos);
            System.out.println("La cantidad de autos con clasificacion POCO USO es: " + cantPocoUso);
            System.out.println("El promedio de antiguedad de los vehiculos (sin incluir MUY ANTIGUOS) es: %" + (contAutos-contAutosMuyAnt)*100/contAutos);
            
            
    }
}

           
            
            
                             
        
        
        
        
       
   

