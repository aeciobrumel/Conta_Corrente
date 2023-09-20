import java.util.Date;
import java.text.SimpleDateFormat;
import com.mycompany.trabalhoaula8.Client;
import Client;
/**
 *
 * @author Aécio Brumel, Yago Russo e JUNKE
 */



public class ContaCorrente {
    
    private Client objclient;
    private float saldo;
    private String  movimentos;
    private float taxa;

    public ContaCorrente(Client objclient) {
        this.objclient = objclient;
        this.taxa=0.005f;
    }

    
    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
       this.taxa=taxa;
    }
  
 
    public void deposito(float valor){
        this.saldo+= valor;
        this.movimentos += "deposito de:"+valor+"reais\n";
    }
    
    
     
    public void sacar(float valor) {
        
        
  
        this.saldo = valor-(valor * getTaxa());
        this.movimentos += "Saque: - R$" + valor + " Taxa: - R$" + (valor * getTaxa());
    }
   
    
   

    public float getSaldo() {
        return this.saldo;
    }
    
    public void extrato(){
        System.out.println("Extrato da Conta de " + objclient.getName() + ":");
        System.out.println("Cpf: " + objclient.getCpf()+ ":");
        System.out.println("Extrato: \n" +this.movimentos);
        System.out.println("Saldo atual: R$" + saldo+"\n\n\n");
        }
    }
 
    

    
    
    
    
