package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int ano;
    private List<Papel> papeis;

    public Filme(String titulo, int ano){
        this.setTitulo(titulo);
        this.setAno(ano);
        this.papeis = new ArrayList<>();
    }

    public void addPapel(Ator ator, String nome, boolean protagonista) {
        //Papel papel = new Papel(nome, true);
        //this.papeis.add();
    }

    public void setTitulo(String titulo) {
        if ( titulo == null ) {
            throw new IllegalArgumentException("O título não pode ser nulo. ");
        }
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        if (ano <= 0.0) {
            throw new IllegalArgumentException("Ano deve ser maior que 0");
        }
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public List<Papel> getPapeis() {
        return papeis;
    }

    public List<Ator> getAtores() {
        List<Ator> listAtor = new ArrayList<>();

        for (Papel p: papeis) {
            listAtor.add(p.getAtor());
        }

        return listAtor;
    }

//    public Ator getProtagonista() {
//        for (Papel p : this.getPapeis()) {
//
//        }
//    }
}
