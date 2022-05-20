/**
 * CozaLozaWoza
 */
import java.util.*;
class Employee{
    
}
public class CozaLozaWoza {
    public static void cozalozawaza(){
        for(int i = 1; i<=110; i+=11){
            for(int j = i; j<=i+10; j++){
                if(i>=110){
                    break;
                }
                if(j%5==0 && j%7==0){
                    System.out.printf("LozaWoza ");
                }else if(j%5==0 && j%3==0){
                    System.out.printf("LozaCoza ");
                }else if(j%7==0 && j%3==0){
                    System.out.printf("WozaCoza ");
                }else if(j%3==0){
                    System.out.printf("Coza ");
                }else if(j%5==0){
                    System.out.printf("Loza ");
                }else if(j%7==0){
                    System.out.printf("Woza ");
                }else{
                    System.out.printf(j+" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void usht2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        double students = input.nextInt();
        double[] arr = new double[(int)students];
        int c = 0;
        for (double i : arr ){
            System.out.println("Enter the grade of student "+arr[c]);
            double grade = input.nextDouble();
            arr[c] = grade;
            c++;
        }
        double max = 0;
        double av = 0;
        double min = arr[0];

        for (double i : arr ){
            double grade = i;
            if(grade>max){
                max = grade;
            }
            if(grade<min){
                min = grade;
            }
            av += grade;            

        }
        System.out.println("Average : "+av/students);
        System.out.println("max : "+max);
        System.out.println("min : "+min);
        input.close();
    }
    public static boolean contains(int[] arr, int i){

        for(int in : arr){            
            if(in == i) {
                return true;
            } 
        }
        return false;
    }
    public static void guessword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type the word to be guessed");
        String word = input.nextLine();


        String[] charfound = new String[word.length()];
        while(true){
            System.out.println("Type the char to guess:");
            String ch = input.nextLine();
            
            for(int i = 0; i<=word.length()-1; i++){
                if(word.charAt(i) == ch.charAt(0)){
                    charfound[i] = Character.toString(word.charAt(i));
                }
            }
            String wordd = "";
            int po = 0;
            for(String ccc : charfound){
                if(ccc != null){
                    wordd +=ccc;
                    po++;
                }else{
                    wordd +="_";
                    
                }

            }
            System.out.println(wordd);
            if(po==word.length()){
                System.out.println("Finish!");
                break;
            }
            
        }
    }

    public static void main(String[] arr){
        System.out.println("yay");
        
     
    }
    
}
