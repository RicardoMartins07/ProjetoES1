import java.time.LocalDate;

public class Requisicao extends Object {

    LocalDate localDate;
    Utilizador utilizador;
    Copia copia;

    public Requisicao(LocalDate data, Utilizador utilizador, Copia copia){
        this.localDate = data;
        this.utilizador = utilizador;
        this.copia = copia;
    }

    public LocalDate getData(){
        return localDate;
    }

    public Utilizador getUtilizador(){
        return utilizador;
    }

    public Copia getCopia(){
        return copia;
    }

}