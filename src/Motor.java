public class Motor {
    private boolean encendido;

    public Motor(boolean encendido) {
        this.encendido = false;
    }
    
    public void encendido() {
        this.encendido = true;
        System.out.println("El motor esta encendido");
    }
}

