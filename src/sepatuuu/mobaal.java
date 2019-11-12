package sepatuuu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class mobaal {
    public void tanggal(){
        Date ys =new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        
    }
    public static void main(String[] args) {
        System.out.println("=====----SELAMAT DATANG DI TOKO SEPATU JAYABARU----=====\n\t=====---DIJAMIN MURAH BERKUALITAS---=====");
        sepatuuu yoi = new sepatuuu(7);
        yoi.showkategori();
        Scanner frd = new Scanner(System.in);
        int jwb = frd.nextInt();
        if (jwb == 1) {
            yoi.showJenis();
            int tau = frd.nextInt();
            if (tau == 1) {
                yoi.showMerk();
                int m = frd.nextInt();
                if (m == 1) { 
                    int harga = 200000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Rensi");
                    System.out.println("Tanggal pembelian : 12/11/2019 ");
                    System.out.println("===============================");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\n3.Merk\t: 910\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    System.out.println("-------------------------------");
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                    System.out.println("------------------------------");
                    System.out.println("           TERIMAKASIH          ");
                    System.out.println("------------------------------");
                } else if (m == 2) {
                    int harga = 300000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Adidas\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 3) {
                    int harga = 400000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Nike\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 4) {
                    int harga = 500000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Skechres\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 5) {
                    int harga = 600000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Puma\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 6) {
                    int harga = 700000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Reebok\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 7) {
                    int harga = 800000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Vans\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 8) {
                    int harga = 900000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Converse\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }else if (m==9) {
                    int harga = 1000000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cowok\nMerk\t: Fila\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }

            } else if (tau == 2) {
                yoi.showMerk();
                int m = frd.nextInt();
                if (m == 1) { 
                    int harga = 200000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: 910\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 2) {
                    int harga = 300000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Adidas\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 3) {
                    int harga = 400000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Nike\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 4) {
                    int harga = 500000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Skechres\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 5) {
                    int harga = 600000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Puma\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 6) {
                    int harga = 700000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Reebok\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 7) {
                    int harga = 800000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Vans\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 8) {
                    int harga = 900000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Converse\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }else if (m==9) {
                    int harga = 1000000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Olahraga\n2.Jenis\t: cewek\nMerk\t: Fila\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }

            }

        } else if (jwb == 2) {
            yoi.showJenis();
            int tau = frd.nextInt();
            if (tau == 1) {
                yoi.showMerk();
                int m = frd.nextInt();
                if (m == 1) { 
                    int harga = 200000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: 910\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 2) {
                    int harga = 300000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Adidas\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 3) {
                    int harga = 400000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Nike\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 4) {
                    int harga = 500000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Skechres\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 5) {
                    int harga = 600000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Puma\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 6) {
                    int harga = 700000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Reebok\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 7) {
                    int harga = 800000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Vans\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 8) {
                    int harga = 900000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Converse\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }else if (m==9) {
                    int harga = 1000000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cowok\nMerk\t: Fila\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }

            } else if (tau == 2) {
                yoi.showMerk();
                int m = frd.nextInt();
                if (m == 1) { 
                    int harga = 200000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: 910\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 2) {
                    int harga = 300000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Adidas\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 3) {
                    int harga = 400000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Nike\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 4) {
                    int harga = 500000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Skechres\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 5) {
                    int harga = 600000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Puma\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 6) {
                    int harga = 700000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Reebok\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 7) {
                    int harga = 800000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Vans\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 8) {
                    int harga = 900000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Converse\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }else if (m==9) {
                    int harga = 1000000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Lari\n2.Jenis\t: cewek\nMerk\t: Fila\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }

            }
        } else if (jwb == 3) {
            yoi.showJenis();
            int tau = frd.nextInt();
            if (tau == 1) {
                yoi.showMerk();
                int m = frd.nextInt();
                if (m == 1) { 
                    int harga = 200000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: 910\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 2) {
                    int harga = 300000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Adidas\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 3) {
                    int harga = 400000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Nike\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 4) {
                    int harga = 500000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Skechres\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 5) {
                    int harga = 600000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Puma\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 6) {
                    int harga = 700000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Reebok\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 7) {
                    int harga = 800000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Vans\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 8) {
                    int harga = 900000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Converse\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }else if (m==9) {
                    int harga = 1000000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cowok\nMerk\t: Fila\nWarna\t: "+r+"\nJumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }

            } else if (tau == 2) {
                yoi.showMerk();
                int m = frd.nextInt();
                if (m == 1) { 
                    int harga = 200000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 2) {
                    int harga = 300000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 3) {
                    int harga = 400000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 4) {
                    int harga = 500000;
                    int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 5) {
                    int harga = 600000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 6) {
                    int harga = 700000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 7) {
                    int harga = 800000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                } else if (m == 8) {
                    int harga = 900000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }else if (m==9) {
                    int harga = 1000000;
                     int diskon1 = 50000;
                    int diskon2 = 100000;
                    yoi.showWarna();
                    System.out.println("===Tulis warna yang anda inginkan===");
                    String r = frd.next();
                    yoi.showSepatuuu();
                    int e = frd.nextInt();
                    System.out.println("Silahkan Masukkan Jumlah Pembelian");
                    int k = frd.nextInt();
                    int x =k*harga;
                    int y =k*harga;
                    System.out.println("==========---Nota Pembayaran---==========");
                    System.out.println("Nama Kasir : Manusia");
                    System.out.println("Tanggal pembelian(dd/mm/yyyy) : ");
                    System.out.println("List Daftar Pembelian : ");
                    System.out.println("1.Kategori\t: Santai\n2.Jenis\t: cewek\n3.Merk\t: Fila\n4.Warna\t: "+r+"\n5.Jumlah Pembelian\t: "+k);
                    if (k == 2) {
                        System.out.println("Total Harga\t: "+(x)+"\nDiskon\t: "+diskon1+"\nTotal Pembayaran : "+(x-diskon1));
                    }else if (k==3) {
                        System.out.println("Total Harga\t: "+y+"\nDiskon\t: "+diskon2+"\nTotal Pembayaran : "+(y-diskon2));
                    }else {
                        System.out.println("Total Harga\t: "+ (k*harga)+"Diskon\t: 0"+"Total Pembayaran\t:"+(k*harga));
                    }
                }

            }
        } else if (jwb == 4) {
            System.out.println("Maaf stok habis");

        } else {
            System.out.println("Maaf pilihan tidak tersedia");
        }

    }
}
