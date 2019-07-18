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

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getNIK() {
        return NIK;
    }
}
