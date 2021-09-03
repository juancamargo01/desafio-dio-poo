import br.com.juan.desafio.dominio.BootCamp;
import br.com.juan.desafio.dominio.Curso;
import br.com.juan.desafio.dominio.Dev;
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

        Curso curso3 = new Curso();
        curso2.setTitulo("curso JPA");
        curso2.setDescricao("descrição do curso JPA");
        curso2.setCargaHorario(8);



        //System.out.println(curso1);
        //System.out.println(curso2);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria em java");
        mentoria.setData(LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);


        Dev devJuan = new Dev();
        devJuan.setNome("Juan Camargo");
        devJuan.increverBotcamp(bootCamp);
        System.out.println("Conteudos Inscritos Juan "+ devJuan.getConteudoInscrito());

        devJuan.progredir();
        System.out.println("_");
        System.out.println("Conteudos Inscritos Juan "+ devJuan.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Juan "+ devJuan.getConteudoconcluidos());
        System.out.println("_XP"+ devJuan.calcularTotalXp()) ;

        System.out.println("______________________");

        Dev devValeria= new Dev();
        devValeria.increverBotcamp(bootCamp);
        devValeria.setNome("valeria Camargo Valeria ");
        System.out.println("Conteudos Inscritos"+ devValeria.getConteudoInscrito());
        devValeria.progredir();
        devValeria.progredir();
        System.out.println("_");
        System.out.println("Conteudos Inscritos"+ devValeria.getConteudoInscrito());
        System.out.println("Conteudos Concluidos"+ devValeria.getConteudoconcluidos());
        System.out.println("_XP"+ devValeria.calcularTotalXp()) ;





    }
}
