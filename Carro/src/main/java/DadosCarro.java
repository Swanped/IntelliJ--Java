public class DadosCarro {
    private  String marca;
    private  String modelo;
    private Integer ano ;
    private String cor;

     public DadosCarro (String marca, String modelo) {
         this.Marca = marca;
         this.Modelo = modelo;
     }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public Integer getAno() {
        return ano;
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
