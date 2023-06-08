package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes & ALISrj
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción

        System.out.print("Ingrese 1 para ingresar un estudiante a Distancia\n"
                + "Ingrese 2 para ingresar un estudiante Presencial\n> ");
        String opcion = entrada.nextLine();

        if ("1".equals(opcion)) {

            System.out.println("Ingrese nombres");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de asignaturas");
            int asignaturas = entrada.nextInt();
            System.out.println("Ingrese costo asignatura");
            double costoAsignatura = entrada.nextDouble();
            EstudianteDistancia estudiante = new EstudianteDistancia();

            estudiante.establecerNombresEstudiante(nombres);
            estudiante.establecerApellidoEstudiante(apellidos);
            estudiante.establecerEdadEstudiante(edad);
            estudiante.establecerIdentificacionEstudiante(identificacion);
            estudiante.establecerNumeroAsginaturas(asignaturas);
            estudiante.establecerCostoAsignatura(costoAsignatura);
            estudiante.calcularMatriculaDistancia();
            System.out.printf("\n%s\n", estudiante);
            
        } else if ("2".equals(opcion)) {

            System.out.println("Ingrese nombres");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de creditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo credito");
            double costoCreditos = entrada.nextDouble();
            EstudiantePresencial e1 = new EstudiantePresencial();

            e1.establecerNombresEstudiante(nombres);
            e1.establecerApellidoEstudiante(apellidos);
            e1.establecerIdentificacionEstudiante(identificacion);
            e1.establecerEdadEstudiante(edad);
            e1.establecerNumeroCreditos(creditos);
            e1.establecerCostoCredito(costoCreditos);
            e1.calcularMatriculaPresencial();
            System.out.printf("\n%s\n", e1);
        } else {
            System.out.println("Opcion incorrecta.\n");
        }

        

    }
}
