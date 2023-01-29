public class Main {
    public static void main(String[] args) {

    int resultado =  suma(5, 3 ,7);
    System.out.println(resultado);

    Coche miCoche = new Coche();
    miCoche.AgregarPuerta();
    miCoche.AgregarPuerta();
    System.out.println(miCoche.puertas);


    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int puertas = 4;
    public void AgregarPuerta(){
        this.puertas++;
    }

}