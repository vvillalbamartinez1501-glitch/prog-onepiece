public class Main {
    public static void main(String[] args) {
        // prueba 1
        Pirata luffy;
        Pirata zoro;
        Barco thousandSunny;

        luffy = new Pirata (1,"Monkey D. Luffy",1234567890);
        zoro  = new Pirata (2,"Zoro",3.14159265358979323846264338327950288419716939937510592307);
        thousandSunny = new Barco("Thousan Sunny",100);

        luffy.toString();
        zoro.toString();
        thousandSunny.toString();
    }
}
