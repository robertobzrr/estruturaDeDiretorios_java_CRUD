import controller.ProfessorController;
import model.Professor;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProfessorController professorController = new ProfessorController();
        Professor p = new Professor();

        System.out.println("Digite o nome do professor: ");
        p.setNome(scanner.next());

        System.out.println("Digite a idade do professor: ");
        p.setIdade(scanner.nextInt());

        System.out.println("Digite a especialização do professor");
        p.setEspecializacao(scanner.next());


        //cadastrar
        professorController.cadastrarProfessor(p);


        //Listar
        List<Professor> professores = professorController.listarProfessores();

        if (professores.isEmpty()){
            System.out.println("Nenhuma dado cadastrado");
        }else {
            for (Professor professor : professores){
                System.out.println("Nome: " +professor.getNome());
                System.out.println("\nIdade: " +professor.getIdade());
                System.out.println("\nEspecialização: " +professor.getEspecializacao());
            }
        }


        //Atualizar
        System.out.println("Digite o nome do professor a ser atualizado: ");
        String nomeAntigo = scanner.next();

        System.out.println("Digite o novo nome do professor: ");
        String novoNome = scanner.next();

        professorController.atualizarProfessor(nomeAntigo, novoNome);


        //Deletar
        System.out.println("Digite o nome do professor a ser deletado");
        String nomeDeletar = scanner.next();

        professorController.deletarProfessor(nomeDeletar);




    }
}