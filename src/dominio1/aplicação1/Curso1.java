package dominio1.aplicação1;

public class Curso1 {
    private String título;
    private String descricao;
    private int cargaHoraria;
    
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
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [título=" + título + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }


   







}
