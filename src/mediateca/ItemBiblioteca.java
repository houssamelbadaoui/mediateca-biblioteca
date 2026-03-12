package mediateca;

public abstract class ItemBiblioteca {

    // atributes
    private String id;
    private String titulo;
    private boolean estadoPrestado;

    // constructor
    public ItemBiblioteca(String id, String titulo, boolean estadoPrestado {
        this.id = id;
        this.titulo = titulo;
        this.estadoPrestado = false;
    }
    // getters
    public String getId() {
        return id;
    }
    public String getTitulo(){
        return  titulo;
    }
    public boolean isEstadoPrestado(){
        return  estadoPrestado;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    // prestar libro
    public void prestar(){
        estadoPrestado = true;
    }
    // devolver el libro
    public void devolver(){
        estadoPrestado = false;
    }

    // Abstract methods
    public abstract double calcularMulta(int diasRetraso);

    public abstract  int getDiasMaximoPrestamo();

    @Override
    public String toString(){
        return "ID: " + id +
                "| Titulo: " + titulo +
                "| Estado: " + (estadoPrestado ? "Prestado" : "Disponible");
    }
}
