package modul6.Citizen;

public class CitizenMain {

    public static void main(String[] args) {

        Citizen Jon = CitizenFactory.englishman();
        Citizen Mao = CitizenFactory.chinese();
        Citizen Ivan = CitizenFactory.russian();
        Citizen Djovani = CitizenFactory.italian();

        Jon.sayHello();
        Mao.sayHello();
        Ivan.sayHello();
        Djovani.sayHello();



    }
}
