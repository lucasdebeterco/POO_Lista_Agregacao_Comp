package Computador;

public class Main {
    public static void main(String[] args) {

        Computador cp = new Computador();

        cp.setTensao(220);
        cp.setConsumo(1600);

        cp.setMarca("Computador");
        cp.setModelo("dos Sonhos");

        cp.gabinete.setBaias(5);
        cp.gabinete.setModelo("Cosmos 2");
        cp.gabinete.setTipo("Full Tower");

        cp.gabinete.placamae.setMarca("Asus");
        cp.gabinete.placamae.setModelo("Rampage 6 Extreme");

        cp.gabinete.placamae.memoria.setCapacidade(128);
        cp.gabinete.placamae.memoria.setModelo("Royal");
        cp.gabinete.placamae.memoria.setMarca("Gskill");
        cp.gabinete.placamae.memoria.setValocidade(5000);

        cp.gabinete.placamae.processador.setMarca("Intel");
        cp.gabinete.placamae.processador.setModelo("i9 9980XE");
        cp.gabinete.placamae.processador.setClock(4.8f);
        cp.gabinete.placamae.processador.setCache(24.75f);

        cp.gabinete.placamae.hd.setCapacidade(2000);
        cp.gabinete.placamae.hd.setMarca("Seagate");
        cp.gabinete.placamae.hd.setModelo("2000");
        cp.gabinete.placamae.hd.setRpm(7200);

        cp.monitor.setMarca("Asus");
        cp.monitor.setResolucao("4K");
        cp.monitor.setTipo("144HZ");

        cp.teclado.setMarca("Razer");
        cp.teclado.setTipo("Macânico");

        cp.mouse.setMarca("Razer");
        cp.mouse.setTipo("RGB ;D");

        System.out.println(cp);

    }
}
