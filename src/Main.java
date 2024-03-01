//clases:estudeintes,profesor,curso,matricula



//decide de manera apropiada que es cada clase



//Estudiente:nombre,edad(verificar no negativo),num_estudiente
//profesor:nombre,especialiadda,num_empleado
//Curso:nombredelcurso,num_creditos(verficar numcreditos)
//matricula:tasa de matricula,metodo--> calculo del coste total del cursov y que el credito vale 60 euros
public class Main {
    public static void main(String[] args) {
        Curso c1= new Curso("edu",120);
      c1.calculoCoste(c1);

    }
}