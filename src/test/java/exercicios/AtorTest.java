package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtorTest {
    private Ator ator;
    private Papel papel;
    private Filme filme;

    @BeforeEach
    public void beforeEach() {
        ator = new Ator("Bruce");

        filme = new Filme("Batman o Cavaleiro das Trevas",
                2008);

        papel = new Papel("Batman", true,
                ator, filme);
    }

    @AfterEach
    public void afterEach() {
        ator = null;
        papel = null;
        filme = null;
    }

    @Test
    public void construtorAtor() {
        ator = new Ator("Bruce");

        assertEquals("Bruce", ator.getNome());
    }

    @Test
    @DisplayName("Deve criar um objeto Ator")
    public void presencaAtributos() {
        assertNotNull(ator.getNome());
    }

    @Test
    public void metodoSetNomeValorValido() {
        ator.setNome("Wayne");
        assertEquals("Wayne", ator.getNome());
    }

    @Test
    public void metodoSetNomeValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ator.setNome(null));
        assertEquals("O nome não pode ser nulo. ", exception.getMessage());
    }

    @Test
    public void metodoGetNome() {
        assertEquals("Bruce", ator.getNome());
    }

    @Test
    public void metodoAddPapeis() {
        ator.addPapeis(papel);

        for (Papel p: ator.getPapeis()) {
            assertEquals("Batman", p.getNome());
        }
    }

    @Test
    public void metodoGetPapeis() {
        for (Papel p: ator.getPapeis()) {
            assertEquals("Batman", p.getNome());
        }
    }

    @Test
    public void metodoGetFilmes() {
        Filme filme = new Filme("Batman Begins",
                2005);

        Filme filme1 = new Filme("The Dark Knight",
                2008);

        Filme filme2 = new Filme("The Dark Knight Rises",
                2012);

        Papel papel = new Papel("Ra's al Ghul", false,
                ator, filme);

        Papel papel1 = new Papel("Batman", true,
                ator, filme1);

        Papel papel2 = new Papel("Joker", true,
                ator, filme2);

        ator.addPapeis(papel);

        for (Filme f: ator.getFilmes()) {
            if (f.getTitulo() == "Batman Begins") {
                assertEquals("Batman Begins", f.getTitulo());
            } else if (f.getTitulo() == "The Dark Knight") {
                assertEquals("The Dark Knight", f.getTitulo());
            } else
                assertEquals("The Dark Knight Rises", f.getTitulo());
        }
    }

    @Test
    public void metodoAtuouNoAno() {
        ator.addPapeis(papel);
        assertEquals(true, ator.atuouNoAno(2008));
    }

}
