

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("firulai", 3, "Labrador");
        Gato gato = new Gato("petronila", 2, true);


        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println(" ");


        gato.mostrarInfo();
        gato.hacerSonido();
    }
}