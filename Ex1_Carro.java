public class Ex1_Carro{
    private String placa, piloto;

    public Ex1_Carro(){ 
    }

    public void acelerar(){
        System.out.println("Acelerando");
    }

    public void frear(){
        System.out.println("Parando");
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPiloto(){
        return piloto;
    }

    public void setPiloto(String piloto){
        this.piloto = piloto;
    }
}