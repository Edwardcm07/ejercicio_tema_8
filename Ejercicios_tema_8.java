// Para practicar la encapsulación:

// Crear clase Persona.

// Crear variables las privadas edad, nombre y telefono de la clase Persona.

// Crear gets y sets de cada propiedad.

// Crear un objeto persona en el main.

// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

public class Ejercicios_tema_8 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad();
        persona.setNombre();
        persona.setTelefono();

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad() {
        edad = 35;
    }

    public String getEdad() {
        return "La edad es " + edad;
    }

    public void setNombre() {
        nombre = "Alejandro";
    }

    public String getNombre() {
        return "el nombre es  " + nombre;
    }

    public void setTelefono() {
        telefono = 2785656;
    }

    public String getTelefono() {
        return "el telefono es " + telefono;
    }

}
