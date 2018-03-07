package jogodavelha;
/**
 * @author Eric Guimarães
 */
public class Jogo {
     String[][] pos ={ {"1","2","3"},{"4","5","6"},{"7","8","9"} };
     private String user1;
     private String user2;
     int lances = 0;


    public void Cadastra(String nome, int n){
       if(n==1)
        this.user1 = nome;
       else
        this.user2 = nome; 
    } 
//--------------------------------------------------------------------------
    public void plotaMatriz(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print("    "+pos[i][j]);
            }
            System.out.println("\n");
        }
    }
    //--------------------------------------------------------------------------
    public boolean Valida(String p){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(pos[i][j].equals(p)) {

                    return true;
                }
            }
        }
        return false;
    }
    //--------------------------------------------------------------------------
    public void InsereJogada(String p, String val){
        System.out.println("Inserindo: "+p);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(pos[i][j].equals(p))   
                    pos[i][j]=val;
            }
        }

    }
    //--------------------------------------------------------------------------

    public String VerificaVencedor(){
    String K[] = new String[8];
    String vencedor;
         vencedor = "null";
    if (lances == 9){
        vencedor = "EMPATE";
        }
    //verifica linhas
    K[0] = pos[0][0]+pos[0][1]+pos[0][2];
    K[1] = pos[1][0]+pos[1][1]+pos[1][2];
    K[2] = pos[2][0]+pos[2][1]+pos[2][2];
    //verifica colunas
    K[3] = pos[0][0]+pos[1][0]+pos[2][0];
    K[4] = pos[0][1]+pos[1][1]+pos[2][1];
    K[5] = pos[0][2]+pos[1][2]+pos[2][2];
    //verifica diagonais
    K[6] = pos[0][0]+pos[1][1]+pos[2][2];
    K[7] = pos[0][2]+pos[1][1]+pos[2][0];

    for(int i=0;i<8;i++){
        if(K[i].equals("XXX")){
            vencedor = user1;
        }
        else if(K[i].equals("OOO")){
            vencedor = user2;
        }
    return vencedor;
            
};return null;    

        
       
 