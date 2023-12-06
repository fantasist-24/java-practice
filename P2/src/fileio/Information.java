package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Information {
    public static void main(String [] args)
    {
        //Scanner scan = new Scanner(System.in);
        //String ip = scan.next();
        String path = "C:/Users/ASUS/Downloads/Sample-Spreadsheet-1000-rows.csv";
        List<String> lines = new ArrayList<>();

       // Scanner sr = new Scanner(System.in);

        //String next = sr.nextLine();
       // System.out.println(next);

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            try
            {
                while((line = br.readLine())!=null)
                {
                    lines.add(line);
                    //String [] values = line.split(",");
                    //if(values[0] == ip)
                    //{
                        //System.out.println(values[3]);
                    //}


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] linesArray = lines.toArray(new String[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to search: ");
        String searchString = scanner.nextLine();

        // Display the content of the string array and count occurrences
        int count = 0;
        for (String s : linesArray) {
            if (s.contains(searchString)) {
                System.out.println(s);
                count++;
            }
        }

        // Display the count of occurrences
        System.out.println("Number of occurrences: " + count);

        // Close the scanner
        scanner.close();

        // Display the content of the string array
        /*for (String s : linesArray) {
            System.out.println(s);
        }*/
    }

}
