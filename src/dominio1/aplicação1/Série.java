package dominio1.aplicação1;


public class Série {
     private String título;
    private String sinopse;
    private int quantidadeTemporada;

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
    public int getQuantidadeTemporada() {
        return quantidadeTemporada;
    }
    public void setQuantidadeTemporada(int quantidadeTemporada) {
        this.quantidadeTemporada = quantidadeTemporada;
    }
    @Override
    public String toString() {
        return "Série [título=" + título + ", sinopse=" + sinopse + ", quantidadeTemporada=" + quantidadeTemporada
                + "]";
    }
    
   
    











}
