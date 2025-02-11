// Nome.: Louise Paccola Peccin  
// RA...: 2475502

import java.util.ArrayList;

public class Principal {
    
    static ArrayList<Mamifero> bdMamif = new ArrayList<>();
    static ArrayList<Ave> bdAves = new ArrayList<>();
    static ArrayList<Reptil> bdRept = new ArrayList<>();
    public static void main(String[] args) {
        Leitura L = new Leitura();

        int op = 0;

        while(op != 3){
            System.out.println("\n======= MENU =======");
            System.out.println("\n1 - CADASTRAR ANIMAL");
            System.out.println("\n2 - LISTAR ANIMAIS CADASTRADOS");
            System.out.println("\n3 - SAIR");

            op = Integer.parseInt(L.entDados("\nEscolha uma opcao: "));


            switch (op) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    listarAnimais();
                    break;
                case 3:
                    System.out.println("\nEncerrando o programa...\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida!!");
                    break;
            }
        }
    }


    public static void cadastrarAnimal(){
        Leitura L = new Leitura();
        
        int op1 = 0;

        while(op1 != 4){
            System.out.println("\nQual tipo de animal voce deseja cadastrar? ");
            System.out.println("1 - AVE");
            System.out.println("2 - MAMIFERO");
            System.out.println("3 - REPTIL");
            System.out.println("4 - VOLTAR AO MENU PRINCIPAL");

            op1 = Integer.parseInt(L.entDados("\nEscolha uma opcao: "));

            switch (op1) {
                case 1:
                    cadastrarAnimal(new Ave());

                break;

                case 2:
                    cadastrarAnimal(new Mamifero());

                break;

                case 3:
                    cadastrarAnimal(new Reptil());

                break;

                case 4:
                    System.out.println("\nVoltando ao menu principal...\n");
                break;
            
                default:
                    System.out.println("\nOpcao Invalida!!\n");
                    break;
            }
        }
    }

    //Usando polimorfismo de sobrecarga nos proximos tres metodos:

    public static void cadastrarAnimal(Ave a1){
        Leitura L = new Leitura();
        a1 = new Ave();
        a1.setNome( L.entDados("\nDigite o nome da ave: "));
        a1.setCient(L.entDados("\nDigite o nome cientifico da ave: "));;

        try{
            a1.setDieta(L.entDados("\nDigite o tipo de dieta da ave: "));
        }catch(DietaExce de){
            de.impErro();
            return;
        }

        a1.getHabit().setPais(L.entDados("\nDigite o pais de origem da ave: "));
        a1.getHabit().setBioma(L.entDados("\nDigite o tipo de bioma do habitat de origem: "));
        a1.getHabit().setClima(L.entDados("\nDigite o tipo de clima do habitat de origem: "));
        
        
        a1.setHabMig(L.entDados("\nDigite o habito migratório da ave: "));
        a1.setNinho(L.entDados("\nDigite o ninho dessa ave: "));
        a1.setBico(Integer.parseInt(L.entDados("\nDigite o tamanho do bico da ave em cm: ")));

        bdAves.add(a1);
    }

    public static void cadastrarAnimal(Mamifero m1){
        Leitura L = new Leitura();
        m1 = new Mamifero();
                    
        m1.setNome(L.entDados("\nDigite o nome do mamifero: "));
        m1.setCient(L.entDados("\nDigite o nome cientifico do mamifero: "));

        try{
            m1.setDieta(L.entDados("\nDigite o tipo de dieta do mamifero: "));                        
        }catch(DietaExce de){
            de.impErro();
            return;
        }

        m1.getHabit().setPais(L.entDados("\nDigite o pais de origem do mamifero: "));
        m1.getHabit().setBioma(L.entDados("\nDigite o tipo de bioma do habitat de origem: "));
        m1.getHabit().setClima(L.entDados("\nDigite o tipo de clima do habitat de origem: "));

        m1.setMesGest(Integer.parseInt(L.entDados("\nDigite o tempo de gestação em meses do mamifero: ")));
        m1.setHabSoci(L.entDados("\nDigite qual habito social do mamifero"));
        m1.setCorPelo(L.entDados("\nDigite a cor do pelo do mamifero: "));

        bdMamif.add(m1);
    }

    public static void cadastrarAnimal(Reptil r1){
        Leitura L = new Leitura();
        r1 = new Reptil();
        r1.setNome(L.entDados("\nDigite o nome do reptil: "));
        r1.setCient(L.entDados("\nDigite o nome cientifico do reptil: "));

        try{
            r1.setDieta(L.entDados("\nDigite o tipo de dieta do reptil: "));                        
        }catch(DietaExce de){
            de.impErro();
            return;
        }

        r1.getHabit().setPais(L.entDados("\nDigite o pais de origem do reptil: "));
        r1.getHabit().setBioma(L.entDados("\nDigite o tipo de bioma do habitat de origem: "));
        r1.getHabit().setClima(L.entDados("\nDigite o tipo de clima do habitat de origem: "));

        r1.setTipoRep(L.entDados("\nDigite o tipo de reptil: "));
        r1.setHabSono(L.entDados("\nDigite o habito de sono do reptil: "));
        r1.setTemp(Integer.parseInt(L.entDados("\nDigite a temperatura ambiente necessaria para esse reptil: ")));

        bdRept.add(r1);
    }

    private static void listarAnimais() {
        int i = 0;

        System.out.println("\n===== AVES CADASTRADAS =====");

        Ave ave = new Ave();
        ave.reproducao();

        for(Ave a1 : bdAves){
            i++;
            System.out.println("\nDADOS DA "+i+"º AVE");
            System.out.println("Nome: "+a1.getNome());
            System.out.println("Nome cientifico: "+a1.getCient());
            System.out.println("Dieta: "+a1.getDieta());
            System.out.println("Pais de origem: "+a1.getHabit().getPais());
            System.out.println("Bioma do habitat de origem: "+a1.getHabit().getBioma());
            System.out.println("Clima do habitat de origem: "+a1.getHabit().getClima());
            System.out.println("Habito Migratorio: "+a1.getHabMig());
            System.out.println("Tipo de Ninho: "+a1.getNinho());
            System.out.println("Tamanho do bico: "+a1.getBico());
        }
        if(i == 0){
            System.out.println("\nNao ha aves cadastradas!");
        }

        i = 0;

        System.out.println("\n===== MAMIFEROS CADASTRADOS =====");

        Mamifero mamifero = new Mamifero();
        mamifero.reproducao();

        for(Mamifero m1 : bdMamif){
            i++;
            System.out.println("\nDADOS DO "+i+"º MAMIFERO");
            System.out.println("Nome: "+m1.getNome());
            System.out.println("Nome cientifico: "+m1.getCient());
            System.out.println("Dieta: "+m1.getDieta());
            System.out.println("Pais de origem: "+m1.getHabit().getPais());
            System.out.println("Bioma do habitat de origem: "+m1.getHabit().getBioma());
            System.out.println("Clima do habitat de origem: "+m1.getHabit().getClima());
            System.out.println("Tempo de gestação: "+m1.getMesGest()+" meses");
            System.out.println("Habito social: "+m1.getHabSoci());
            System.out.println("Cor do pelo: "+m1.getCorPelo());
        }

        if(i == 0){
            System.out.println("\nNao ha mamiferos cadastrados!");
        }

        i = 0;

        System.out.println("\n===== REPTEIS CADASTRADOS =====");

        Reptil reptil = new Reptil();
        reptil.reproducao();

        for(Reptil r1 : bdRept){
            i++;
            System.out.println("\nDADOS DO "+i+"º REPTIL");
            System.out.println("Nome: "+r1.getNome());
            System.out.println("Nome cientifico: "+r1.getCient());
            System.out.println("Dieta: "+r1.getDieta());
            System.out.println("Pais de origem: "+r1.getHabit().getPais());
            System.out.println("Bioma do habitat de origem: "+r1.getHabit().getBioma());
            System.out.println("Clima do habitat de origem: "+r1.getHabit().getClima());
            System.out.println("Tipo de reptil: "+r1.getTipoRep());
            System.out.println("Habito de sono: "+r1.getHabSono());
            System.out.println("Temperatura necessaria: "+r1.getTemp());
        }

        if(i == 0){
            System.out.println("\nNao ha repteis cadastrados!");
        }
    }
    
}
