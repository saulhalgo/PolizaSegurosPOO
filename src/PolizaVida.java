public class PolizaVida extends Poliza {

    private String beneficiario;
    private int edadAsegurado;
    private double sumaAsegurado;
    private boolean esFumador;

    public PolizaVida(String numeroPoliza, String titular, double montoBase, String beneficiario, int edadAsegurado, double sumaAsegurado, boolean esFumador) {
        super(numeroPoliza, titular, montoBase);
        this.beneficiario = beneficiario;
        this.edadAsegurado = edadAsegurado;
        this.sumaAsegurado = sumaAsegurado;
        this.esFumador = esFumador;
    }

    @Override
    public double calcularPrima() {
        // 1. Calculamos la tasa base (2%)
        double resultado = sumaAsegurado * 0.02;

        // 2. Aplicamos recargo por edad (+15%)
        if (edadAsegurado > 45) {
            resultado *= 1.15; // Esto es igual a: resultado = resultado + (resultado * 0.15)
        }

        // 3. Aplicamos recargo por fumador (+10%)
        // Nota: Lo sacamos del IF anterior para que aplique a cualquier edad
        if (esFumador) {
            resultado *= 1.10;
        }

        return resultado;
    }

    public void detallesDatos() {
        System.out.println("--- Detalles de la Póliza de Vida ---");
        System.out.println("Titular: " + getTitular()); // Suponiendo que Poliza tiene getTitular
        System.out.println("Beneficiario: " + beneficiario);
        System.out.println("Prima Total: $" + calcularPrima());
    }
}