package espm.poo.aula07;

public class Livro {

    String titulo;
    final Autor a;

    public Livro(String titulo, String nome, String cidade) {
        this.titulo = titulo;
        this.a = new Autor(nome, cidade);
    }

}
