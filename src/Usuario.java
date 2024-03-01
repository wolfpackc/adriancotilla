public class Usuario  {
    private  String nombre;
    private  int id;
    protected Prestamo[] prestamos;

    public Usuario(String nmbre, int id, Prestamo[] prestamos) {
        this.nombre = nmbre;
        this.id = id;
       prestamos=new Prestamo[5];
    }

    public void setPrestamos(Prestamo prest) {


    }
}
