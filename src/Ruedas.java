public class Ruedas {
    private String marca;
    private float tamanio;
    private boolean inflada;

    public Ruedas(String marca, float tamanio, boolean inflada) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.inflada = false;
    }

    public void inflar() {
        this.inflada = true;
        System.out.println("La rueda esta inflada");
    }
}
