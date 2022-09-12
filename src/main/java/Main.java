public class Main {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(4);
        Guitar guitar2 = new Guitar(5);
        Guitar guitar3 = new Guitar(6);
        Drum drum1 = new Drum(14);
        Drum drum2 = new Drum(15);
        Trumpet trumpet1 = new Trumpet(10);
        Trumpet trumpet2 = new Trumpet(11);
        Instrument[] instrument = {guitar1, guitar2, guitar3, drum1, drum2, trumpet1, trumpet2};
        for(Instrument instrument1 : instrument){
            instrument1.play();
        }
    }
}
