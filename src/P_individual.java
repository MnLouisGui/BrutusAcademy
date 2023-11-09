public class P_individual extends Plano{
    P_individual(String c, Double p, int cont){
        super(c, p, cont);
    }
    
    @Override
    public void info(){
        System.out.println("Tipo: Plano individual");
    }
}
