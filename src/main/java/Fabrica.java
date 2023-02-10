import javax.swing.*;

public class Fabrica {
    public static void caracteristicas(Coche coche) {
        // coche = new Coche();
        JOptionPane.showMessageDialog(null, "Matrícula: " + coche.getMatricula() + "\nMarca: " + coche.getMarca()
                + "\nModelo: " + coche.getModelo() + "\nColor: " + coche.getColor() + "\nTecho Solar: " + coche.getTechoSolar()
                + "\nNúmero de puertas: " + coche.getNumPuertas() + "\nNúmero de plazas: " + coche.getNumPlazas());
    }

    public static void main(String[] args) {
        Coche car1 = new Coche("1234-DF");
        car1.setMarca("Seat");
        car1.setModelo("Toledo");
        car1.setColor("Azul");
        car1.setTechoSolar(false);
        car1.setKilometros(200);
        car1.setNumPuertas(3);
        car1.setNumPlazas(5);

        Coche car2 = new Coche();
        car2.matricular("5678-AG");
        car2.setMarca("Fiat");
        car2.setModelo("Uno");
        car2.setColor("Rojo");
        car2.setTechoSolar(true);
        car2.setKilometros(300);
        car2.setNumPuertas(3);
        car2.setNumPlazas(2);

        Coche car3 = new Coche(5, 5);
        car3.setMatricula("9012-HH");
        car3.setMarca("BMW");
        car3.setModelo("850");
        car3.setColor("Gris");
        car3.setTechoSolar(false);
        car3.setKilometros(400);

        Coche car4 = new Coche("VW", "Caddy", "Blanco");
        car4.setMatricula("3456-XS");
        car4.setTechoSolar(true);
        car4.setKilometros(500);
        car4.setNumPuertas(5);
        car4.setNumPlazas(7);



    }
}
