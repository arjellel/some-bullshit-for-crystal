import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class ushtrime_ne_klase_8 {
    public static String new_student(Scanner input){
        String data_rt = "";
      
        System.out.println("Give the name of the new student:");
        String name = input.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Give the username of "+name+" :");
        String username = input.nextLine();
        username = username.substring(0, 1).toUpperCase() + username.substring(1);
        System.out.println("Give the first grade of "+name+" :");
        int g1 = input.nextInt();
        System.out.println("Give the second grade of "+name+" :");
        int g2 = input.nextInt();
        System.out.println("Give the third grade of "+name+" :");
        int g3 = input.nextInt();
        data_rt = name+" "+username+" "+g1+" "+g2+" "+g3;

        return data_rt;
    }
    public static void main(String[] array){

        Scanner input = new Scanner(System.in);
        System.out.println("Give the name of the of new desired directory:");
        String directory_name = input.nextLine(); 

        
        
        File directory = new File("C:\\Users\\rambo\\Desktop\\"+directory_name);
        if(directory.mkdir()){
            System.out.println("Directory "+directory.getName()+" created successfully");
        }else if(directory.exists()){
            System.out.println("Directory "+directory.getName()+" exists!");
        }else{
            System.out.println("Sorry could't create specified directory");
        }

        File file = new File(directory.getAbsolutePath()+"\\students.txt");
        try{

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        }catch(IOException e){
            System.out.println(e);
        }


        while(true){

            System.out.println(new_student(input));
            System.out.println("Type next for new student or anything to stop this loop!");
            String next = input.nextLine();
            System.out.println("Command: "+next);
            if(!next.equals("next")){
                break;
            }

        }    
        
        try {
            FileWriter myWriter = new FileWriter("students.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
