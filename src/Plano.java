import java.util.*;

public class Plano {
    Scanner ent=new Scanner(System.in);
    //Atributos gerais
    String curse;
    Double price;
    int op=0;
    static int contador;
    int codigo;
    Plano(){
        contador++;
    }

    //Relacionamento
    Aluno plan;
    Colaborador colab;

    //Metodos
    public void registerName(String c){
        this.curse=c;
        this.codigo=contador;
    }
    public void registerPrice(Double p){
        this.price=p;
        System.out.println("========================================");
    }

    
    public void updateName(String c){
        if(this.curse!=null){
           this.curse=c; 
        }else if(this.curse==null){
            System.out.println("Nenhum Plano cadastrado");
            System.out.println("1.Voltar");           
        }
        System.out.println("========================================");
    }

    public void updatePrice(){
        if(this.price!=null){
            this.price=this.price+(this.price*0.1);
            System.out.println("Agora o plano tem 10% de acrécimo");
            System.out.println("========================================");   
        }else if(this.price==null){
            System.out.println("Nenhum valor cadastrado\nMotivo: Plano ainda não foi cadastrado!!");
        }
    }

    public void updatePrice(Double taxa){
        if(this.price!=null){
            this.price=this.price+(this.price*(taxa/100));
            System.out.println("Agora o plano tem "+taxa+"% de acrécimo");
            System.out.println("========================================");
        }else if(this.price==null){
            System.out.println("Nenhum valor foi cadastrado\nMotivo: Plano ainda não foi cadastrado!!");
        }
    }

    public void viewdate(){
        System.out.println("========================================");
        System.out.println("##DADOS##\nPlano: "+this.curse+"\nValor: "+this.price+"\nAluno no Plano: "+this.plan.name+"\nColaborador: "+this.colab.name +"\nContador: "+this.codigo);
        System.out.println("========================================");
        while(op==0){
            System.out.println("1.Voltar");
            op=ent.nextInt();
        }
        op=0;
    }
}
