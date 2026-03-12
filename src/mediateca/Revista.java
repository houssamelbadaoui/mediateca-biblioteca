package mediateca;

public class Revista extends ItemBiblioteca{

    private int numeroEdicion;

    // constructor
    public Revista(String id, String titulo,  int numeroEdicion) {
        super(id, titulo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1.0;
    }

    @Override
    public int getDiasMaximoPrestamo() {
        return 7;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Revista | Edicion: " + numeroEdicion;
    }
}
