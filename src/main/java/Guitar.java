public class Guitar implements Instrument{
    int numberofstrings;

    public Guitar(int numberofstrings) {
        this.numberofstrings = numberofstrings;
    }

    public int getNumberofstrings() {
        return numberofstrings;
    }

    public void setNumberofstrings(int numberofstrings) {
        this.numberofstrings = numberofstrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + getNumberofstrings() + " струнами");
    }
}
