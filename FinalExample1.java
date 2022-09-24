package FinalKeyWord;

//trying to change the final variable

public class FinalExample1 {

    final int a = 10;
    void use(){
       int a = 20;
        System.out.println(a);
    }

    public static void main(String[] args) {
        FinalExample1 obj = new FinalExample1();
        obj.use();

    }
}
