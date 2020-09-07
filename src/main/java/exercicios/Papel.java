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

    public Papel() {

    }

    public void setNome(String nome) {
        if ( nome == null ) {
            throw new IllegalArgumentException("O Nome do papel não pode ser nulo. ");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAtor(Ator ator) {
        if ( ator == null ) {
            throw new IllegalArgumentException("O Ator não pode ser nulo. ");
        }
        this.ator = ator;
    }

    public Ator getAtor() {
        return this.ator;
    }

    public void setFilme(Filme filme) {
        if ( filme == null ) {
            throw new IllegalArgumentException("O Filme não pode ser nulo. ");
        }
        this.filme = filme;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setProtagonista(boolean protagonista) {
        this.protagonista = protagonista;
    }

    public boolean isProtagonista() {
        return protagonista;
    }
}
