package inheritance;

import org.w3c.dom.ls.LSOutput;

//sarqum enq super class
    class A {
        int i, j;

        void showij(){
            System.out.println("i u j: " + i + " " + j);
        }
}

    //sarqum enq podclass
    class B extends A{
        int k;

        void showk(){
            System.out.println("k: " + k );
        }
        void sum(){
            System.out.println("i+j+k: " + (i+j+k));
        }
    }

