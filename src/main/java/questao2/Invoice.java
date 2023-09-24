/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author Aécio Brumel, Yago Russo e Eduardo Junges
 */
public class Invoice {
    
    private String code;
    private String description;
    private int item;
    private double price;

    public Invoice(String code, String description, int item, double price) {
        this.code = code;
        this.description = description;
        this.item = item;
        this.price = price;
    }

    
    
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   
    
    public double getTotalInvoice(){
    double value = (this.getItem()*this.getPrice());
        if(value > 0){
            return value;
        }else{
            value = 0.0;
        return value;
                }
    }
    
    
}
