import exercicios.Ator;
import exercicios.Filme;
import exercicios.Papel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ator ator = new Ator("Bruce");

        Filme filme = new Filme("Batman Begins",
                2005);

        Filme filme1 = new Filme("The Dark Knight",
                2008);

        Filme filme2 = new Filme("The Dark Knight Rises",
                2012);

        Papel papel = new Papel("Batman", true,
                ator, filme);

        Papel papel1 = new Papel("Joker", false,
                ator, filme1);

        Papel papel2 = new Papel("Ra's Ghul", false,
                ator, filme2);

        ator.addPapeis(papel);
        ator.addPapeis(papel1);
        ator.addPapeis(papel2);

        for (Filme f: ator.getFilmes()) {
            System.out.println(f.getAno());
        }

        System.out.println(ator.atuouNoAno(2007));
    }

}
