import java.nio.file.attribute.FileAttribute;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static  BDAnimal animais = new BDAnimal();
    private static Scanner sc = new Scanner(System.in);
    static  BDPlanta plantas = new BDPlanta();
    public static void main(String[] args) {
        telaInicial();
    }

    private static void telaInicial(){
        int opcao;
        do{
            System.out.println("""
                    Escolha qual seres dos reinos você cadastrar
                 1 - Animal
                 2 - Planta
                 3 - Sair
                """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    menuAnimal();
                    break;
                case 2:
                    menuPlanta();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opção invalida");
            }
        }while(opcao < 0 || opcao > 3);
    }

    private static void menuPlanta(){
        int opcao;
        do {
            System.out.println("""
                     Opções de visualização
                   1 - Adicionar Planta
                   2 - Ler plantas
                   3 - Atualizar Plantas
                   4 - Deletar Plantas
                   5 - Ler tudo
                   6 - Sair 
                    """);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    adicionarPlanta();
                    break;
                case 2:
                    lerPlanta();
                    break;
                case 3:
                    atualizaListaPlanta();
                    break;
                case 4:
                    removerPlanta();
                    break;
                case 5:
                    System.out.println(plantas.readAll());
                    break;
                case 6:
                    telaInicial();
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }while(opcao != 6);
    }
    private static void removerPlanta(){
        System.out.println("Digite o id do animal");
        int id = sc.nextInt();
        plantas.delete(id);
    }
    private static void adicionarPlanta(){
        System.out.println("Digite o nome da planta");
        String nome = sc.next();
        System.out.println("Digite o tipo");
        String tipo = sc.next();
        System.out.println("Digite a fonte de energia dessa planta");
        String fonte = sc.next();
        System.out.println("""
                Digite a classificação dessa planta
                1 - Pteridofita
                2 - Angiosperma
                3 - Gimnosperma
                """);
        int classificacao = sc.nextInt();

        if (classificacao == 1){
            System.out.println("Digite que grupo pertence essa planta");
            String grupo = sc.next();
            Planta pteridofita = new Pteridofita(nome,tipo,fonte,grupo);
            plantas.create(pteridofita);
        }else if(classificacao == 2){
                Planta angiosperma = new Angiosperma(nome,tipo,fonte,true,true);
                plantas.create(angiosperma);
            }else if (classificacao == 3){
                Planta gimnosperma = new Gimnosperma(nome,tipo,fonte);
                plantas.create(gimnosperma);
            }
    }


    private static void atualizaListaPlanta(){
        System.out.println("Digite o id da planta que deseja atualizar");
        int id = sc.nextInt();
        plantas.update(id,adicionarNovaCaracteristicaPlanta());
    }
    private static Planta adicionarNovaCaracteristicaPlanta(){
        System.out.println("Digite o nome da planta");
        String nome = sc.next();
        System.out.println("Digite o tipo");
        String tipo = sc.next();
        System.out.println("Digite a fonte de energia dessa planta");
        String fonte = sc.next();
        System.out.println("""
                Digite a classificação dessa planta
                1 - Pteridofita
                2 - Angiosperma
                3 - Gimnosperma
                """);
        int classificacao = sc.nextInt();

        if (classificacao == 1){
            System.out.println("Digite que grupo pertence essa planta");
            String grupo = sc.next();
            Planta pteridofita = new Pteridofita(nome,tipo,fonte,grupo);
            return pteridofita;
        }else if(classificacao == 2){
            Planta angiosperma = new Angiosperma(nome,tipo,fonte,true, true);
            return angiosperma;
        }else if (classificacao == 3){
            Planta gimnosperma = new Gimnosperma(nome,tipo,fonte);
            return gimnosperma;
        }
        return null;
    }
    private static void lerPlanta(){
        System.out.println("Digite o id da planta");
        int id = sc.nextInt();
        plantas.read(id);
    }
    private static void menuAnimal(){
        int opcao;
        do {
            System.out.println("""
                   Opções de visualização
                1 - Adicionar Animais
                2 - Ver Animais
                3 - Atualizar Animais
                4 - Deletar Animais
                5 - Ler tudo
                6 - Sair
                """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    adicionaAnimal();
                    break;
                case 2:
                    verAnimal();
                    break;
                case 3:
                    atualizarAnimalLista();
                    break;
                case 4:
                    removerAnimal();
                    break;
                case 5:
                    System.out.println(animais.readAll());
                    break;
                case 6:
                    telaInicial();
                    break;
                default:
                    System.out.println("OpcaoInvalida");
            }
        }while(opcao != 6);
    }
    private static void adicionaAnimal(){
        System.out.println("Digite o nome do animal");
        String nome = sc.next();
        System.out.println("Digite a familia");
        String familia = sc.next();
        System.out.println("Digite a classe");
        String classe = sc.next();
        System.out.println("""
                 Digite a classficação no reino animal
                 1 - Mamifero
                 2 - Ave
                 3 - Peixe
                 """);
        int classificacao = sc.nextInt();
        if (classificacao == 1){
            System.out.println("Digite o tipo fisico do animal: bipede ou quadrupede");
            String fisico = sc.next();
            Animal animal = new Mamifero(familia,nome,classe,fisico);
            animais.create(animal);
        }else if (classificacao == 2){
            System.out.println("Digite o tipo de bico");
            String bico = sc.next();
            System.out.println("Digite a quantidade de penas");
            int qtdPena = sc.nextInt();
            Animal animal = new Ave(familia,nome,classe,qtdPena,bico);
            animais.create(animal);
        }else if (classificacao == 3){
            System.out.println("Digite a classificação do esqueleto/pele do peixe");
            String classificacaoCorpo = sc.next();
            Animal animal = new Peixe(familia,nome,classe,classificacaoCorpo);
            animais.create(animal);
        }
    }
    private static void verAnimal(){
        System.out.println("Digite o id do animais que deseja visualizar");
        int id = sc.nextInt();
        animais.read(id);
    }
    private static void atualizarAnimalLista(){
        System.out.println("Digite o id do animal que deseja atualizar");
        int id = sc.nextInt();
        animais.update(id,adicionandoNovaCaracteristica());
    }
    private static Animal adicionandoNovaCaracteristica(){
        System.out.println("Digite o nome do animal");
        String nome = sc.next();
        System.out.println("Digite a familia");
        String familia = sc.next();
        System.out.println("Digite a classe");
        String classe = sc.next();
        System.out.println("""
                Digite a classficação no reino animal
                1 - Mamifero
                2 - Ave
                3 - Peixe
                """);
        int classificacao = sc.nextInt();
        if (classificacao == 1){
            System.out.println("Digite o tipo fisico do animal: bipede ou quadrupede");
            String fisico = sc.next();
            Animal animal = new Mamifero(familia,nome,classe,fisico);
            return animal;
        }else if (classificacao == 2){
            System.out.println("Digite o tipo de bico");
            String bico = sc.next();
            System.out.println("Digite a quantidade de penas");
            int qtdPena = sc.nextInt();
            Animal animal = new Ave(familia,nome,classe,qtdPena,bico);
            return animal;
        }else if (classificacao == 3){
            System.out.println("Digite a classificação do esqueleto/pele do peixe");
            String classificacaoCorpo = sc.next();
            Animal animal = new Peixe(familia,nome,classe,classificacaoCorpo);
            return animal;
        }return null;
    }
    private static void removerAnimal(){
        System.out.println("Digite o id do animal");
        int id = sc.nextInt();
        animais.delete(id);
    }
}