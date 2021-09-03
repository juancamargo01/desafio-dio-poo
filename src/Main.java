import br.com.juan.desafio.dominio.Curso;
import br.com.juan.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHorario(18);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso SpringBoot");
        curso2.setDescricao("descrição do curso SpringBoot");
        curso2.setCargaHorario(8);



        System.out.println(curso1);
        System.out.println(curso2);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria em java");
        mentoria.setData(LocalDate.now());




    }
}
