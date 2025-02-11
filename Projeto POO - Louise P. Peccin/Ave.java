// Nome.: Louise Paccola Peccin  
// RA...: 2475502

public class Ave extends Animal implements Reproducao{
    private int bico;           //Tamanho do bico
    private String habMig;      //Habitos migratorios
    private String ninho;       //Tipo de ninho necessario

    //polimorfismo sobrescrito
    @Override
    public void reproducao(){
        System.out.println("\nOBS.: Aves sao oviparas, portanto se reproduzem por meio de ovos");
    }

    public int getBico(){
        return bico;
    }

    public String getHabMig(){
        return habMig;
    }

    public String getNinho(){
        return ninho;
    }

    public void setBico(int bico){
        this.bico = bico;
    }

    public void setHabMig(String habMig){
        this.habMig = habMig;
    }

    public void setNinho(String ninho){
        this.ninho = ninho;
    }
}
