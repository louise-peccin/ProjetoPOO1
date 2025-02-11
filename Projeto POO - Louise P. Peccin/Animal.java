// Nome.: Louise Paccola Peccin  
// RA...: 2475502

public abstract class Animal {
    private String nome;        //Nome do animal
    private String cient;       //Nome cientifico
    private String dieta;       //Tipo de dieta do animal (carnivora, herbivora, onivora)
    
    private Habitat habit = new Habitat();

    public Habitat getHabit() {
        return habit;
    }

    public void setHabit(Habitat habit) {
        this.habit = habit;
    }

    public String getNome(){
        return nome;
    }

    public String getCient(){
        return cient;
    }


    public String getDieta(){
        return dieta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCient(String cient){
        this.cient = cient;
    }


    public void setDieta(String dieta) throws DietaExce{
        if(dieta.equalsIgnoreCase("carnivora") || dieta.equalsIgnoreCase("herbivora") || dieta.equalsIgnoreCase("onivora")){
            this.dieta = dieta;
        }else{
            throw new DietaExce();
        }
        
    }




}
