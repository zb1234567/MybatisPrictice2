package com.zb.po;

public class Specil {
    private int spilinfoid;
    private  int intdepinfoid;
    private   String spilinfocode;
    private  String spilinfoname;
    private  String spilinfoaim;
    private  String spilinfoprodire;

    public int getSpilinfoid() {
        return spilinfoid;
    }

    public void setSpilinfoid(int spilinfoid) {
        this.spilinfoid = spilinfoid;
    }

    public int getIntdepinfoid() {
        return intdepinfoid;
    }

    public void setIntdepinfoid(int intdepinfoid) {
        this.intdepinfoid = intdepinfoid;
    }

    public String getSpilinfocode() {
        return spilinfocode;
    }

    public void setSpilinfocode(String spilinfocode) {
        this.spilinfocode = spilinfocode;
    }

    public String getSpilinfoname() {
        return spilinfoname;
    }

    public void setSpilinfoname(String spilinfoname) {
        this.spilinfoname = spilinfoname;
    }

    public String getSpilinfoaim() {
        return spilinfoaim;
    }

    public void setSpilinfoaim(String spilinfoaim) {
        this.spilinfoaim = spilinfoaim;
    }

    public String getSpilinfoprodire() {
        return spilinfoprodire;
    }

    public void setSpilinfoprodire(String spilinfoprodire) {
        this.spilinfoprodire = spilinfoprodire;
    }

    @Override
    public String toString() {
        return "Specil{" +
                "spilinfoid=" + spilinfoid +
                ", intdepinfoid=" + intdepinfoid +
                ", spilinfocode='" + spilinfocode + '\'' +
                ", spilinfoname='" + spilinfoname + '\'' +
                ", spilinfoaim='" + spilinfoaim + '\'' +
                ", spilinfoprodire='" + spilinfoprodire + '\'' +
                '}';
    }
}
