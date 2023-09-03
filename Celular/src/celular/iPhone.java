package celular;

public class iPhone {
    private String modelo;
    private String numeroTelefone;
    private boolean conectadoInternet;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public boolean isConectadoInternet() {
        return conectadoInternet;
    }

    public void setConectadoInternet(boolean conectadoInternet) {
        this.conectadoInternet = conectadoInternet;
    }
}
