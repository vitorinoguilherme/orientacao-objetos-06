package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int ano;
    private List<Papel> papeis;

    public Filme(String titulo, int ano, Papel papeis){
        this.setTitulo(titulo);
        this.setAno(ano);
        this.papeis = new ArrayList<>();
        this.papeis.add(papeis);
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


}
