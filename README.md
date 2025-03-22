
## Ejercicio 1 - **MuymalHecho**

 En la linea 5 la s no sirve, en su defecto se modifico a scanner.
 En la linea 8 no vi necesario  usar println, quité ln y en el mensaje puse un espacio. que pendeja, en la linea 9 no habia usado el cerebro, S es scanner!!, yo haciendola variable.
En la linea 9 y 10 se cambio la S con scanner...
 
Olvide todo lo anterior, modifiqué la ubicacion de las variables en int y string y los puse antes de hacer todo el proceso, ahora, luego de eso modifiqué todas las s.nextLine y s.nextInt por scanner.nextLine y scanner.nextInt.
en la linea 12 quité println y dejé print, no se me hizo necesario hacer un espacio.
di valores a los String N1, N2, N3 = U ,  en la fila 20 pensé que sería buena idea sumarle a la U para que ubiqiue los N1, N2 y N3 pero no estoy segura, bueno, igual se que otras cosas están mal.
relacioné la A con Edad, y la U con el nombre del usuario. No di para hacerlo con While. lo habría re hecho con For que se me hace mas facil, pero me centré en el stupdo While que justo ayer solo miré que era, pero no como se veia, no vi los ejemplos, F.
______________________________________________________________________________________________________________________________________________________________
## Ejercicio 2 – **LaNotablísimaPrueba™**

> El Ministerio de Evaluaciones Sin Sentido ha encargado un sistema para evaluar estudiantes, pero el programador que lo hizo estaba más enfocado en su café que en la lógica. Este programa:
> 
1. Recibe **3 notas por estudiante**.
2. Calcula el promedio.
3. Si el promedio es **mayor o igual a 3.0**, el estudiante aprueba.
4. Se evalúan exactamente **4 estudiantes**.
5. Al final, se imprime cuántos aprobaron.

______________________________________________________________________________________________________________________________________________________________
Entonces, inicio con el import  porque vamos a necesitar dar valores, obviamente. doy el nombre del ejercicio y luego pasamos a lo que vinimos.
Entonces se me hace mas facil con los for para los estudiantes e if en los promedios, entonces lo haré con ellos. en el ejercicio anterior ni me acuerdo como es que funciona con el while, asi que me disculpo porque probablemente quedó re mal. En fin, inicio con un int que termine en lo que necesito. paso a los for  para solicitar de cada estudiante los valores que necesito  para recibir las 3 notas por cada estudiante por teclado. Calculo el promedio con el resultado de las sumas de las notas por estudiante y luego hago el promedio para que me de el resultado por cada estudiante y por totalidad. ahora sigue el if, entonces añadí calcular el numero de reprobados ya que ps no costaba tanto si ya he hecho el de aprobados. al final despues de que diga los aprobados y reprobados, necesariamente diria yo pero bueno, yo lo hice de todos modos, da el resultado de los estudiantes aprobados, esto solo lo hice porque el punto 5 dice que al final, y al final estaba era los reprobados v:
_____________________________________________________________________FIN______________________________________________________________________________________ 

import java.util.Scanner;

public class LaNotablísimaPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EstudiantesAprobados = 0;  
        final int numeroEstudiantes = 4;

        for (int i = 1; i <= numeroEstudiantes ; i++) {
            System.out.println("Estudiante " + i + " : ");
            double sumaNotas = 0; 

            for (int j = 1; j <= 3 ; j++) { 
                System.out.print("  Nota " + j + " : ");
                double nota = sc.nextDouble();
                sumaNotas += nota;
            } 
            double promedio = sumaNotas / 3;
            System.out.println(" El promedio es: " + promedio);

            if (promedio >= 3.0) {  
                System.out.println(" Resultado: Aprobado\n");
                EstudiantesAprobados++;  
            } else {
                System.out.println(" Resultado: Reprobado\n"); 
            }  
        }
        System.out.println("El número total de estudiantes aprobados es: " + EstudiantesAprobados);
    }
}
