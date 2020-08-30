import exercicios.Ator;
import exercicios.Filme;
import exercicios.Papel;

public class Main {
    public static void main(String[] args) {
        Ator ator = new Ator("Bruce", papel);

        Papel papel = new Papel("Batman", true,
                ator, filme);

        Filme filme = new Filme("Batman o Cavaleiro das Trevas",
                2008, papel);

    }

}
