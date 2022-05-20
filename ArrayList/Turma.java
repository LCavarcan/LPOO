import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    public static void main(String args[]) {
        ArrayList<Alunos> aluno = new ArrayList<>();
        ArrayList<CorpoDocente> professor = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n;
        int m=0;
        String name;
        int ra;

        do {
            System.out.println("1 - Adicionar aluno\n2 - Remover aluno pelo nome\n3 - Remover aluno pelo ra\n4 - Buscar aluno\n5 - Adicionar professor\n6 - Remover professor\n7 - Buscar professor\n8 - Printar alunos\n9 - Printar professores\n0 - Sair");
            n = sc.nextInt();
            sc.nextLine();

            switch(n) {
                case 1: System.out.println("Digite o nome do aluno: ");
                        name = sc.nextLine();
                        System.out.println("Digite o ra do aluno: ");
                        ra = sc.nextInt();
                        sc.nextLine();
                        Alunos variavel = new Alunos(name, ra);
                        aluno.add(variavel);
                        break;

                case 2: System.out.println("Digite o nome do aluno: ");
                        name = sc.nextLine();
                        for(int i=0;i<aluno.size();i++) {
                            if(aluno.get(i).getNome().equals(name)) {
                                aluno.remove(i);
                            }
                        }
                        break;

                case 3: System.out.println("Digite o ra do aluno: ");
                        ra = sc.nextInt();
                        sc.nextLine();
                        for(int i=0;i<aluno.size();i++) {
                            if(aluno.get(i).getId() == ra) {
                                aluno.remove(i);
                            }
                        }
                        break;

                case 4: m=0;
                        System.out.println("Digite o nome do aluno: ");
                        name = sc.nextLine();
                        for(int i=0;i<aluno.size();i++) {
                            if(aluno.get(i).getNome().equals(name)) {
                                System.out.println("O ALUNO TA AQUI CARALHO");
                                m=1;
                            }
                        }
                        if(m==0) {
                            System.out.println("Se fudeu, o aluno nao ta aqui");
                        }
                        break;

                case 5: System.out.println("Digite o nome do professor: ");
                        name = sc.nextLine();
                        CorpoDocente variavelP = new CorpoDocente(name);
                        professor.add(variavelP);
                        break;

                case 6: System.out.println("Digite o nome do professor: ");
                        name = sc.nextLine();
                        for(int i=0;i<professor.size();i++) {
                            if(professor.get(i).getNome().equals(name)) {
                                professor.remove(i);
                            }
                        }
                        break;

                case 7: m=0;
                        System.out.println("Digite o nome do professor: ");
                        name = sc.nextLine();
                        for(int i=0;i<professor.size();i++) {
                            if(professor.get(i).getNome().equals(name)) {
                                System.out.println("O PROFESSOR TA AQUI CARALHO");
                                m=1;
                            }
                        }
                        if(m==0) {
                            System.out.println("Se fudeu, o professor nao ta aqui");
                        }
                        break;

                case 8: for(int i=0;i<aluno.size();i++) {
                            System.out.println("Nome: " + aluno.get(i).getNome());
                            System.out.println("Ra: " + aluno.get(i).getId());
                        }
                        break;

                case 9: for(int i=0;i<professor.size();i++) {
                            System.out.println("Nome: " + professor.get(i).getNome());
                        }
                        break;
            }
            System.out.println("");
        }while(n!=0);

        /*nomes.remove(3);

        System.out.println(nomes);

        nomes.remove("Clark");

        System.out.println(nomes);
        System.out.println("Tamanho da lista: " + nomes.size()); 
        System.out.println("Lista esta vazia? " + nomes.isEmpty()); */
    }
}