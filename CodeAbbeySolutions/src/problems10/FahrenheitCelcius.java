package problems10;

import java.util.Scanner;

public class FahrenheitCelcius {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] fahrenheitDegrees = new int[size];
        
        for (int i = 0; i < size; i++) {
            fahrenheitDegrees[i] = input.nextInt();
        }
        
        int[] celciusDegrees = new int[size];
        
        for (int i = 0; i < size; i++) {
            celciusDegrees[i] = convert(fahrenheitDegrees[i]);
        }
        
        toStringArray(celciusDegrees);
        input.close();
        
    }
    
    public static int convert(int fahrenheitDegree) {
        final float divider = 1.8f;
        int celciusDegree = Math.round((fahrenheitDegree-32)/divider);
        
        return celciusDegree;
    }
    
    public static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

}