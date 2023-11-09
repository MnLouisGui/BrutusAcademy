import java.util.*;

public class Plano {
    Scanner ent=new Scanner(System.in);
    //Atributos gerais
    private String curse;
    private Double price;
    int op;

    static int contador;
    int codigo;
    Plano(){
        contador++;
    }

    //At Relacionamento
    private Aluno aluno;
    private Colaborador colab;

    //Get and Set
    public String getCurse(){
        return this.curse;
    }
    public void setCurse(String curse){
        this.curse=curse;
    }

    public Double getPrice(){
        return this.price;
    }
    public void setPrice(Double price){
        this.price=price;
    }

    //Herença
    public Plano(String c, Double p, int cont){
        this.curse=c;
        this.price=p;
        this.codigo=cont+1;
    }

    //Metado infor
    public void info(){
        System.out.println("Tipo: Plano");
    }

    //Metodos
    public void register(String c, Double p, Aluno a, Colaborador cl){
        this.curse=c;
        this.price=p;
        this.aluno=a;
        this.colab=cl;
    }

    
    public void updateName(String c){
        if(this.curse!=null){
           this.curse=c; 
        }else if(this.curse==null){
            System.out.println("Nenhum Plano cadastrado");        
        }
        System.out.println("========================================");
    }

    public void updateAluno(Aluno a){
        if(this.curse!=null){
            this.aluno=a;
        }else if(this.curse==null){
            System.out.println("Nenhum Plano cadastrado");          
        }
    }

    public void updateColaborador(Colaborador c){
        if(this.curse!=null){
            this.colab=c;
        }else if(this.curse==null){
            System.out.println("Nenhum Plano cadastrado");          
        }
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
        if(this.price!=null){
            System.out.println("========================================");
            System.out.println("##DADOS##\nPlano: "+this.curse+"\nValor: "+this.price+"\nAluno no Plano: "+this.aluno.getName()+"\nColaborador: "+this.colab.getName() +"\nContador: "+this.codigo);
            this.info();
            System.out.println("========================================");
            while(op==0){
                System.out.println("1.Voltar");
                op=ent.nextInt();
            }
            op=0;
        }else{
            System.out.println("Nenhum plano foi cadastrado cadastrado!!");
        }
    }
}
//Copyright (c) 2023 Luis