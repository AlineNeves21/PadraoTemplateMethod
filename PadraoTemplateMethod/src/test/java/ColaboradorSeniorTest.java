import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColaboradorSeniorTest {
    @Test
    void deveRetonarSenior() {
        ColaboradorSenior colaborador = new ColaboradorSenior();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(7.1f);
        assertEquals("Sênior", colaborador.verificarCargo());
    }

    @Test
    void deveRetonarNaoIdentificado() {
        ColaboradorSenior colaborador = new ColaboradorSenior();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        assertEquals("Cargo do colaborador não identificado", colaborador.verificarCargo());
    }

    @Test
    void deveRetornarInformacoes() {
        ColaboradorSenior colaborador = new ColaboradorSenior();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        colaborador.setNome("Laura");
        colaborador.setMatricula(4);
        assertEquals("ColaboradorSenior{matrícula=4, nome='Laura', cargo=Cargo do colaborador não identificado}", colaborador.getInfo());
    }
}
