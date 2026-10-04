package unidades.tema5.sistemaAgroalimentario;

class ProductoVegetal extends ProductoExtremadura {
    private boolean esEcologico;
    private double hectareas;

    public ProductoVegetal(String denominacion, double precioKilo, double[] producciones, boolean esEcologico, double hectareas) {
        super(denominacion, precioKilo, producciones);
        this.esEcologico = esEcologico;
        this.hectareas = hectareas;
    }

    @Override
    public double calcularSubvencion() {
        double base = 150 * this.hectareas;
        if (this.esEcologico) {
            base = base * 1.5;
        }
        return base;
    }
}
