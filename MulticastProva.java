package multicastprova;

import java.io.IOException;
import java.net.DatagramPacket;

/**
 *
 * @author mayara.barbosa
 */
public class MulticastProva {

    public static void main(String[] args) throws IOException {
        
        Processo processo = new Processo();
        Communication comunicacao = new Communication();
        //ThreadAYA aya = new ThreadAYA();
        //ThreadIAA iaa = new ThreadIAA();
        //aya.start():
        //iaa.start();
        
        comunicacao.sendMulticast("JOIN");
        
        while(true){
            try{
                DatagramPacket packet = comunicacao.receiveMulticast();
                String data = comunicacao.getData(packet);
                System.out.println(data);
                if(packet.getPort()== comunicacao.getID()){
                    
                    //add usuario
                    comunicacao.sendUnicast("WELCOME", packet.getAddress(), packet.getPort());
                }
                
                 
            }catch(Exception ex){
                
            }
        }
        
        
     
    }
    
}
