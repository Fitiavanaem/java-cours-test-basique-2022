public class Addition {
    public static void main(String[] args) {

        Addition addition=new Addition();

        int a=20;
        int b=30;
        int c= addition.additionDesNombres(a, b);
        System.out.println(c);
    }
    public int additionDesNombres(int a , int b){
        int c=a+b;
        return c;
    }
}