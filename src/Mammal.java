public class Mammal extends Animal{
    private boolean extinct;

    @Override
    void makeANoise() {
        System.out.println("Mammal noises");
    }

    @Override
    void reproduce() {
        System.out.println("No eggs were used in reproduction! (unless it is platypus or echidna)");
    }

    @Override
    void eat() {
        System.out.println("Some milk was drank! Wait, drinking is not eating, right?... Whatever");
    }

    public boolean isExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }
}
