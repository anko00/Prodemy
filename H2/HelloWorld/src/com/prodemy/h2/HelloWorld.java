package com.prodemy.h2;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Hallo Silahkan Masukkan Nama Anda : ");
        String nama= sc.nextLine();
        System.out.print("Hello " + nama + ", Selamat Sore, Semoga Weekend Anda Menyenangkan");
    }
}