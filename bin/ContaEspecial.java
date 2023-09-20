package com.mycompany.trabalhoaula8;

/**
 *
 * @author Aécio Brumel, Yago Russo e JUNKE
 */
public class ContaEspecial extends  ContaCorrente {
    
    
    
    ContaEspecial(Client objclient){
        super(objclient); 
        super.setTaxa(0.001f);

    }
    
    public void saqueEspecial(float valor) {
        super.sacar(valor);
  
        }

        
}