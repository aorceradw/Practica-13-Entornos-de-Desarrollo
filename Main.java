import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del alumno: ");
        String nombre = teclado.nextLine();

        mostrarNombreAlumno(nombre);

        teclado.close();
    }

    public static void mostrarNombreAlumno(String nombre) {
        System.out.println("El nombre del alumno/a es: " + nombre);
    }
}
