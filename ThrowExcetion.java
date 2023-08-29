public class ThrowExcetion {
    public static void main(String[] args) {
        try {
            method(10);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    public static void method(int i){
        if(i < 20) throw new RuntimeException("i doit être positif ou nul : " + i);
    }
}
