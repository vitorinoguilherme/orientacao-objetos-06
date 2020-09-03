package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Ator {
    private String nome;
    private List<Papel> papeis;

    public Ator(String nome) {
        this.setNome(nome);
        this.papeis = new ArrayList<>();
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
        this.papeis.add(papel);
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

    public boolean atuouNoAno(int ano) {
        for (Filme f: this.getFilmes()) {
            if (ano == f.getAno())
                return true;
        }
        return false;
    }

}
