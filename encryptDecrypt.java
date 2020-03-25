import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;
import java.io.*;

public class encryptDecrypt {
    public static void main(String[] args) {

        String fileName = " ";
        String input = " ";
        String line = " ";
        char ch = ' ';

        PrintWriter encrypt;
        PrintWriter decrypt;
        Scanner in = new Scanner(System.in);

        try {
            encrypt = new PrintWriter("Encrypt.txt");
            decrypt = new PrintWriter("Decrypt.txt");

            System.out.println("Please enter the file name: ");
            fileName = in.nextLine();
            File f = new File(fileName);
            Scanner fileIn = new Scanner(f);

            System.out.println("Would you like to Encrypt or Decrypt this file?");
            input = in.nextLine();

            if (input.equalsIgnoreCase("Encrypt"))
                while (fileIn.hasNext()) {
                    line = fileIn.nextLine();
                    System.out.print(line);
                    for (int i = 0; i < line.length(); i++) {
                        ch = line.charAt(i);
                        ch++;
                        System.out.print(ch);
                        encrypt.print(ch);
                    }
                    encrypt.close();
                }
            else if (input.equalsIgnoreCase("Decrypt"))
                while (fileIn.hasNext()) {
                    line = fileIn.nextLine();
                    System.out.print(line);
                    for (int i = 0; i < line.length(); i++) {
                        ch = line.charAt(i);
                        ch--;
                        //System.out.print(ch);
                        decrypt.print(ch);
                    }
                    decrypt.close();
                }
        }
        catch(FileNotFoundException e){
            System.out.println("Sorry. Bad file name. Please try again.");
            }
        }
    }





