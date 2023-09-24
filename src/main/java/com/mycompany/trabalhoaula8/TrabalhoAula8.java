/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhoaula8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Aécio Brumel, Yago Russo e JUNKE
 */
public class TrabalhoAula8 {
  public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Criar clientes
        Date birth1 = dateFormat.parse("01/01/1990");
                
        Client cliente1 = new Client("João", "12345678901", "1234567", birth1);
        
        
        
        
        Date birth2 = dateFormat.parse("15/05/1985");
        Client cliente2 = new Client("Maria", "98765432101", "7654321", birth2);

        // Criar contas correntes
        CurrentAccount conta1 = new CurrentAccount(cliente1);
        SpecialAccount conta2 = new SpecialAccount(cliente2);

        // Realizar algumas transações
        
        conta1.deposit(1000);
        
      
        conta1.withDraw(500);
        
        
        
        conta2.deposit(1000);
        
        conta2.withDraw(500);

        // Exibir extratos
        conta1.extract();
        System.out.println("o cliente tem"+cliente1.getBirth());
        conta2.extract();
    }
}

