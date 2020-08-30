package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtorTest {
    private Ator ator;
    private Papel papel;
    private Filme filme;

    @BeforeEach
    public void beforeEach() {

        ator = new Ator("Bruce", papel);

        papel = new Papel("Batman", true,
                ator, filme);

        filme = new Filme("Batman o Cavaleiro das Trevas",
                2008, papel);

    }

    @AfterEach
    public void afterEach() {
        ator = null;
    }

    @Test
    public void construtorAtor() {
        ator = new Ator("Bruce", papel);

        papel = new Papel("Batman", true,
                ator, filme);

        filme = new Filme("Batman o Cavaleiro das Trevas",
                2008, papel);

        assertEquals("Bruce", ator.getNome());

    }

}
