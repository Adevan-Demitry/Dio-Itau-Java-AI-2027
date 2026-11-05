public class Main {

    public static void main(String[] args) {

        // Criando um pet
        Pet pet = new Pet("Rex", "Cachorro", 5);

        // Criando a máquina de banho
        PetMachine machine = new PetMachine();

        // Colocando o pet na máquina
        machine.putPet(pet);

        // Realizando o banho
        machine.takeAShower();

        // Retirando o pet da máquina
        Pet removedPet = machine.removePet();

        // Exibindo os dados do pet
        if (removedPet != null) {
            System.out.println("\nDados do pet:");
            System.out.println("Nome: " + removedPet.getName());
            System.out.println("Tipo: " + removedPet.getType());
            System.out.println("Idade: " + removedPet.getAge());
        }

        // Limpando a máquina
        machine.cleanMachine();
    }
}