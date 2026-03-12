package mediateca;

public class Libro extends ItemBiblioteca{

    private String autor;

    // constructor
    public Libro(String id, String titulo, String autor){
        super(id, titulo);
        this.autor = autor;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 0.50;
    }

    @Override
    public int getDiasMaximoPrestamo() {
        return 14;
    }

    @Override
    public String toString(){
        return  super.toString() +
                " | Tipo: Libro | Autor: " + autor;
    }
}
