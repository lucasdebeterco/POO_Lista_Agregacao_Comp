package HomeTheater;

public class Main {
    public static void main(String[] args) {
        EquipamentoEletronico ee = new EquipamentoEletronico();
        System.out.println(ee);

        SistemaSom ss = new SistemaSom();
        System.out.println(ss);

        SistemaVideo sv = new SistemaVideo();
        sv.setMarca("LG");
        sv.setModelo("Vídeo");
        sv.setTipo("220V");
        sv.setResolucao("HD");
        System.out.println(sv);

        HomeTheater ht = new HomeTheater();
        ht.som.setTensao(220);
        ht.video.setResolucao("2000");
        System.out.println(ht);
    }
}
