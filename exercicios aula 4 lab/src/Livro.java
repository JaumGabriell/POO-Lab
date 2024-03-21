public class Livro {
    private String titulo;

    private int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPagina() {
        return paginas;
    }

    public void setPagina(int pagina) {
        this.paginas = paginas;
    }

}
