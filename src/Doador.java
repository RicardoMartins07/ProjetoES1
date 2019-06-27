public class Doador {

    String nome;
    int id;
    int idade;
    int Creditos;


    public Doador(String nome, int id, int idade, int creditos) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        Creditos = creditos;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int creditos) {
        Creditos = creditos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
