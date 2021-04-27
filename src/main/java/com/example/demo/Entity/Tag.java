package com.example.demo.Entity;

public class Tag {
    private int id;
    private  String esidentifier;
    private  String id_structure;


    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", esidentifier='" + esidentifier + '\'' +
                ", id_structure='" + id_structure + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEsidentifier() {
        return esidentifier;
    }

    public void setEsidentifier(String esidentifier) {
        this.esidentifier = esidentifier;
    }

    public String getId_structure() {
        return id_structure;
    }

    public void setId_structure(String id_structure) {
        this.id_structure = id_structure;
    }
}
