package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    public void metodoGetTitulo() {
        assertEquals("Batman o Cavaleiro das Trevas", filme.getTitulo());
    }

    @Test
    public void metodoGetAno() {
        assertEquals(2008, filme.getAno());
    }

    @Test
    public void metodoGetAtores() {
        Ator ator = new Ator("João");
        Ator ator1 = new Ator("Jorge");
        Ator ator2 = new Ator("Luany");

        Papel papel = new Papel("Ra's al Ghul", false,
                ator, filme);
        Papel papel1 = new Papel("Batman", true,
                ator, filme);
        Papel papel2 = new Papel("Joker", true,
                ator, filme);

        //filme.addPapel();
    }
}
