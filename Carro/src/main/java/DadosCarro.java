public class DadosCarro {
    private  String Marca;
    private  String Modelo;
    private Integer Ano ;
    private String Cor;

     public DadosCarro (String marca, String modelo) {
         this.Marca = marca;
         this.Modelo = modelo;
     }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public Integer getAno() {
        return Ano;
    }

    public void setAno(Integer ano) {
        this.Ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }
}
