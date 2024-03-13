public class Calculadora {

    private float pi = 3.14f;

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    double circunferencia(double raio){
    return 2*this.pi*raio;
    }

    double volumeEsfera(double raio){
    return ((4)*(this.pi)*(raio*raio*raio))/3;
    }

    double volumeCilindro(double raio, double altura){
    return this.pi*raio*raio*altura;
    }
}
