import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int E1 = 0, E2 = 0, E3 = 0, C = 0, E = A;
        String N1 = "Cici", N2 = "Lilia", N3 = "Nolan";
        String N1 = U ;
        String N2 = U ;
        String N3 = U ;


        System.out.print("Número de usuarios a ingresar: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        while (C < N) {
            System.out.println("Nombre del usuario: " + N++);
            String U = scanner.nextLine();

            System.out.println("Edad del usuario: ");
            int A = scanner.nextInt();
            scanner.nextLine();

            if (C == 0) {
                N1 = U;
                E1 = A;
            } else if (C == 1) {
                N2 = U;
                E2 = A;
            } else if (C == 2) {
                N3 = U;
                E3 = A;
            }

            if (A >= 18) {
                System.out.println(U + " es mayor de edad.");
            } else {
                System.out.println(U + " es menor de edad.");
            }

            if (A > 120 || A < 1) {
                System.out.println("Edad no válida.");
            }

            C = C + 1;
        }

        System.out.println("Resumen: ");
        System.out.println("Usuario 1: Cici " + N1 + " - Edad: " + E1);
        System.out.println("Usuario 2: Lilia " + N2 + " - Edad: " + E2);
        System.out.println("Usuario 3: Nolan " + N3 + " - Edad: " + E3);
    }
}
