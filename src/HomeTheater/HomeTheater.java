package HomeTheater;

public class HomeTheater {
    protected SistemaSom som;
    protected SistemaVideo video;

    public HomeTheater() {
        som = new SistemaSom();
        video = new SistemaVideo();
    }

    public SistemaSom getSom() {
        return som;
    }

    public void setSom(SistemaSom som) {
        this.som = som;
    }

    public SistemaVideo getVideo() {
        return video;
    }

    public void setVideo(SistemaVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Som: ").append(som);
        sb.append(", Video: ").append(video);
        return sb.toString();
    }
}
