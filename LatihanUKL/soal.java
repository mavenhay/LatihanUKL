import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.lang.Integer;

public class soal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Soal 1.1
        // double jarak, berat, volume, harga = 0;
        // System.out.print("Masukkan jarak tempuh (km): ");
        // jarak = input.nextDouble();
        // System.out.print("Masukkan berat paket (kg): ");
        // berat = input.nextDouble();
        // System.out.print("Masukkan volume paket (cm3): ");
        // volume = input.nextDouble();
        // harga += (jarak<=10) ? berat*4250:berat*6000;
        // if (volume>100){harga+=50000;}
        // System.out.println("Harga total: Rp"+harga);

        // Soal 1.2
        // System.out.print("Masukkan angka: ");
        // int angka = input.nextInt();
        // if (angka % 2 == 0) {
        //     System.out.println("Angka genap.");
        // } else {
        //     System.out.println("Angka ganjil.");
        // }

        // Soal 2.1
        // System.out.print("Masukkan Angka: ");
        // int angka = input.nextInt(), temp=1;
        // for(int i=1;i<=angka;i++){
        //     temp*=i;
        // }
        // System.out.println("Faktorial "+angka+": "+temp);

        //  soal 2.2
        // double r,t;
        // System.out.print("Masukkan jari-jari: ");
        // r = input.nextDouble();
        // System.out.print("Masukkan tinggi: ");
        // t = input.nextDouble();
        // System.out.println(Vtabung(r,t));

        //soal 3.1
        // int siswa, nilai=0;
        // double rata;
        // System.out.print("Masukkan jumlah siswa: ");
        // siswa = input.nextInt();
        // for(int i=1;i<=siswa;i++){
        //     System.out.print("Masukkan nilai siswa "+i+": ");
        //     nilai+=input.nextInt();
        // }
        // rata = (double)nilai/siswa;
        // System.out.println("Rata-rata: "+rata);

        //soal 3.2
        int baris, kolom;
        System.out.println("Masukkan baris matriks:");
        baris = input.nextInt();
        System.out.println("Masukkan kolom matriks:");
        kolom = input.nextInt();

        System.out.println("Masukkan matriks 1:");
        int[][] matrix1 = matrix(baris,kolom);
        System.out.println("Masukkan matriks 2:");
        int[][] matrix2 = matrix(baris,kolom);
        
        System.out.println("Hasil Matriks 1: ");
        disp(matrix1);
        System.out.println("Hasil Matriks 2: ");
        disp(matrix2);

        System.out.println("Hasil penjumlahan matriks 1 dan 2");
        int[][] newMat = count(matrix1, matrix2, baris, kolom);
        disp(newMat);

    }
    // Function soal 2.2
    public static double Vtabung(double r, double t){ 
        return Math.PI*r*r*t;
    }
    // Function soal 3.2
    public static int[][] matrix(int r, int k){
        Scanner input = new Scanner(System.in);
        int[][] res = new int[r][k];
        int num = 0;
        for(int i=0; i<r; i++){
            System.out.println("b"+(i+1)+" ");
            for(int p=0;p<k;p++){
                System.out.print("k"+(p+1)+": ");
                num = input.nextInt();
                res[i][p] = num;
            }
        }
        return res;
    }
    public static void disp(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" | "+mat[i][j]);
            }
            System.out.print(" | ");
            System.out.println();
        }
    }
    public static int[][] count(int[][] m1, int[][] m2, int r, int c) {
        int[][] res = new int[r][c];
        for(int i=0; i<r; i++){
            for(int p=0;p<c;p++){
                res[i][p] = m1[i][p] + m2[i][p];
            }
        }
        return res;
    }
}
