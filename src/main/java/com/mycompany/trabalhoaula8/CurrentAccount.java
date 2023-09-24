/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoaula8;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.mycompany.trabalhoaula8.Client;
import java.util.Calendar;
        
/**
 *
 * @author Aécio Brumel, Yago Russo e Eduardo junges
 */



public class CurrentAccount {
    
    private Client objclient;
    private float balance;
    private String  moviments;
    private float rate;

    public CurrentAccount(Client objclient) {
        this.objclient = objclient;
        this.rate=0.005f;
    }

    public float getRate() {
        return rate;
    }
    public void setRate(float taxa) {
       this.rate=taxa;
    }
  
    public void deposit(float valor){
        this.balance+= valor;
        this.moviments += "deposito de:"+valor+"reais\n";
    }
    
    public void withDraw(float valor) {
       
        this.balance = valor-(valor * getRate());
        this.moviments += "Saque: - R$" + valor + " Taxa: - R$" + (valor * getRate());
    }

    public float getBalance() {
        return this.balance;
    }
    
    public void extract(){
        System.out.println("Extrato da Conta de " + objclient.getName() + ":");
        System.out.println("Cpf: " + objclient.getCpf()+ ":");
        System.out.println("Extrato: \n" +this.moviments);
        System.out.println("Saldo atual: R$" + balance+"\n\n\n");
        }
    }
 
    

    
    
    
    
