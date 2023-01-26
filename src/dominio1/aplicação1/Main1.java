package dominio1.aplicação1;
import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args) {
        Curso1 curso1 = new Curso1();

       curso1.setTítulo("curso java");
curso1.setDescricao("descrição curso java");
curso1.setCargaHoraria(8);


Curso1 curso2 = new Curso1();

       curso2.setTítulo("curso js");
curso2.setDescricao("descrição curso js");
curso2.setCargaHoraria(4);

Mentoria1 mentoria = new Mentoria1();

mentoria.setTítulo("mentoria de java");
mentoria.setDescricao("descrição mentoria java");
mentoria.setData(LocalDate.now());





System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria);












    }
}
