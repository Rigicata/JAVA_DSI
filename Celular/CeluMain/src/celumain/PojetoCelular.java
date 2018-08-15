/*
Crie um classe Celular que possua atributos de
preço, modelo, marca, Gigas de
armazenamento. Deixe todos os atributos
privados e crie os getters e setters para cada
uma deles. Crie também dois construtores: um
que seja necessário para criação do objeto
possuir modelo, marca e gigas e outro que seja
necessário todos atributos para instanciar um
novo celular, pois um será usado apenas pelo
fabricante (não precisa atribuir preço) e outro
será usado pela loja.
 */
package celumain;

/**
 *
 * @author wesle
 */
public class PojetoCelular {
    private double valor;
    private String modelo;
    private String marca;
    private int gigas;

    public PojetoCelular(double valor, String modelo, String marca, int gigas) {
        this.valor = valor;
        this.modelo = modelo;
        this.marca = marca;
        this.gigas = gigas;
    }

    public PojetoCelular(String modelo, String marca, int gigas) {
        this.modelo = modelo;
        this.marca = marca;
        this.gigas = gigas;
    }
    
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGigas() {
        return gigas;
    }

    public void setGigas(int gigas) {
        this.gigas = gigas;
    }
    
    
}
