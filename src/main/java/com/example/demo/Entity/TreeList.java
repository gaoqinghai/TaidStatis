package com.example.demo.Entity;

public class TreeList {
    public String jdmc;
    public String bgqxyj;
    public String bgqxssn;
    public String bgqxsn;
    public String bgqxcq;
    public String filesize;
    public String allfile;

    @Override
    public String toString() {
        return "TreeList{" +
                "jdmc='" + jdmc + '\'' +
                ", bgqxyj='" + bgqxyj + '\'' +
                ", bgqxssn='" + bgqxssn + '\'' +
                ", bgqxsn='" + bgqxsn + '\'' +
                ", bgqxcq='" + bgqxcq + '\'' +
                ", filesize='" + filesize + '\'' +
                ", allfile='" + allfile + '\'' +
                '}';
    }


    public String getJdmc() {
        return jdmc;
    }

    public void setJdmc(String jdmc) {
        this.jdmc = jdmc;
    }

    public String getBgqxyj() {
        return bgqxyj;
    }

    public void setBgqxyj(String bgqxyj) {
        this.bgqxyj = bgqxyj;
    }




    public String getBgqxssn() {
        return bgqxssn;
    }

    public void setBgqxssn(String bgqxssn) {
        this.bgqxssn = bgqxssn;
    }

    public String getBgqxsn() {
        return bgqxsn;
    }

    public void setBgqxsn(String bgqxsn) {
        this.bgqxsn = bgqxsn;
    }

    public String getBgqxcq() {
        return bgqxcq;
    }

    public void setBgqxcq(String bgqxcq) {
        this.bgqxcq = bgqxcq;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getAllfile() {
        return allfile;
    }

    public void setAllfile(String allfile) {
        this.allfile = allfile;
    }
}
