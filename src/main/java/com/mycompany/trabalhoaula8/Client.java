/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoaula8;
/**
 *
 * @author Aécio Brumel, Yago Russo e Eduardo Junges
 */
import java.util.Calendar;
import java.time.LocalDate;
import java.util.Date;

public class Client {
    private String name;
    private String cpf;
    private String rg;
    private Date birth;
    
    
    
    
    
    
    public Client(String name, String cpf, String rg, Date birth) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.birth = birth;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(int day, int month, int year) {
                
        
    }
    

    
    
    
    
}