/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSVWriter;

/**
 *
 * @author User
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            System.out.print("Masukkan jumlah data yang ingin ditambahkan: ");
            int jumlah = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < jumlah; i++) {
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Umur: ");
                String umur = scanner.nextLine();
                System.out.print("Prodi: ");
                String prodi = scanner.nextLine();

                String line = nim + "," + nama + "," + umur + "," + prodi;
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Data berhasil ditambahkan.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
