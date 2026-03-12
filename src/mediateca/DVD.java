package mediateca;

public class DVD extends ItemBiblioteca{

    private String director;

    public DVD(String id, String titulo, String director) {
        super(id, titulo);
        this.director = director;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 2.0;
    }

    @Override
    public int getDiasMaximoPrestamo() {
        return 3;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Revista | Director: " + director;
    }
}
