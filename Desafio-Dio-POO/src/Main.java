import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(5);
        //System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setDate(LocalDate.now());

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("JAVA DEVELOPER");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);


        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devCaio.getConteudosInscritos());

        devCaio.progredir(); 
        devCaio.progredir();

        System.out.println("-");   
        System.out.println("Conteudos Concluidos " + devCaio.getConteudosConluidos());
        System.out.println("Conteudos Inscritos " + devCaio.getConteudosInscritos());
        System.out.println("Xp: " + devCaio.calcularTotalXp());

        System.out.println("------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscritos());

        devCamila.progredir();

        System.out.println("-");
        System.out.println("Conteudos concluidos " + devCamila.getConteudosConluidos());
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Xp: " + devCamila.calcularTotalXp());

    }
}
