public class Edificio implements CarbonFootprint {
    private String localizacao;
    private int andares;
    private boolean temElevador;

    public Edificio(String localizacao, int andares, boolean temElevador) {
        this.localizacao = localizacao;
        this.andares = andares;
        this.temElevador = temElevador;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public boolean isTemElevador() {
        return temElevador;
    }

    public void setTemElevador(boolean temElevador) {
        this.temElevador = temElevador;
    }

    @Override
    public double getCarbonFootprint() {
        double baseFootprint = andares * 1000; 
        if (temElevador) {
            baseFootprint += 500;
        }
        return baseFootprint;
    }
}