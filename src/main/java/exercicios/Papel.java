package exercicios;

public class Papel {
    private String nome;
    private boolean protagonista;
    private Ator ator;
    private Filme filme;

    public Papel(String nome, boolean protagonista, Ator ator, Filme filme) {
        this.setNome(nome);
        this.protagonista = protagonista;
        this.ator = ator;
        this.filme = filme;
    }

    public void setNome(String nome) {
        if ( nome == null ) {
            throw new IllegalArgumentException("O nome não pode ser nulo. ");
        }
        this.nome = nome;
    }

    public void setProtagonista(boolean protagonista) {
        this.protagonista = protagonista;
    }

    public String getNome() {
        return nome;
    }

    public Ator getAtor() {
        return ator;
    }

    public Filme getFilme() {
        return filme;
    }

    public boolean isProtagonista() {
        return protagonista;
    }
}
