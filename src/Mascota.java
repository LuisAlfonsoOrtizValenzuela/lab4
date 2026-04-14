public class Mascota {

    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("La mascota hace:");
    }

    public void mostrarInfo() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}