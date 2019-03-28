import java.lang.String;

public class Aplicacion {

    public static void main(String[] args) {

        Cola c1 = new Cola();

        Paciente a1 = new Paciente("Alberto","frecuentes mareos");
        Paciente a2 = new Paciente("Ana", "infeccion resistente");
        Paciente a3 = new Paciente("Eva","problemas digestivos");

        c1.encolar(a1);
        c1.encolar(a2);
        c1.encolar(a3);


        c1.verCola();
        System.out.println("------------------");

        c1.desencolar();
        c1.desencolar();
        c1.desencolar();

        c1.colaVacia();


        c1.verCola();

    }


}

