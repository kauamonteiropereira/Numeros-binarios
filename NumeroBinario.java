import java.util.Scanner;

public class NumeroBinario {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        for (int numero = 0; numero <= 100; numero++) {
        String binario = Integer.toBinaryString(numero);
        System.out.println("Número " + numero + " - Binario " + binario);
        }
    }
}