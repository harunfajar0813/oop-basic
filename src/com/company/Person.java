package com.company;

public abstract class Person {
    public String nama;
    public int umur;

    public Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String toString(){
        return String.format("Nama : " + nama + "\nUmur : " + umur);
    }
}
