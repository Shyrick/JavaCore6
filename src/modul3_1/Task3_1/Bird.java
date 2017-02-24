package modul3_1.Task3_1;

public class Bird {

    String tekst;

    public Bird() {
    }

    public Bird(String tekst) {
        this.tekst = tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void sing(){
        System.out.println("I am "+ tekst);
    }
}
