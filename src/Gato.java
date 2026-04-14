public class Gato extends Mascota {

    private boolean esDeInterior;


    public Gato(String nombre, int edad, boolean esDeInterior) {
        super(nombre, edad);
        this.esDeInterior = esDeInterior;
    }

    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("MIIIAAAUUUU");
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Es de interior? = " + esDeInterior);
    }
}