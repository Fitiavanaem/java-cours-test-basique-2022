public class ThrowsException {
    public static void main(String[] args) {
        
         int[] age={2,2,5,5};

         try {
            System.out.println(age[4]);
         } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("C'est faux");
         }
         
    }
   
    
}
