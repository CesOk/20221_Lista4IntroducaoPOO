import static javax.swing.JOptionPane.showInputDialog;
public class Ex4_TesteCarro {
    public static void main(String[] args) {
        String placa1, piloto1, placa2, piloto2; 

        placa1 = showInputDialog("Declare a placa");
        piloto1 = showInputDialog("Declare o seu nome");

        placa2 = showInputDialog("Declare a placa");
        piloto2 = showInputDialog("Declare o seu nome");

        Ex3_Carro carro1 = new Ex3_Carro(placa1, piloto1);
        Ex3_Carro carro2 = new Ex3_Carro(placa2, piloto2);

        carro1.getPlaca();
        carro1.getPiloto();
        carro1.acelerar();
        carro1.frear();

        carro2.getPlaca();
        carro2.getPiloto();
        carro2.acelerar();
        carro2.frear();
    }
}
