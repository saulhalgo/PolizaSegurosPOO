public class PolizaAuto extends Poliza {

    int anioModelo;

    public PolizaAuto(String numeroPoliza, String titular, double montoBase, int anioModelo) {
        super(numeroPoliza, titular, montoBase);
        this.anioModelo = anioModelo;
    }

    @Override
    public double calcularPrima() {
        double montoFinal=montoBase;

        if(anioModelo<2015){
            montoFinal+=500.00;

        }else{
            montoFinal+=200.00;
        }
        return montoFinal;
    }
}
