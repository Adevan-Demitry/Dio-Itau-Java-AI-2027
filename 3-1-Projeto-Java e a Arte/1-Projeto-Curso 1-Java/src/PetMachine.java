public class PetMachine {

    private boolean clean = true;
    private Pet pet;

    public void takeAShower() {

        if (pet == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        System.out.println("Dando banho no pet: " + pet.getName());
        clean = true;
    }

    public void putPet(Pet pet) {

        if (!clean) {
            System.out.println("A máquina precisa ser limpa antes de receber outro pet.");
            return;
        }

        if (this.pet != null) {
            System.out.println("A máquina já possui um pet.");
            return;
        }

        this.pet = pet;
        clean = false;

        System.out.println("Pet colocado na máquina: " + pet.getName());
    }

    public Pet removePet() {

        if (pet == null) {
            System.out.println("Não há pet para retirar.");
            return null;
        }

        Pet removedPet = pet;
        pet = null;

        System.out.println("Pet retirado da máquina: " + removedPet.getName());

        return removedPet;
    }

    public void cleanMachine() {

        if (pet != null) {
            System.out.println("Retire o pet antes de limpar a máquina.");
            return;
        }

        clean = true;

        System.out.println("Máquina limpa.");
    }
}