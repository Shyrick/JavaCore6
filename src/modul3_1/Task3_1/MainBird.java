package modul3_1.Task3_1;

import modul3_1.Task3_1.Bird;

public class MainBird {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird("singing");
        Bird bird4 = new Bird();


        bird1.setTekst("walking");
        bird2.setTekst("flying");
        bird4.setTekst(bird1.getClass().getSimpleName());

//        bird1.sing();
//        bird2.sing();
//        bird3.sing();
//        bird4.sing();

        Bird [] birds = {bird1, bird2, bird3, bird4};

//        for (int i = 0; i < birds.length; i++) {
//            birds[i].sing();
//        }

        for (Bird i : birds) {
            i.sing();
        }


    }
}
