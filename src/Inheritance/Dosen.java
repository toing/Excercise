/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author Afika
 */
public class Dosen extends Pegawai {

    String golongan, jabatan;
    double gapok, total, tunjangan, totgapok;
    int peg, gol, jab;

    public Dosen() {
    }

    public void Inputan() {

        Scanner yana = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("PROGRAM MENGHITUNG GAJI POKOK PEGAWAI");
        System.out.println("-------------------------------------");
        System.out.print("Masukan NIP : ");
        nip = yana.nextLine();
        System.out.print("Masukan NIDN : ");
        nidn = yana.nextLine();
        System.out.print("Masukan Nama Anda : ");
        nama = yana.nextLine();
        System.out.print("\nMasukan jenis pekerjaan Anda : ");
        System.out.print("1.Dosen");
        System.out.print("2.Asisten");
        System.out.print("3.BAAK");
        peg = yana.nextInt();
        System.out.println("\nMasukan golongan Anda : ");
        System.out.print("1. III A");
        System.out.print("2. III B");
        System.out.print("3. III C");
        gol = yana.nextInt();
        System.out.print("Masukan Jabatan Anda : ");
        System.out.print("1. Staf");
        System.out.print("2. Keprodi");
        System.out.print("3. Rektor");
        jab = yana.nextInt();

    }
    
    public void Acount(){
        if (peg == 1) {
            switch(peg){
                case 1 :
                    if (jab ==  1 && gol == 1) {
                        gaji = 2000000;
                        tunjangan = 500000;
                        jabatan = "Staf";
                        golongan = "III A";
                    }else if(jab == 1 && gol == 2){
                        gaji = 3000000;
                        tunjangan = 1000000;
                        jabatan = "Staf";
                        golongan = "III A";
                    }else if(jab == 1 && gol == 3){
                        gaji = 5000000;
                        tunjangan = 2000000;
                        jabatan = "Staf";
                        golongan = "III A";
                        
                    }
                case 2 :
                    if (jab == 2 && gol == 1) {
                        gaji = 3000000;
                        tunjangan = 750000;
                        jabatan = "Keprodi";
                        golongan = "III B";
                    }else if(jab == 2 && gol == 2){
                        gaji = 2500000;
                        tunjangan = 500000;
                        jabatan = "III B";
                        golongan = "Keprodi";
                    }else if(jab == 2 && gol == 3){
                        gaji = 5000000;
                        tunjangan = 1500000;
                        jabatan = "Keprodi";
                        golongan = "III B";
                    }
                case 3:
                    if (jab == 3 && gol == 1) {
                        gaji = 3000000;
                        tunjangan = 1500000;
                        jabatan = "Rektor";
                        golongan = "III A";
                    }else if(jab == 3 && gol == 2){
                        gaji = 3500000;
                        tunjangan = 1750000;
                        jabatan = "Rektor";
                        golongan = "III C";
                    }else if(jab == 3 && gol == 3){
                        gaji = 4000000;
                        tunjangan = 2000000;
                        jabatan = "Rektor";
                        golongan = "III C";
                    }
            }
        }
        
        gapok = gaji;
        totgapok = gapok + tunjangan;
    }
    
    public void Output(){
        System.out.println("NIP Anda : " + nip);
        System.out.println("NIDN Anda : " + nidn);
        System.out.println("Nama Anda : " + nama);
        System.out.println("Gaji pokok Anda : " + gapok);
        System.out.println("Tunjangan Anda : " + tunjangan);
        System.out.println("Jabatan Anda : " + jabatan);
        System.out.println("Golongan Anda : " + golongan);
        System.out.println("Total Gaji Pokok  Anda : " + totgapok);
    }
}
