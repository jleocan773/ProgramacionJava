package org.ieslosremedios.daw.ud5.ejercicios.actividad_54;

public class Libro {
    private String titulo;
    private String autor;
    private String fecha_pub;


    public Libro (String titulo, String autor, String fecha_pub){
        this.titulo = titulo;
        this.autor = autor;
        this.fecha_pub = fecha_pub;
    }

    @Override
    public String toString() {
        return "[" + titulo + ", " + autor + ", " + fecha_pub + "]";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha_pub() {
        return fecha_pub;
    }

    public void setFecha_pub(String fecha_pub) {
        this.fecha_pub = fecha_pub;
    }
}
