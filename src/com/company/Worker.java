package com.company;

public class Worker extends Person{
    private int gaji;

    public Worker(String nama, int umur, int NIK, int gaji){
        super(nama,umur,NIK);
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public String toString(){
        return String.format("Nama : " + super.getNama() + "\nUmur : " + super.getUmur() + "\nNIK : " + super.getNIK() + "\nGaji : " +  getGaji());
    }
}
