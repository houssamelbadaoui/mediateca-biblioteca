package mediateca;

public class DVD extends ItemBiblioteca{

    private String director;

    public DVD(String id, String titulo, boolean estadoPrestamo, String director) {
        super(id, titulo, estadoPrestamo);
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
