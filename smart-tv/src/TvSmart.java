import java.util.Scanner;

public class TvSmart {
    
    boolean ligada = true;
    int canal = 10;
    int volumen = 50;

    public void ligar(){
        System.out.println("A tv esta ligada?: " + ligada);
    }

    public void aumentarVolumen(){
        System.out.println("Aumentando volumen de " + volumen + " a " + ++volumen);
    }

    public void cambiarCanal(){
        Scanner sc = new Scanner(System.in);
        int novoCanal;

        System.out.println("se você quer oumentar o canal em 1 insera 1, se quer diminuir insera 2, para escrever um novo canal insira 0");
        novoCanal = sc.nextInt();
        System.out.println(novoCanal);

        if (novoCanal == 1) {
            System.out.println("Cambiando o canal de " + canal + " a " + ++canal);
        } else if(novoCanal == 2){
            System.out.println("Cambiando o canal de " + canal + " a " + --canal);
        } else if(novoCanal == 0){
            System.out.println("insira novo canal: ");
            novoCanal = sc.nextInt();

            System.out.println("Cambiando o canal de " + canal + " para: " + novoCanal);
        } else{
            System.out.println("Não podemos mudar o canal com sua escolha");
        }

        sc.close();
    }
}
