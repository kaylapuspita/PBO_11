/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSVCopy;

/**
 *
 * @author User
 */
import java.io.*;

public class CSVCopy {
    public static void main(String[] args) {
        String sourceFile = "students.csv";
        String destinationFile = "students_copy.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File berhasil disalin ke " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
