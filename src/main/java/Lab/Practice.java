package Lab;

public class Practice {
    // this method will return a specific value that we can test for using assertEquals
    public int doesAdd(int x, int y) {
        return (x + y);
    }
   //  this method will throw an Exception and we can test for this using assertThrows
    // our test will always pass because we throw an exception explicitly

   public void throwsStuff() throws Exception {
        int x = 3;
       throw new Exception();
   }

}