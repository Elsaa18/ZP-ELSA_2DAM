package unidades.tema5.sistemaAgroalimentario;

class ProductoIberico extends ProductoExtremadura {
    private int purezaRaza;

    public ProductoIberico(String denominacion, double precioKilo, double[] producciones, int purezaRaza) {
        super(denominacion, precioKilo, producciones);
        this.purezaRaza = purezaRaza;
    }

    @Override
    public double calcularSubvencion() {
        if (this.purezaRaza == 100) {
            return 2000 + (super.getPrecioKilo() * 0.05);
        } else {
            return 1000;
        }
    }

    public String obtenerColorEtiqueta() {
        if (this.purezaRaza == 100) return "Etiqueta Negra";
        if (this.purezaRaza == 75) return "Etiqueta Roja";
        if (this.purezaRaza == 50) return "Etiqueta Verde";
        return "Sin etiqueta válida";
    }
}
