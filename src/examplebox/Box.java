package examplebox;

public class Box {
  ;
    double width;
    double height;
    double depth;

    //obyekti kloun karucel
    Box(Box ob) { //poxancel obyelty kastruktrin
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
         depth = d;
    }


    // kanstruktory vory ogtagorcvum  e bolo chpsern yntrelis
    Box() {
        width = -1; // -`1 ogtagorcvum  e nshelu hamar
        height = -1; //неинициализированного
        depth = -1; //параллелепипеда
    }
    //konstruktor vory ogtagorcvum e kub sarqelu hamar
Box(double len) {
    width = height = depth = len;
    }
    //hashvarkel ev veradarcnel cavaly
    double volume() {
        return width * height * depth;
    }
}
