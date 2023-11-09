import java.util.*;

//Copyright (c) 2023 Luis

public class BrutusAcademy {
    public BrutusAcademy(){
        
    }

    public static void main(String[] args) throws Exception {
        //Objetos
        Aluno aluno=new Aluno();
        Aluno aluno1=new Aluno();
        Colaborador colab1=new Colaborador();
        Colaborador colab2=new Colaborador();
        Plano plano=new P_individual(null,null, 0);

        //Leitor
        Scanner ent=new Scanner(System.in);

        //objeto de Herança
        

        //Estaticos
        aluno.setName("Marcos");
        aluno1.setName("Jesus Crist");
        colab1.setName("Valter");
        colab2.setName("Carlos");

        //Relacionamento
        

        //Variaveis
        boolean While=true;
        int op;

        while(While==true){
            System.out.println("###### BrutusAcademy ######");
            System.out.println("========================================");
            System.out.println("## Menu ##\n1.Plano\n2.Sair");
            op=ent.nextInt();
            System.out.println("========================================");
            //switch classe
            switch(op){
                case 1:
                    System.out.println("## Menu - Plano ##\n1.Cadastro\n2.Alterar\n3.Alterar Valor\n4.Ver dados\n5.Sair");
                    op=ent.nextInt();
                    switch (op){
                        //Cadastro
                        case 1:
                            Double price;
                            String name;
                            Aluno alunoT = null;
                            Colaborador colabT = null;
                            System.out.println("========================================");
                            System.out.println("Nome do Plano:"); name=ent.nextLine(); name=ent.nextLine();
                            System.out.println("========================================");
                            System.out.println("Preço do Plano:"); price=ent.nextDouble();
                            System.out.println("========================================");
                            System.out.println("Qual aluno vai estar no plano?\n1."+aluno.getName()+"\n2."+aluno1.getName());
                            op=ent.nextInt();
                            //aluno
                            switch (op) {
                                case 1:
                                    alunoT = aluno;
                                    break;
                                case 2:
                                    alunoT = aluno1;
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    break;
                            }
                            //Colaborador
                            System.out.println("========================================"); 
                            System.out.println("Qual colaborador vai estar no plano?\n1."+colab1.getName()+"\n2."+colab2.getName());
                            op=ent.nextInt();
                            switch (op) {
                                case 1:
                                    colabT = colab1;
                                    break;
                                case 2:
                                    colabT = colab2;
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    break;
                            }
                            plano.register(name, price, alunoT, colabT);
                            break;
                        //Alterar
                        case 2:
                            String name2;
                            Aluno alunoT2 = null;
                            Colaborador colabT2 = null;
                            System.out.println("## Menu - Alterar ##\n1.Alterar Nome\n2.Alterar Aluno\n3.Alterar Colaborador\n4.Sair");
                            op=ent.nextInt();
                            switch(op){
                                case 1:
                                    System.out.println("========================================");
                                    System.out.println("Novo nome do plano:"); name2 = ent.nextLine(); name2 = ent.nextLine();
                                    plano.updateName(name2);
                                    break;
                                case 2:
                                    System.out.println("Qual aluno vai estar no plano?\n1. "+aluno.getName()+"\n2. "+aluno1.getName());
                                    op=ent.nextInt();
                                    switch (op) {
                                        case 1:
                                            alunoT2 = aluno;
                                            break;
                                        case 2:
                                            alunoT2 = aluno1;
                                            break;
                                        default:
                                            System.out.println("Opção inválida");
                                            break;
                                    }
                                    plano.updateAluno(alunoT2);
                                    break;
                                case 3:
                                    System.out.println("Qual treino vai estar no plano?\n1."+colab1.getName()+"\n2."+colab2.getName());
                                    op=ent.nextInt();
                                    switch (op) {
                                    case 1:
                                        colabT2 = colab1;
                                        break;
                                    case 2:
                                        colabT2 = colab2;
                                        break;
                                    default:
                                        System.out.println("Opção inválida");
                                        break;
                                    }
                                    plano.updateColaborador(colabT2);
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("Opção inválida!!!");
                            }break;
                        //Alt valor
                        case 3:
                            Double taxaT;
                            System.out.println("========================================");
                            System.out.println("## Menu - Atualizar preço ##\n1.Atualizar ( Taxa 10% )\n2.Atualizar ( Taxa personalizada )\n3.Sair");
                            op=ent.nextInt();
                            switch(op){
                                case 1:
                                    plano.updatePrice(); break;
                                case 2:
                                    System.out.println("========================================");
                                    System.out.println("Digite a taxa personalizada");
                                    taxaT=ent.nextDouble(); 
                                    plano.updatePrice(taxaT);
                                    break;
                                case 3:
                                    break;
                                default: 
                            }break;
                        //Ver dados
                        case 4:
                            plano.viewdate();
                            break;
                        case 5: 
                            break;
                        default: System.out.println("Opção inválida !!!"); 
                    }break;
                case 2:
                    System.out.print("Copyright (c) 2023 Luis");
                    While=false; 
                    break;
                default: System.out.println("Opção inválida !!!");
            }//Switch planos
        }//While    
    }//public static
}//public class
