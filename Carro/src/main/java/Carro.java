public class Carro {
    public static void main(String[] args) {
            DadosCarro car = new DadosCarro("FIAT", "Argo");

            car.setAno(2020);
            car.setCor("blue");
        System.out.println("Comprei um novo carro da " + car.getMarca() + " do modelo "
                + car.getModelo() + " ,lindo, do ano " + car.getAno() + " na cor " + car.getCor());
        System.out.println("Vamos rodar");

    }
}
