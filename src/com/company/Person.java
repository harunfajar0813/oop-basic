package com.company;

public abstract class Person {
    private String nama;
    private int umur;
    private int NIK;

    public Person(String nama, int umur, int NIK) {
        this.nama = nama;
        this.umur = umur;
        this.NIK = NIK;
    }

    public void hasil(){
        System.out.println("Nama\t: " + nama + "\nUmur\t: " + umur + "\nNIK\t\t: " + NIK);
    }
}
