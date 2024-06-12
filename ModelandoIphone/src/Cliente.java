import iphone.Iphone;

public class Cliente {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("11912144739");
        iphone.tocar();
        iphone.seleccionarMusica("Here comes the sun");
        iphone.adicionarNovaAba();
    }
}
