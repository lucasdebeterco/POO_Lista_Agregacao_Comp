package CarroMotorPessoa;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();

        c.setFabricante("BMW");
        c.setModelo("M4");
        c.setCor("Miami blue");
        c.setAno(2018);

        c.dono.setNome("Lucas");
        c.dono.setEndereco("Rio do Sul");

        c.motor.setPotencia(431);
        c.motor.setMarca("BMW");
        c.motor.setCombustivel("Gasolina");
        c.motor.setCilindros(6);

        System.out.println(c);
    }

}
