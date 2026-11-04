package HomeWork.dynamicarra;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();



       // Թեստ 1 — Ավելացնել էլեմենտներ
        da.add(5);
        da.add(10);
        da.add(15);
        da.add(20);
        da.add(25);

        da.print();

        System.out.println();

        //Թեստ 2 — Զանգվածի մեծացում

        for (int i = 1; i <= 10; i++) {
            da.add(i * 10);
        }
        da.print();

        //Թեստ 3 — Կրկնակի մեծացու
        System.out.println();
        for (int i = 1; i <= 15; i++) {
            da.add(i * 100);
        }

        da.print();

        //Թեստ 4 — Ինդեքսով ստանալ էլեմենտ
        System.out.println();

        System.out.println(da.getByIndex(0));
        System.out.println(da.getByIndex(29));
        System.out.println(da.getByIndex(-1));
        System.out.println(da.getByIndex(100));

        System.out.println();

        DynamicArray empty = new DynamicArray();

        System.out.println(empty.getByIndex(0));
    }

}
