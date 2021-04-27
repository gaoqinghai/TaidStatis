package com.example.demo.Entity;



import java.util.List;

public class Tree {
   private String  id;
   private String  title;
   private String  id_structure;
   private String  id_parent_node;
    private String espath;
    private String  id_business;
    private String  id_modelstructure;
    private String esorder;
    private String  islefa;
    private List<Tree> children;

    public List<Tree> getChildren() {
        return children;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }

    private String  id_seq;


    public String getId_parent_node() {
        return id_parent_node;
    }

    public void setId_parent_node(String id_parent_node) {
        this.id_parent_node = id_parent_node;
    }


    @Override
    public String toString() {
        return "Tree{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", id_structure='" + id_structure + '\'' +
                ", id_parent_node='" + id_parent_node + '\'' +
                ", espath='" + espath + '\'' +
                ", id_business='" + id_business + '\'' +
                ", id_modelstructure='" + id_modelstructure + '\'' +
                ", esorder='" + esorder + '\'' +
                ", islefa='" + islefa + '\'' +
                ", id_seq='" + id_seq + '\'' +
                ", children=" + children +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspath() {
        return espath;
    }

    public void setEspath(String espath) {
        this.espath = espath;
    }

    public String getId_business() {
        return id_business;
    }

    public void setId_business(String id_business) {
        this.id_business = id_business;
    }

    public String getId_modelstructure() {
        return id_modelstructure;
    }

    public void setId_modelstructure(String id_modelstructure) {
        this.id_modelstructure = id_modelstructure;
    }

    public String getEsorder() {
        return esorder;
    }

    public void setEsorder(String esorder) {
        this.esorder = esorder;
    }

    public String getIslefa() {
        return islefa;
    }

    public void setIslefa(String islefa) {
        this.islefa = islefa;
    }

    public String getId_seq() {
        return id_seq;
    }

    public void setId_seq(String id_seq) {
        this.id_seq = id_seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId_structure() {
        return id_structure;
    }

    public void setId_structure(String id_structure) {
        this.id_structure = id_structure;
    }


}
