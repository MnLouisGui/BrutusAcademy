public class Colaborador {
    private String name;
    static int contador;
    int codigo;
    
    Colaborador(){
        contador++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
}
//Copyright (c) 2023 Luis