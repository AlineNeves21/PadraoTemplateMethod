public class ColaboradorEspecialista extends Colaborador {

    public String verificarCargo() {
        if (this.calcularSalario() >= 10000f) {
            return "Especialista";
        }
        else {
            return "Cargo do colaborador não identificado";
        }
    }
    @Override
    public String getTipo() {
        return "ColaboradorEspecialista";
    }
}
