public class Livro extends Object {

    String titulo, editora;

    public Livro(String titulo, String editora){
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getEditora() {
        return this.editora;
    }
}
