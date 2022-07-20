public abstract class Colaborador {
    private int matricula;
    protected String nome;
    private float salarioBase;
    private float porcentagem;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }
    public float calcularSalario() {
        return (this.salarioBase * porcentagem);
    }

    public abstract String verificarCargo();

    public String getTipo() {
        return "Colaborador";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matrícula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", cargo=" + this.verificarCargo() +
                '}';
    }
}
