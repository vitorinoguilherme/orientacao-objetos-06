package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Ator {
    private String nome;
    private List<Papel> papeis;

    public Ator(String nome, Papel papel) {
        this.setNome(nome);
        this.papeis = new ArrayList<>();
        this.papeis.add(papel);
    }

    public void setNome(String nome) {
        if ( nome == null ) {
            throw new IllegalArgumentException("O nome não pode ser nulo. ");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addPapeis(Papel papel) {
        papeis.add(papel);
    }

    public List<Papel> getPapeis() {
        return papeis;
    }

    public List<Filme> getFilmes() {
        List<Filme> listFilmes = new ArrayList<>();

        for (Papel p: papeis) {
            listFilmes.add(p.getFilme());
        }

        return listFilmes;
    }

}
