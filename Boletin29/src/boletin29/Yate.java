package boletin29;

public class Yate extends Barco {
    private double potencia;

    public Yate() {
    }

    public Yate(double potencia, String matricula, double eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public double calcularModulo(){
        super.setModulo(super.calcularModulo()+(2/potencia));
        return super.getModulo();
    }
    
}