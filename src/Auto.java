public class Auto {
    private String marca;
    private int anio;
    private String modelo;
    private Ruedas ruedas;
    private Motor motor;
    private Tanque tanque;
    private String color;

    public Auto(String marca, int anio, String modelo, Ruedas ruedas, Motor motor, Tanque tanque, String color) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.ruedas = ruedas;
        this.motor = motor;
        this.tanque = tanque;
        this.color = color;
    }

    public int edadAuto(int anioActual) {
        return anioActual - this.anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Ruedas getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas ruedas) {
        this.ruedas = ruedas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
