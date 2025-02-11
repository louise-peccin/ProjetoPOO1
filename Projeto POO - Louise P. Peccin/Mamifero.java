// Nome.: Louise Paccola Peccin  
// RA...: 2475502

public class Mamifero extends Animal implements Reproducao{
    private int mesGest;        // Meses de Gestacao
    private String habSoci;     // Habitos sociais
    private String corPelo;     // Cor dos pelos

    //polimorfismo sobrescrito
    @Override
    public void reproducao(){
        System.out.println("\nOBS.: Mamiferos se reproduzem por meio de fecundacao e gestacao interna (ha excecoes)");
    }
    
    public int getMesGest(){
        return mesGest;
    }

    public String getHabSoci(){
        return habSoci;
    }

    public String getCorPelo(){
        return corPelo;
    }

    public void setMesGest(int mesGest){
        this.mesGest = mesGest;
    }

    public void setHabSoci(String habSoci){
        this.habSoci = habSoci;
    }

    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }

}