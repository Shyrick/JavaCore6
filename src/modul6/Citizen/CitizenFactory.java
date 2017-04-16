package modul6.Citizen;

public  class CitizenFactory {

    private static class Englishman implements Citizen{

        @Override
        public void sayHello() {

            System.out.println("Хеллоу");
        }
    }

    private static class Chinese implements Citizen{

        @Override
        public void sayHello() {

            System.out.println("Ни-хау");
        }
    }

    private static class Russian implements Citizen{

        @Override
        public void sayHello() {

            System.out.println("Привет");
        }
    }

    private static class Italian implements Citizen{

        @Override
        public void sayHello() {

            System.out.println("Чао");
        }
    }

    public static Citizen englishman(){
        return new Englishman();
    }

    public static Citizen chinese(){
        return new Chinese();
    }

    public static Citizen russian(){
        return new Russian();
    }

    public static Citizen italian(){
        return new Italian();
    }
}
