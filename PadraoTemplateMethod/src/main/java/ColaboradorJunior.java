public class ColaboradorJunior extends Colaborador {

    public String verificarCargo() {
        if (this.calcularSalario() == 1000f) {
            return "Júnior";
        }
        else {
            return "Cargo do colaborador não identificado";
        }
    }
    @Override
    public String getTipo() {
        return "ColaboradorJunior";
    }
}
