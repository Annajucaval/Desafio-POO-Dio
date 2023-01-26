package dominio1.aplicação1;

public class Filme {
    private String título;
    private String sinopse;
    private String Diretor;
    
    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public String getDiretor() {
        return Diretor;
    }
    public void setDiretor(String diretor) {
        Diretor = diretor;
    }
    @Override
    public String toString() {
        return "Filme [título=" + título + ", sinopse=" + sinopse + ", Diretor=" + Diretor + "]";
    }
    
    

}
