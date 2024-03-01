import java.time.LocalDate;

public class Bibliotecario implements GestionBiblioteca {
    @Override
    public void prestarLibro(Usuario usu, Libro libroNombre) {
        Prestamo prest=new Prestamo(libroNombre);
        prest.setFechaPrestamo(LocalDate.now());
        for (int i =0;i<usu.prestamos.length;i++){
            if (usu.prestamos[i]==null){

                usu.prestamos[i]=prest;
                break;
            }
        }
    }

    @Override
    public void devolverLibro() {

    }
}
