import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista para almacenar cualquier tipo de póliza
        ArrayList<Poliza> listaPolizas = new ArrayList<>();

        // 1. Creamos una Póliza de Vida para un asegurado de 50 años, fumador
        PolizaVida pv1 = new PolizaVida("VIDA-001", "Saúl Hidalgo", 1000.0, "Maria Arcos", 50, 200000.0, true);

        // 2. Creamos una Póliza de Vida para un asegurado joven, no fumador
        PolizaVida pv2 = new PolizaVida("VIDA-002", "Juan Pérez", 1000.0, "Ana Pérez", 25, 100000.0, false);

        // Agregamos las pólizas a nuestra lista
        listaPolizas.add(pv1);
        listaPolizas.add(pv2);

        // Si tuvieras una clase PolizaAuto, también podrías agregarla aquí:
        // listaPolizas.add(new PolizaAuto("AUTO-123", "Pedro Picapiedra", 500.0, "Tesla Model 3"));

        System.out.println("--- REPORTE MENSUAL DE PÓLIZAS ---");
        System.out.println("----------------------------------");

        double totalPrimas = 0;

        for (Poliza p : listaPolizas) {
            // Aquí ocurre el polimorfismo: p.calcularPrima() sabe si debe
            // usar la lógica de Vida o la lógica base de Poliza.
            double primaActual = p.calcularPrima();
            totalPrimas += primaActual;

            // Mostramos los detalles usando el método que creaste
            if (p instanceof PolizaVida) {
                ((PolizaVida) p).detallesDatos(); // Hacemos un 'cast' para acceder a detalles específicos
            }

            System.out.println("Monto de la prima: $" + primaActual);
            System.out.println("----------------------------------");
        }

        System.out.println("TOTAL RECAUDADO POR PRIMAS: $" + totalPrimas);
    }
}