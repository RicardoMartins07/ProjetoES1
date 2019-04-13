public class Copia extends Object {

    int id;
    Livro livro;

    public Copia(int id, Livro livro){
        this.id = id;
        this.livro = livro;
    }

    public int getId(){ return this.id; }

    public Livro getLivro(){
        return livro;
    }

}
