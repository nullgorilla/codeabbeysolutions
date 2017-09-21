package problems10;

import java.util.Scanner;

public class VowelCount {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] results = new int[size];
        
        input.nextLine();
        for (int i = 0; i < size; i++) {
            results[i] = countVowelLetter(input.nextLine());
        }
        
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]+ " ");
        }
        
        input.close();
        
    }
    
    public static int countVowelLetter(String sentence) {
        int counter = 0;
        
        for(char letter : sentence.toCharArray()) {
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
                counter++;
            }
        }
        
        return counter;
    }
}