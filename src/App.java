public class App {
    public static void main(String[] args) throws Exception {
        int anioActual = 2025;
        Auto auto = new Auto("Ford", 2015, "Mustang", new Ruedas("Pirelli", 15, true), new Motor(false), new Tanque(20.5, 10.5, "Quantium"), "Rojo");

        System.out.println(auto.getColor());
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
        System.out.println(auto.getMotor());
        System.out.println(auto.getRuedas());
        System.out.println(auto.getTanque());
                
        /* System.out.println(anioActual);
        System.out.println(auto.getColor());

        auto.setColor("Verde");
        System.out.println(auto.getColor());

        System.out.println(auto.edadAuto(anioActual));

        System.out.println(auto.getTanque().getTipoDeNafta()); */
    }     
}