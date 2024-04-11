public class Engenheiro extends Profissao {

    @Override
    public float calcularSalario(float salario) {
        return salario * 1.5f;
    }
}
