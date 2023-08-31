package ra.model.entity;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String catalog;
    private  String path;

    public Song() {
    }

    public Song(Long id, String name, String catalog, String path) {
        this.id = id;
        this.name = name;
        this.catalog = catalog;
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    // copy toàn bộ thuộc tính của 1 đối tượng khác
    public void copy(Song p){
        this.id=p.getId();
        this.name=p.getName();
        this.catalog=p.getCatalog();
        this.path=p.getPath();
    }
}
