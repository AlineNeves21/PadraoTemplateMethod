public class ColaboradorSenior extends Colaborador {

    public String verificarCargo() {
        if (this.calcularSalario() == 7100f) {
            return "Sênior";
        }
        else {
            return "Cargo do colaborador não identificado";
        }
    }
    @Override
    public String getTipo() {
        return "ColaboradorSenior";
    }
}
