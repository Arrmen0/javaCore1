package BraceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {

        BraceChecker checker = new BraceChecker("Hello from [Java]");;
        checker.check();
        BraceChecker checker2 = new BraceChecker("{Hello (Java)}");
        checker2.check();
        BraceChecker checker3 = new BraceChecker("{[()]}");
        checker3.check();
        BraceChecker checker4 = new BraceChecker("Hello Java");
        checker4.check();
        BraceChecker checker5 = new BraceChecker("Hello from [Java)");
        checker5.check();
        BraceChecker checker6 = new BraceChecker("{[(])}");
        checker6.check();
        BraceChecker checker7 = new BraceChecker("Hello from Java]");
        checker7.check();
        BraceChecker checker8 = new BraceChecker("{Hello Java");
        checker8.check();
        BraceChecker checker9 = new BraceChecker("((()))");
        checker9.check();
        BraceChecker checker10 = new BraceChecker("(()");
        checker10.check();
    }
}
