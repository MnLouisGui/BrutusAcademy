import java.util.*;

//Copyright (c) 2023 Luis

public class BrutusAcademy {
    public BrutusAcademy(){
        
    }
    public static void main(String[] args) throws Exception {
        Aluno aluno=new Aluno();
        Aluno aluno1=new Aluno();
        Colaborador colab1=new Colaborador();
        Colaborador colab2=new Colaborador();
        Plano.contador=0;
        Plano plano=new Plano();
        Scanner ent=new Scanner(System.in);

        //Estaticos
        aluno.setName("Marcos");
        aluno1.setName("Jesus Crist");
        colab1.setName("Valter");
        colab2.setName("Carlos");

        plano.plan = aluno;

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
                        case 1:
                            
                            System.out.println("========================================");
                            System.out.println("Nome do Plano:"); plano.registerName(ent.nextLine()); plano.registerName(ent.nextLine());
                            System.out.println("========================================");
                            System.out.println("Preço do Plano:"); plano.registerPrice(ent.nextDouble());
                            System.out.println("========================================");
                            System.out.println("Qual aluno vai estar no plano?\n1."+aluno.getName()+"\n2."+aluno1.getName());
                            op=ent.nextInt();
                            //aluno
                            if (op==1){
                                plano.plan=aluno;
                            }else if(op==2){
                                plano.plan=aluno1;
                            }else{
                                System.out.println("Opção inválida!!!");
                            }
                            //Colaborador
                            System.out.println("========================================"); 
                            System.out.println("Qual colaborador vai estar no plano?\n1."+colab1.getName()+"\n2."+colab2.getName());
                            op=ent.nextInt();
                            //Colaborador
                            if (op==1){
                                plano.colab = colab1;
                            }else if(op==2){
                                plano.colab = colab2;
                            }else{
                                System.out.println("Opção inválida!!!");
                            }

                            break;
                        case 2:
                            System.out.println("## Menu - Alterar ##\n1.Alterar Nome\n2.Alterar Aluno\n3.Alterar Colaborador\n4.Sair");
                            op=ent.nextInt();
                            switch(op){
                                case 1:
                                    System.out.println("========================================");
                                    System.out.println("Novo nome do plano:");
                                    plano.updateName(ent.nextLine()); plano.updateName(ent.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Qual aluno vai estar no plano?\n1. "+aluno.getName()+"\n2. "+aluno1.getName());
                                    op=ent.nextInt();
                                    if (op==1){
                                        plano.plan=aluno;
                                    }else if(op==2){
                                        plano.plan=aluno1;
                                    }else{
                                        System.out.println("Opção inválida!!!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Qual treino vai estar no plano?\n1."+colab1.getName()+"\n2."+colab2.getName());
                                    op=ent.nextInt();
                                    if (op==1){
                                        plano.colab = colab1;
                                    }else if(op==2){
                                        plano.colab = colab2;
                                    }else{
                                        System.out.println("Opção inválida!!!");
                                    }
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("Opção inválida!!!");
                            }break;
                        case 3:
                            System.out.println("========================================");
                            System.out.println("## Menu - Atualizar preço ##\n1.Atualizar ( Taxa 10% )\n2.Atualizar ( Taxa personalizada )\n3.Sair");
                            op=ent.nextInt();
                            switch(op){
                                case 1:
                                    plano.updatePrice(); break;
                                case 2:
                                    System.out.println("========================================");
                                    System.out.println("Digite a taxa personalizada");
                                    plano.updatePrice(ent.nextDouble()); break;
                                case 3:
                                    break;
                                default: 
                            }break;
                        case 4:
                            plano.viewdate();
                            break;
                        case 5: 
                            break;
                        default: System.out.println("Opção inválida !!!"); 
                    }break;

                case 2:
                    System.out.print("Copyright (c) 2023 Luis");
                    While=false; break;
                default: System.out.println("Opção inválida !!!");
            }
        }//While True      
    }//public static
}//public class
