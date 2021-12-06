/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefinal;

/**
 *
 * @author João Vitor
 */
public class ex3 {

    public static void main(String[] args) {
        double sala1[] = new double[7];
        double sala2[] = new double[7];
        double sala3[] = new double[7];
        int meVendas[] = new int[7];
        int meVendas1[] = new int[7];
        int meVendas2[] = new int[7];

        int sala, x, encerrar, maisVendas, menosVendas, vendaSala1, vendaSala2, vendaSala3, diaMaior, diaMenor;
        double valor;

        encerrar = 0;
        sala = 0;
        valor = 0;
        x = 0;
        maisVendas = 0;
        menosVendas = 0;
        vendaSala1 = 0;
        vendaSala2 = 0;
        vendaSala3 = 0;
        diaMaior = 0;
        diaMenor = 999;

        while (encerrar != 1) {

            encerrar = Input.readInt("Deseja encerrar o programa ? 1 - Sim 0 - Não ");

            if (encerrar == 1) {
                System.out.println("Sala 1");
                for (x = 0; x < 7; x++) {
                    System.out.println(sala1[x]);
                }
                System.out.println();
                System.out.println("Sala 2");
                for (x = 0; x < 7; x++) {
                    System.out.println(sala2[x]);
                }
                System.out.println();
                System.out.println("Sala 3");
                for (x = 0; x < 7; x++) {
                    System.out.println(sala3[x]);
                }

                System.out.println("A sala com mais vendas foi a: " + maisVendas);
                System.out.println("O dia com mais vendas foi: " + diaMaior);
                System.out.println();
                System.out.println("A sala com menos vendas foi a: " + menosVendas);
                System.out.println("O dia com menos vendas foi: " + diaMenor);
                System.exit(0);
            }

            x = Input.readInt("Qual é o dia da semana ?");
            sala = Input.readInt("Qual o número da sala para qual o ingresso foi vendido? ");
            if (sala > 3) {
                System.out.println("Sala inexistente! ");
                sala = Input.readInt("Qual o número da sala para qual o ingresso foi vendido? ");
            }
            if (sala > 3) {
                System.out.println("Você tá me zoando?! ");
                sala = Input.readInt("Qual o número da sala para qual o ingresso foi vendido? ");
            }
            if (sala > 3) {
                System.out.println("Ultima chance cara 👌😒 ");
                sala = Input.readInt("Qual o número da sala para qual o ingresso foi vendido? ");
            }
            if (sala > 3) {
                System.exit(0);
            }
            valor = Input.readDouble("Qual o valor do ingresso vendido?");

            //Armazena os valores dos ingressos nos vetores!
            if (sala == 1) {
                meVendas[x - 1] = meVendas[x - 1] + 1;
                sala1[x - 1] = sala1[x - 1] + valor;
                vendaSala1++;
            }
            if (sala == 2) {
                meVendas1[x - 1] = meVendas[x - 1] + 1;
                sala2[x - 1] = sala2[x - 1] + valor;
                vendaSala2++;
            }
            if (sala == 3) {
                meVendas2[x - 1] = meVendas[x - 1] + 1;
                sala3[x - 1] = sala3[x - 1] + valor;
                vendaSala3++;
            }
            //Termina o armazenamento de valores aqui!

            //Decide a maior venda
            if (vendaSala1 > vendaSala2 & vendaSala1 > vendaSala3) {
                maisVendas = 1;
            }
            if (vendaSala2 > vendaSala1 & vendaSala2 > vendaSala3) {
                maisVendas = 2;
            }
            if (vendaSala3 > vendaSala2 & vendaSala3 > vendaSala1) {
                maisVendas = 3;
            }

            if (vendaSala1 < vendaSala2 & vendaSala1 < vendaSala3) {
                menosVendas = 1;
            }
            if (vendaSala2 < vendaSala1 & vendaSala2 < vendaSala3) {
                menosVendas = 2;
            }
            if (vendaSala3 < vendaSala2 & vendaSala3 < vendaSala1) {
                menosVendas = 3;
            }

            //Dia com mais vendas
            for (x = 0; x < 7; x++) {
                if (sala1[x] > sala2[x] & sala1[x] > sala3[x]) {
                    diaMaior = x - 1;
                }
                if (sala2[x] > sala1[x] & sala2[x] > sala3[x]) {
                    diaMaior = x - 1;
                }
                if (sala3[x] > sala2[x] & sala3[x] > sala1[x]) {
                    diaMaior = x - 1;
                }
            }
            //Dias com menos vendas
            for (x = 0; x < 7; x++) {
                if (sala1[x] < sala2[x] & sala1[x] < sala3[x]) {
                    diaMenor = x + 1;
                }
                if (sala2[x] < sala1[x] & sala2[x] < sala3[x]) {
                    diaMenor = x + 1;
                }
                if (sala3[x] < sala2[x] & sala3[x] < sala1[x]) {
                    diaMenor = x + 1;
                }
            }
        }
    }
}
