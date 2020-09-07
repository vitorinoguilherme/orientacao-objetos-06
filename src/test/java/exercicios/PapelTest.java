package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PapelTest {
    private Ator ator;
    private Filme filme;
    private Papel papel;

    @BeforeEach
    public void beforeEach() {
        ator = new Ator("Bruce Lee");
        filme = new Filme("A fúria do Dragão", 1972);
        papel = new Papel("Bruce Lee", true, ator, filme);
    }

    @AfterEach
    public void afterEach() {
        ator = null;
        filme = null;
        papel = null;
    }

    @Test
    public void construtorPapel() {
        ator = new Ator("Chadwick Boseman");
        filme = new Filme("Pantera Negra O filme", 2019);
        papel = new Papel("Pantera Negra", true, ator, filme);

        assertEquals("Pantera Negra", papel.getNome());
        assertEquals(true, papel.isProtagonista());
        assertEquals("Chadwick Boseman", papel.getAtor().getNome());
        assertEquals("Pantera Negra O filme", papel.getFilme().getTitulo());
    }

    @DisplayName("Deve criar um objeto Papel")
    @Test
    public void presencaAtributos() {
        assertEquals("Bruce Lee", papel.getNome());
        assertEquals(true, papel.isProtagonista());
        assertEquals("Bruce Lee", papel.getAtor().getNome());
        assertEquals("A fúria do Dragão", papel.getFilme().getTitulo());
    }

    @Test
    public void metodoSetNomeValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> papel.setNome(null));
        assertEquals("O Nome do papel não pode ser nulo. ", exception.getMessage());
    }

    @Test
    public void metodoSetNomeValorValido() {
        papel.setNome("Jackie Chan");
        assertEquals("Jackie Chan", papel.getNome());
    }

    @Test
    public void metodoGetNome() {
        assertEquals("Bruce Lee", papel.getNome());
    }

    @Test
    public void metodoSetAtorValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> papel.setAtor(null));
        assertEquals("O Ator não pode ser nulo. ", exception.getMessage());
    }

    @Test
    public void metodoSetAtorValorValido() {
        ator = new Ator("Jet Lee");
        papel.setAtor(ator);

        assertEquals("Jet Lee", papel.getAtor().getNome());
    }

    @Test
    public void metodoGetAtor() {
        assertEquals("Bruce Lee", papel.getAtor().getNome());
    }

    @Test
    public void metodoSetFilmeValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> papel.setFilme(null));
        assertEquals("O Filme não pode ser nulo. ", exception.getMessage());
    }

    @Test
    public void metodoSetFilmeValorValido() {
        filme = new Filme("Piratas do Caribe", 2011);
        papel.setFilme(filme);

        assertEquals("Piratas do Caribe", papel.getFilme().getTitulo());
        assertEquals(2011, papel.getFilme().getAno());
    }

    @Test
    public void metodoGetFilme() {
        assertEquals("A fúria do Dragão", papel.getFilme().getTitulo());
    }

    @Test
    public void metodoSetProtagonista() {
        papel.setProtagonista(false);

        assertEquals(false, papel.isProtagonista());
    }

    @Test
    public void metodoIsProtanista() {
        assertEquals(true, papel.isProtagonista());
    }

}
