public class Curso implements Matricula {
    private  String nameCurse;
    private int numCreditos;

    public int getNumCreditos() {
        return numCreditos;
    }

    public Curso(String nameCurse, int numCreditos) {
        this.nameCurse = nameCurse;
        if (numCreditos > 0 ){
            this.numCreditos = numCreditos;

        }else {
            this.numCreditos = 0;
        }

    }

    @Override
    public void calculoCoste() {
        System.out.println("datos informativo");
        int total=0;
        total=(int) Matricula.tasa+(60*this.numCreditos);
        System.out.println("total="+ total);

    }
}//Curso:nombredelcurso,num_creditos(verficar numcreditos)
