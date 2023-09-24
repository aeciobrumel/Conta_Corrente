/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author Aécio Brumel, Yago Russo e Eduardo Junges
 */
public class InvoiceTest {
    public static void main(String args[]){
        Scanner read = new Scanner (System.in);
        
        Invoice p1 = new Invoice("000523","Pendrive", 2, 15);
        Invoice p2 = new Invoice("055236","cooler",3,0);
        Invoice p3 = new Invoice("086732", "Cd",1,-12);
        
        System.out.println("fatura "+p1.getDescription()+'\n');
        System.out.println("ficou "+p1.getTotalInvoice());
        System.out.println("\n--------------------------\n");
        System.out.println("fatura "+p2.getDescription()+'\n');
        System.out.println("ficou:"+p2.getTotalInvoice());
        System.out.println("\n--------------------------\n");
        System.out.println("fatura "+p3.getDescription()+'\n');
        System.out.println("ficou "+p3.getTotalInvoice());
        
        
        
        
    }
    
}
