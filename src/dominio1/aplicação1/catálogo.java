package dominio1.aplicação1;


public class catálogo {
    public static void main(String[] args) {
        Série série = new Série();
série.setTítulo("The Vampirie Diaries");
série.setSinopse("Alguns meses depois que seus pais são mortos em um trágico acidente de carro, Elena Gilbert e seu irmão Jeremy tentam aplacar sua dor. Para Elena, que sempre foi popular e envolvida com a escola e amigos, é uma luta esconder sua tristeza do mundo. Ela se vê atraída por um novo estudante bonitão e misterioso, Stefan, sem saber que o jovem é um vampiro centenário fazendo o melhor para viver em paz entre os humanos. Seu irmão Damon, porém, é o típico estereótipo de vampiro, incluindo a violência e a brutalidade. Os irmãos travam uma guerra pelas almas de Elena e de todos na pequena cidade do estado da Virginia.");
série.setQuantidadeTemporada(8);

Filme filme = new Filme();
       filme.setTítulo("Clube da Luta");
       filme.setSinopse("Um homem deprimido que sofre de insônia conhece um estranho vendedor chamado Tyler Durden e se vê morando em uma casa suja depois que seu perfeito apartamento é destruído. A dupla forma um clube com regras rígidas onde homens lutam. A parceria perfeita é comprometida quando uma mulher, Marla, atrai a atenção de Tyler.");
       filme.setDiretor("David Fincher");



System.out.println(série);
System.out.println(filme);













    }
}
