package ra.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class SongDtoForm {
    private Long id;
    private String name;
    private String catalog;
    private MultipartFile path;

    public SongDtoForm() {
    }

    public SongDtoForm(Long id, String name, String catalog, MultipartFile path) {
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

    public MultipartFile getPath() {
        return path;
    }

    public void setPath(MultipartFile path) {
        this.path = path;
    }
}
