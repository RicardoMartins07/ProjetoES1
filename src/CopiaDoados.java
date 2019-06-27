public class CopiaDoados {

    Livro_Doado doado;
    int unidades;

    public CopiaDoados(Livro_Doado doado, int unidades) {
        this.doado = doado;
        this.unidades = unidades;
    }

    public Livro_Doado getDoado() {
        return doado;
    }

    public void setDoado(Livro_Doado doado) {
        this.doado = doado;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
