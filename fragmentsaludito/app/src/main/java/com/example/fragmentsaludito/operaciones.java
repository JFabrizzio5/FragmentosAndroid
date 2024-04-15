package com.example.fragmentsaludito;

public class operaciones {
    private int datito;
    private int datito2;

    public int getDatito2() {
        return datito2;
    }

    public void setDatito2(int datito2) {
        this.datito2 = datito2;
    }

    public int getDatito() {
        return datito;
    }

    public void setDatito(int datito) {
        this.datito = datito;
    }
    public int doble(){
        return datito * 2;
    }
    public int trple(){
        return datito * 3;
    }
    public int cudruple(){
        return datito * 4;
    }
    public int suma() {
        return datito + datito2;
    }
    public int resta() {
        return datito - datito2;
    }
    public int multi() {
        return datito * datito2;
    }
    public int divi() {
        return datito / datito2;
    }
}
