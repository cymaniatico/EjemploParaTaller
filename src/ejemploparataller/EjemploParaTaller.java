/*
 *Programa en Java que muestra el listado de 15 estudiantes con nombre y tiempo
 *Tambien muestra el promedio de tiempos y el nombre del estudiante con el menor
 *tiempo.
 */
package ejemploparataller;

import java.util.Scanner;

/**
 *
 * @author Luis Carlos Garcia
 */
public class EjemploParaTaller {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double promedio, totalTiempos = 0, menorTiempo;
        int posicion=0;
        String [] primerNombre = new String[15];
        double [] tiempo = new double[15];
        for (int i = 0; i < tiempo.length; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            primerNombre[i] = leer.next();
            System.out.println("Ingrese el tiempo");
            tiempo[i]= leer.nextDouble();
        }
        menorTiempo=tiempo[0]; //tomamos el primer valor como referencia
        for (int i = 0; i < tiempo.length; i++) {
            totalTiempos+= tiempo[i];
            System.out.println(primerNombre[i]+"\t"+tiempo[i]);
            if(tiempo[i]<menorTiempo){
                menorTiempo = tiempo[i];
                posicion=i;
            }
        }
        System.out.println("El promedio de tiempos es: "+(totalTiempos/tiempo.length));
        System.out.println("El estudiante más rapido fue "+primerNombre[posicion]+ " con "+tiempo[posicion]);
    }
    
}
