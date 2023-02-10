import javax.swing.*;

public class Coche {
    private String matricula, marca, modelo, color;
    private int numPuertas, numPlazas;
    private float kilometros;
    private boolean techoSolar;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getKilometros() {
        return kilometros;
    }

    public void setKilometros(float kilometros) {
        try {
            if (kilometros >= 0) {
                this.kilometros = kilometros;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ser un número decimal positivo mayor o igual a 0");
        }
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        try {
            if (numPuertas > 0 && numPuertas <= 5) {
                this.numPuertas = numPuertas;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EL número de puertas debe estar entre 1 y 5.");
        }
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        try {
            if (numPlazas > 0 && numPlazas <= 7) {
                this.numPlazas = numPlazas;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EL número de plazas debe estar entre 1 y 7.");
        }
    }

    public boolean getTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }


    public Coche() {
        matricula = "";
        marca = "SEAT";
        modelo = "ALTEA";
        color = "Blanco";
        techoSolar = false;
        kilometros = 0.0f;
        numPuertas = 3;
        numPlazas = 5;
    }

    public Coche(String matricula) {
        this();
        this.matricula = matricula;
    }

    public Coche(int numPuertas, int numPlazas) {
        this();
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }

    public Coche(String marca, String modelo, String color){
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // ESTE NO SÉ SI SIRVE DE ALGO TENIENDO OTRO CONSTRUCTOR DANDOLE TODOS LOS VALORES POR DEFECTO
    public Coche(String matricula, String marca, String modelo, String color, boolean techoSolar, float kilometros, int numPuertas, int numPlazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.techoSolar = techoSolar;
        this.kilometros = kilometros;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }

    // MÉTODOS PROPIOS
    public void avanzar(float kms) {
        setKilometros(getKilometros() + kms);
        JOptionPane.showMessageDialog(null, "Hemos añadido " + kms + " al cuentakilometros.\nKilometros totales: " + getKilometros());
    }

    public void tunear() {
        this.kilometros = 0.0f;
        if (!this.techoSolar) {
            this.techoSolar = true;
            JOptionPane.showMessageDialog(null, "EL cuentakilómetros se ha puesto a 0 y se ha instalado techo solar");
        } else {
            JOptionPane.showMessageDialog(null, "EL cuentakilómetros se ha puesto a 0 y no se ha instalado techo solar porque ya lleva");
        }
    }

    public void tunear(String color) {
        this.color = color;
        this.kilometros = 0.0f;
        if (!this.techoSolar) {
            this.techoSolar = true;
            JOptionPane.showMessageDialog(null, "EL cuentakilómetros se ha puesto a 0, se ha pintado del color indicado y se ha instalado techo solar");
        } else {
            JOptionPane.showMessageDialog(null, "EL cuentakilómetros se ha puesto a 0, se ha pintado del color indicado y no se ha instalado techo solar porque ya lleva");
        }
    }

    public void matricular(String matricula) {
        setMatricula(matricula);
        JOptionPane.showMessageDialog(null, "Se ha asignado esta matrícula " + getMatricula() + " a este coche.");
    }


}
