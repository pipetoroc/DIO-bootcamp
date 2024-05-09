public class App {
    public static void main(String[] args) throws Exception {

        TvSmart tvSmart = new TvSmart();
        tvSmart.ligar();

        tvSmart.aumentarVolumen();
        tvSmart.cambiarCanal();
    }
}