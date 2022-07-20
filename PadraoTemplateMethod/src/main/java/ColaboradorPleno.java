public class ColaboradorPleno extends Colaborador {

    public String verificarCargo() {
        if (this.calcularSalario() == 4100f) {
            return "Pleno";
        }
        else {
            return "Cargo do colaborador não identificado";
        }
    }
    @Override
    public String getTipo() {
        return "ColaboradorPleno";
    }
}
