package com.jk.model;




import java.io.Serializable;
import java.util.List;

public class Treebean implements Serializable {
    private Integer id;

    private Integer pid;

    private String text;

    private String url;

    private Boolean selectable;

    private List<Treebean> nodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public List<Treebean> getNodes() {
        return nodes;
    }

    public void setNodes(List<Treebean> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "Treebean{" +
                "id=" + id +
                ", pid=" + pid +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", selectable=" + selectable +
                ", nodes=" + nodes +
                '}';
    }
}
