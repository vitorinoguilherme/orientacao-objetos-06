package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTest {
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
    public void construtorFilme() {
        filme = new Filme("Batman o Cavaleiro das Trevas",
                2008);

        assertEquals("Batman o Cavaleiro das Trevas", filme.getTitulo());
        assertEquals(2008, filme.getAno());
    }

    @Test
    @DisplayName("Deve criar um objeto Filme")
    public void presencaAtributos() {
        assertNotNull(filme.getTitulo());
        assertNotNull(filme.getAno());
    }

    @Test
    public void metodoSetTituloValorValido() {
        filme.setTitulo("Batman Begins");
        assertEquals("Batman Begins", filme.getTitulo());
    }

    @Test
    public void metodoSetTituloValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> filme.setTitulo(null));
        assertEquals("O título não pode ser nulo. ", exception.getMessage());
    }

    @Test
    public void metodoGetTitulo() {
        assertEquals("Batman o Cavaleiro das Trevas", filme.getTitulo());
    }

    @Test
    public void metodoSetAnoValorValido() {
        filme.setAno(2007);
        assertEquals(2007, filme.getAno());
    }

    @Test
    public void metodoSetAnoValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> filme.setAno(0));
        assertEquals("Ano deve ser maior que 0", exception.getMessage());
    }

    @Test
    public void metodoGetAno() {
        assertEquals(2008, filme.getAno());
    }

    @Test
    public void metodoAddPapel() {
        ator = new Ator("Luany");
        filme.addPapel(ator, "Mulher Gato", true);

        for (Papel p: filme.getPapeis()) {
            assertEquals("Mulher Gato", p.getNome());
        }
    }

    @Test
    public void metodoGetPapeis() {
        for (Papel p: filme.getPapeis()) {
            assertEquals("Batman", p.getNome());
        }
    }

    @Test
    public void metodoGetAtores() {
        Ator ator = new Ator("João");
        Ator ator1 = new Ator("Jorge");
        Ator ator2 = new Ator("Luany");

        filme.addPapel(ator, "Ra's al Ghul", false);
        filme.addPapel(ator1, "Batman", true);
        filme.addPapel(ator2, "Joker", false);

        for (Ator t: filme.getAtores()) {
            if (t.getNome() == "João") {
                assertEquals( "João", t.getNome());
            }
            else if (t.getNome() == "Jorge") {
                assertEquals( "Jorge", t.getNome());
            }
            else {
                assertEquals( "Luany", t.getNome());
            }
        }
    }

    @Test
    public void metodoGetProtagonistaFilmeSemProtagonista() {
        ator = new Ator("Ed Sharp");

        filme = new Filme("Deadpool",
                2008);

        papel = new Papel("Deadpool", false,
                ator, filme);

        assertEquals(null, filme.getProtagonista());
    }

    @Test
    public void metodoGetProtagonistaFilmeComProtagonista() {
        ator = new Ator("Luany");

        filme = new Filme("Mulher Gato",
                2008);

        filme.addPapel(ator, "Mulher Gato", true);

        assertEquals("Luany", filme.getProtagonista().getNome());
    }

}
