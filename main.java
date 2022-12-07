public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente.edad = 23;
        Cliente.nombre = "Alejandro";
        Cliente.telefono = "4641-2575";
        Cliente.credito = 1248.47;
        System.out.println("La edad de " + Cliente.nombre + " es " + Cliente.edad + ", su teléfono es " + Cliente.telefono + " , y su crédito a favor es de $" + Cliente.credito);

        Trabajador trabajador = new Trabajador();
        Trabajador.edad = 35;
        Trabajador.nombre = "Juan José";
        Trabajador.telefono = "7485-6741";
        Trabajador.credito = 4875.78;
        Trabajador.salario = 1257.57;
        System.out.println("La edad de " + Trabajador.nombre + " es " + Trabajador.edad + ", su teléfono es " + Trabajador.telefono + " , y su crédito a favor es de $" + Trabajador.credito + ". El salario de " + Trabajador.nombre + " es de $" + Trabajador.salario);
    }

}

class Persona {
    static int edad;
    static String nombre;
    static String telefono;
}

class Cliente extends Persona {
    static double credito;
}

class Trabajador extends Cliente {
    static double salario;
}
