package files_and_exceptions;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter smth: ");
//        String row = input.nextLine();
//        System.out.println("Your row: "+row);
//
//        File file = new File("someData.txt");
//        Scanner fileInput = new Scanner(file);
//        System.out.println("Your file: ");
//        while(fileInput.hasNextLine()){
//            String line = fileInput.nextLine();
//            System.out.println(line);
//        }
//        fileInput.close();
        File file = new File("someData.txt");
        try(FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);){

            String line = bufferedReader.readLine();

            while(line!=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}