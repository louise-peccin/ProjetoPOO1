//Nome.: Louise Paccola Peccin
//RA...: 2475502

public class Reptil extends Animal implements Reproducao{
    private int temp;           // Temperatura do ambiente
    private String habSono;     // Habitos de sono
    private String tipoRep;     // Tipo de reptil 

    //polimorfismo sobrescrito
    @Override
    public void reproducao(){
        System.out.println("\nOBS.: Repteis sao oviparos ou ovoviviparos, portanto se reproduzem por meio de ovos");
    }

    public int getTemp(){
        return temp;
    }

    public String getHabSono(){
        return habSono;
    }
    public String getTipoRep(){
        return tipoRep;
    }

    public void setTemp(int temp){
        this.temp = temp;
    }

    public void setHabSono(String habSono){
        this.habSono = habSono;
    }

    public void setTipoRep(String tipoRep){
        this.tipoRep = tipoRep;
    }
}
