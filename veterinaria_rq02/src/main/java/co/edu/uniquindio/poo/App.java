package co.edu.uniquindio.poo;

import java.util.List;



public class App {
    public static void main(String[] args) {
        Veterinaria sistema = new Veterinaria();

        // Mascotas agregadas

        int id;
        String nombre;
        String especie;
        Mascota mascota1 = new Mascota(id:1, nombre: "Paco", especie: "Canino", "Labrador", 9, 'M', "Cafe_y_negro", 15.5);

       

        // Obtener lista de mascotas mayores a 10 años

        List<Mascota> mayoresA10Anios = sistema.obtenerMascotasMayoresA10Anios();

        // Imprimir la lista de mascotas mayores a 10 años

        System.out.println("Mascotas mayores a 10 años:");
        for (Mascota mascota : mayoresA10Anios) {
            System.out.println("ID: " + mascota.id + ", Nombre: " + mascota.nombre + ", Edad: " + mascota.edad);
        }
    }
}
