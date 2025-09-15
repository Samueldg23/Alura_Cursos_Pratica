public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.ano = 1970;
        meuFilme.duracao = 185;

        System.out.println(meuFilme.nome);
    }
}
