/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoaula8;

/**
 *
 * @author Aécio Brumel, Yago Russo e Eduardo junges
 */
public class SpecialAccount extends  CurrentAccount {
    
    
    
    SpecialAccount(Client objclient){
        super(objclient); 
        super.setRate(0.001f);

    }
    
    public void saqueEspecial(float value) {
        super.withDraw(value);
  
        }

        
}
