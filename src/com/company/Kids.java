package com.company;

public class Kids extends Person implements Gadget{

    public Kids(String nama, int umur, int NIK){
        super(nama,umur,NIK);
    }

    @Override
    public String jenisPersona() {
        return "Balita";
    }

    @Override
    public String gadget() {
        return null;
    }

    public String toString(){
        return String.format("Persona : " + jenisPersona() + "\nGadget : " + gadget() + "\nNama : " + super.getNama() + "\nUmur : " + super.getUmur() + "\nNIK : " + super.getNIK() + "\n");
    }
}
