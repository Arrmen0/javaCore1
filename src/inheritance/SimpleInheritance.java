package inheritance;

public class SimpleInheritance {

    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        //podclassy karox e ogtagorcvel inqnuruyn
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superObi taroxutyuny: ");
        superOb.showij();
        System.out.println();

        //podclassy uni bolor bac dostupnerin ir superclassi
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subObi taroxutyuny: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("summa i. j u k obekt subOb: ");
        subOb.sum();

    }
}
