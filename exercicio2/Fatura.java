public class Fatura {
     
    private String codigo;
    private String descricao;
    private int item;
    private double preco;

    public Fatura(String codigo, String descricao, int item, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.item = item;
        this.preco = preco;
    }

    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
   
    
    public double getTotalFatura(){
    double valor = (this.getItem()*this.getPreco());
        if(valor > 0){
            return valor;
        }else{
            valor = 0.0;
        return valor;
                }
    }
    
    
}
