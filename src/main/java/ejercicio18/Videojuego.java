package ejercicio18;

public class Videojuego implements tareasComunes{
    String titulo = " ";
    int horasEstimadas = 10;
    boolean entregado = false;
    String genero = " ";
    String compania = " ";

    //Constructores

    public Videojuego() {
        //Default constructor
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    //metodos getters

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    //metodos setters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    //metodos


    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                '}';
    }

    @Override
    public boolean entregado() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado= false;
    }

    @Override
    public boolean isEntregado() {
        return false;
    }

    @Override
    public int compareTo(Object objetA) {
        Videojuego videojuego = (Videojuego) objetA;
        return this.getHorasEstimadas() - videojuego.getHorasEstimadas();
    }
}
