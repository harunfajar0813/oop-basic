package com.company;

public class Worker extends Person{
    private int gaji;

    public Worker(String nama, int umur, int NIK, int gaji){
        super(nama,umur,NIK);
        this.gaji = gaji;
    }

    public void hasil(){
        super.hasil();
        System.out.println("Gaji\t: " + gaji);
    }
}
