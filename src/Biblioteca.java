public class Biblioteca {
    private Libro[] catalogo;

    public Biblioteca() {
        this.catalogo = new Libro[10];
    }


    public void addLibro(Libro libro){
        for (int i =0;i<catalogo.length;i++){
            if (catalogo[i] ==null){
                catalogo[i]=libro;
                break;
            }
        }

    }


}
