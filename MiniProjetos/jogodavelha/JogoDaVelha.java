
package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Eric Guimarães
 */
public class JogoDaVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int proximo=2;
        String p;
        
        Jogo partida = new Jogo();         
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Jogador 1, digite seu nome: ");
        partida.Cadastra(ler.next(),1);
        System.out.print("Jogador 2, digite seu nome: ");
        partida.Cadastra(ler.next(),2);      
        
        partida.plotaMatriz();
        
        
        while(partida.lances < 9){
            if (proximo == 2){
                System.out.print("Jogador 1 (X), digite uma posicao: ");
                p = ler.next();
                while(!partida.Valida(p)){
                    System.out.println("Posicao ja preenchida!!!");
                    System.out.print("Jogador 1 (X), digite uma posicao novamente: ");
                    p = ler.next();
                    }
                partida.InsereJogada(p,"X");
                proximo = 1;
                partida.plotaMatriz();
        
               if(partida.VerificaVencedor() != "null")
                   break;
                   
            }
            else {
                System.out.print("Jogador 2 (O), digite uma posicao: ");
                p = ler.next();
                while(!partida.Valida(p)){
                    System.out.println("Posicao ja preenchida!!!");
                    System.out.print("Jogador 2 (O), digite uma posicao novamente: ");
                    p = ler.next();
                    }
                partida.InsereJogada(p,"O");
                proximo = 2;
                partida.plotaMatriz();
                if(partida.VerificaVencedor() != "null")
                   break;
            }            
  
            partida.lances++;
        } 
    System.out.println("O vencedor foi: "+partida.VerificaVencedor());
    }   
}
