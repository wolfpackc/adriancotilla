public class AudioLibro extends Libro{
    private final int durMinutos;

    public AudioLibro(String titulo, String autor, int numPag, int durMinutos) {
        super(titulo, autor, numPag);
        this.durMinutos = durMinutos;
    }


}
