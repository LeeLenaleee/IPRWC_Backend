package nl.hsleiden.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "plaat")
public class MusicModel extends BaseModel {
    @Column(name = "prijs")
    private Double prijs;

    @Column(name = "producent")
    private String producent;

    @Column(name = "zanger")
    private String zanger;

    @Column(name = "lengte")
    private int lengte;

    @Column(name = "cover")
    private String cover;

    public MusicModel() {
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getZanger() {
        return zanger;
    }

    public void setZanger(String zanger) {
        this.zanger = zanger;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
