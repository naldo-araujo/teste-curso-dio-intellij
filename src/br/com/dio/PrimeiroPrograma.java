package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato Gato = new gato();
        System.out.println(Gato);

        livro Livro = new livro("Filhos do Eden", 300);
        System.out.println(Livro);
        // int a = 5;
        //int b= 3;
        //System.out.println("Hello world " + (a+b));
    }
}

class livro {
    private String nome;
    private Integer npag;

    public livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}
