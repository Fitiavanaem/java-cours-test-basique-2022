import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TestminusHours {
   
    public static void main(String[] args){
        
    try {
            String timeString = "19:34:50.63";
            
            // Parse la chaîne en LocalTime
            LocalTime time = LocalTime.parse(timeString);
  
            // Affiche LocalTime avant la soustraction
            System.out.println("LocalTime avant la soustraction: " + time);

            // Soustrait 3 heures en utilisant minusHours()
            LocalTime value = time.minusHours(3);
  
            // Affiche le résultat
            System.out.println("LocalTime après la soustraction: " + value);
        } catch (DateTimeParseException e) {
            System.out.println("Erreur de format de temps : " + e.getMessage());
        }
    }
}
