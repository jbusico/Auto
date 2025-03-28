public class Tanque {
    private double capacidadTotal;
    private double capacidadActual;
    private String tipoDeNafta;

    public Tanque(double capacidadTotal, double capacidadActual, String tipoDeNafta) {
        this.capacidadTotal = capacidadTotal;
        this.capacidadActual = capacidadActual;
        this.tipoDeNafta = tipoDeNafta;
    }

    public double porcentajeTanque() {
        return (capacidadActual * 100) / capacidadTotal;
    }

    public double getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(float capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(float capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoDeNafta() {
        return tipoDeNafta;
    }

    public void setTipoDeNafta(String tipoDeNafta) {
        this.tipoDeNafta = tipoDeNafta;
    }
}

