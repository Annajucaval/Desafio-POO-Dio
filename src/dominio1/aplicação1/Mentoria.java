package dominio1.aplicação1;

import java.time.LocalDate;

public class Mentoria {
     private String título;
    private String descricao;
    private LocalDate Data;
    
    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getData() {
        return Data;
    }
    public void setData(LocalDate data) {
        Data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [título=" + título + ", descricao=" + descricao + ", Data=" + Data + "]";
    } 


    



















}
