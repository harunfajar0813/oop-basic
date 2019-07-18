package com.company;

public class Worker extends Person{
    public int gaji;

    public Worker(String nama, int umur, int gaji){
        super(nama,umur);
        this.gaji = gaji;
    }

    public String toString(){
        return String.format(super.toString() + "\nGaji : " + gaji);
    }
}
