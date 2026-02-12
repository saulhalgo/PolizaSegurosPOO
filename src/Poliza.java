public abstract class Poliza {
    private String numeroPoliza;
    private String Titular;
    protected double montoBase;


    //inicializamos los datos
    public Poliza(String numeroPoliza, String titular, double montoBase) {
        this.numeroPoliza = numeroPoliza;
        Titular = titular;
        this.montoBase = montoBase;
    }

    public abstract double calcularPrima();

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public String getTitular() {
        return Titular;
    }
}
