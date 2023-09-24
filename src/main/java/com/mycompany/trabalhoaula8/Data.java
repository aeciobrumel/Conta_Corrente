/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoaula8;

/**
 *
 * @author Aécio Brumel, Yago Russo e Eduardo Junges
 */

public class Data
{
    // ATRIBUTOS
    int dia;
    int mes;
    int ano; 
    
    // METODOS
    void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    String getDataFormatada() {
        return String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
    }
    
    int getAge(Data atual) {
        return 0;
    }
}

