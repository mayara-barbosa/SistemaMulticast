package multicastprova;

import java.util.List;

/**
 *
 * @author mayara.barbosa
 */
public class Processo {

    List<Integer> processos;
    
    public  synchronized void imprimirProcessos(){
        
        for(int p: processos ){
            System.out.println(p);
        }
        
    }
    public List<Integer> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Integer> processos) {
        this.processos = processos;
    }
   
   //contains
    //add
   
   
   
       
  }
 
