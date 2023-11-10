public class P_grupo extends Plano{
    public P_grupo(String c, Double p, int cont){
        super(c, p, cont);
    }

    @Override public void info(){
        System.out.println("Plano grupo");
    }
}