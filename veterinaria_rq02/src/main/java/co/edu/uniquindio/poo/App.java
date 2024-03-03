package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Mascota {
    int id;
    String nombre;
    String especie;
    String raza;
    int edad;
    char genero;
    String color;
    double peso;

    public Mascota(int id, String nombre, String especie, String raza, int edad, char genero, String color, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
    }
}

class SistemaGestionVeterinaria {
    List<Mascota> mascotas;

    public SistemaGestionVeterinaria() {
        mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public List<Mascota> obtenerMascotasMayoresA10Años() {
        return mascotas.stream().filter(mascota -> mascota.edad > 10).collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaGestionVeterinaria sistema = new SistemaGestionVeterinaria();

        // Agregar Mascotas

        sistema.agregarMascota(new Mascota(1, "Luna", "Perro", "Labrador", 8, 'H', "Negro", 15.5));
        sistema.agregarMascota(new Mascota(2, "Milo", "Gato", "Siames", 12, 'M', "Blanco", 7.2));

        // Obtener lista de mascotas mayores a 10 años
        List<Mascota> mayoresA10Anios = sistema.obtenerMascotasMayoresA10Años();

        // Imprimir la lista de mascotas mayores a 10 años

        System.out.println("Mascotas mayores a 10 años:");
        for (Mascota mascota : mayoresA10Años) {
            System.out.println("ID: " + mascota.id + ", Nombre: " + mascota.nombre + ", Edad: " + mascota.edad);
        }
    }
}

