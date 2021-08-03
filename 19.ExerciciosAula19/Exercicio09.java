import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args){
        /**09. Criar dois vetores A e B cada um com 10 elementos inteiros. 
         * Construir um vetor C, onde cada elemento de C é a divisão dos respectivos 
         * elementos em A e B, ou seja: C[i] = A[i] / float(B[i]) */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[10];
        double vetC[] = new double[10];
        
        System.out.println("** Divisao dos Vetores A e B **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
        }

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor B: ");
            vetB[i] =  scan.nextInt();
            vetC[i] = vetA[i] / vetB[i];
        }

        System.out.println("\n** Elementos vetor C **");
        for (int i = 0; i < vetC.length; i ++){
            System.out.println("A posicao " + (i + 1) + " do vetor C eh : " + vetC[i]);
        }
    }
}