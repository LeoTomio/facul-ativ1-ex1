public class Bicicleta implements CarbonFootprint {
    private String tipo;
    private int marchas;
    private boolean temSuspensao;

    public Bicicleta(String tipo, int marchas, boolean temSuspensao) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.temSuspensao = temSuspensao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public boolean isTemSuspensao() {
        return temSuspensao;
    }

    public void setTemSuspensao(boolean temSuspensao) {
        this.temSuspensao = temSuspensao;
    }

    @Override
    public double getCarbonFootprint() {
        double baseFootprint = 50;
        if (temSuspensao) {
            baseFootprint += 20;
        }
        if (marchas < 7) {
            baseFootprint += 10;
        } else if (marchas >= 7 & marchas <= 13) {
            baseFootprint += 35;
        } else if (marchas >= 14 & marchas <= 20) {
            baseFootprint += 50;
        } else if (marchas > 21) {
            baseFootprint += 100;
        }
        return baseFootprint;
    }
}