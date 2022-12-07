public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente.edad = 23;
        Cliente.nombre = "Alejandro";
        Cliente.telefono = "4641-2575";
        Cliente.credito = 1248;
        System.out.println("La edad de " + cliente.nombre + " es " + cliente.edad + ", su teléfono es " + cliente.telefono + " , y su crédito es de " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        Trabajador.salario = 125.57;
        System.out.println("El salario de " + Cliente.nombre + " es de " + Trabajador.salario);
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
