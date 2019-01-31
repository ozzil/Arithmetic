package stream;

public class ExtendTest {
     static void extend() {
        System.out.println("00");
    }
    static class ExtendChildren extends ExtendTest{
        //Override
        public ExtendChildren() {
            // TODO Auto-generated constructor stub
            super.extend();
        }
    }
}
