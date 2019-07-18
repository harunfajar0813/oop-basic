package com.company;

public class Worker extends Person implements Gadget{
    private int gaji;

    public Worker(String nama, int umur, int NIK, int gaji){
        super(nama,umur,NIK);
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    @Override
    public String jenisPersona() {
        return "Pekerja";
    }

    @Override
    public String gadget() {
        return "Smartphone";
    }

    public String toString(){
        return String.format("Persona : " + jenisPersona() + "\nGadget : " + gadget() + "\nNama : " + super.getNama() + "\nUmur : " + super.getUmur() + "\nNIK : " + super.getNIK() + "\nGaji : " +  getGaji() + "\n");
    }
}
