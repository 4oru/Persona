import java.util.Scanner;

public class PersonaController {

    public void  crearPersonaConsole(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de la persona: ");
        String nombre = sc.nextLine();

        System.out.println("Apellido de la persona: ");
        String apellido = sc.nextLine();

        System.out.println("Edad de la persona: ");
        int edad = sc.nextInt();

        System.out.println("DNI de la persona: ");
        String dni = sc.nextLine();

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEdad(edad);
        persona.setDni(dni);

    }

}

