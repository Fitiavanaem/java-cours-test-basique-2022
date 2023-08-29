public class Tableau{
    public static void main(String[] args) {
        
        int[] age = {10,15,20,25};
            for(int i : age){
                System.out.println(i);
            }
        TableauString();
        TableauStrings();

        }
    static void TableauString(){
        String[] nom={"Fitiavana" , "Fara" , "Lahy"};

        for(int i =0;i<nom.length; i++){
            System.out.println(nom[i]);
        }
    }
    static void TableauStrings(){
        String[] nom= new String[]{"Rojo" , "Bri" , "Siki"};

        for(int i =0;i<nom.length; i++){
            System.out.println(nom[i]);
        }
    }
}