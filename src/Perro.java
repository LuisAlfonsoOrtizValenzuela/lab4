public class Perro extends Mascota {

    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("GGGGUAAAAAUUU");
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("La raza del perro es: " + raza);
    }
}