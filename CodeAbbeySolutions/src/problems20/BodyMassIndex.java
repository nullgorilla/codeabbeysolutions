package problems20;

import java.util.Locale;
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        int size = input.nextInt();
        
        String[] results = new String[size];
        for (int i = 0; i < size; i++) {
            results[i] = getBodyMassIndexAnswer(input.nextDouble(), input.nextDouble());
        }
        
        input.close();
        
        for(String s : results) {
            System.out.print(s+" ");
        }
    }
    
    private static String getBodyMassIndexAnswer(double weight, double height) {
        double BMI = (weight/Math.pow(height, 2));
        
        if(BMI < 18.5) {
            return "under";
        }else if(BMI >= 18.5 && BMI < 25.0) {
            return "normal";
        }else if(BMI >= 25.0 && BMI < 30.0) {
            return "over";
        }else {
            return "obese";
        }
    }
    
}