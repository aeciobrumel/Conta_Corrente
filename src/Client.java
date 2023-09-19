import java.time.LocalDate;

public class Client {
    private String name;
    private String cpf;
    private String rg;
    private LocalDate birth;

    public Client(String name, String cpf, String rg, LocalDate birth) {
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

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Client [name=" + name + ", cpf=" + cpf + ", rg=" + rg + ", birth=" + birth + "]";
    }
}