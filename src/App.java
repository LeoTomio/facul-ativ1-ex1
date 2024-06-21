public class App {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Centro", 5, true);
        Carro carro = new Carro("Toyota", "Corolla", 2015);
        Bicicleta bicicleta = new Bicicleta("Montanha", 21, true);

        System.out.println("Pegada de Carbono do Edificio: " + edificio.getCarbonFootprint() + " kg CO2/ano");
        System.out.println("Pegada de Carbono do Carro: " + carro.getCarbonFootprint() + " kg CO2/ano");
        System.out.println("Pegada de Carbono da Bicicleta: " + bicicleta.getCarbonFootprint() + " kg CO2/ano");
    }
}