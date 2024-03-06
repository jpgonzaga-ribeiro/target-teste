package org.example;


public class Main {
    public static void main(String[] args) {
        //Atividade 1
        // 91

        //Atividade 2
        if (Fibonacci(7)){
            System.out.println("Teste 2 - O número informado pertence à sequência de fibonacci");
        }else {
            System.out.println("Teste 2 - O número informado não pertence à sequência de fibonacci ");
        }


        //Atividade 3
        /*a) 9
          b) 128
          c) 49
          d) 100
          e) 13
          f)Infelizmente não consegui descobrir a lógica. */

        //ATIVIDADE 4

        /*Antes de ir até alguma sala de minha escolha, ativaria um interruptor qualquer e iria até a sala, //1 IDA
          se a sala estiver com a luz acesa eu excluo aquele interruptor pois já obtive a resposta desejada
          e repetiria o processo, antes de ir a uma sala, ativaria outro interruptor  //2 IDA
          se a outra sala estiver com a lâmpada desligada, eu obteria a resposta de todos os interruptores*/

        System.out.println();
        String x = "abcde";
        System.out.println("Teste 5 - String original -  " + x + "\nString reversa : " + ReversaoString(x));

    }

    public static boolean Fibonacci(int n){ //Atividade 2
        int a = 0;
        int b = 1;

        while (b < n) {
            int temp = a+b;
            a = b;
            b = temp;
        }
        return b==n;
    }

    public static String ReversaoString(String str){
        char[] x = str.toCharArray(); // Transforma a string em um vetor de caracteres
        int i= 0;
        int lx = x.length - 1; //Variavel onde recebe o o último índice do vetor de caracteres

        char temp;
        while(i< lx){
            temp = x[i];
            x[i] = x[lx];
            //TROCA DE CARACTERES DA ESQUERDA PARA À DIREITA
            x[lx] = temp;
            // MOVE ÍNDICE PARA OS PROXIMOS CARACTERES
            i++;
            lx--;
        }
        return String.valueOf(x);
    }
}