import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColaboradorJuniorTest {
    @Test
    void deveRetonarJunior() {
        ColaboradorJunior colaborador = new ColaboradorJunior();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(1.0f);
        assertEquals("Júnior", colaborador.verificarCargo());
    }

    @Test
    void deveRetonarNaoIdentificado() {
        ColaboradorJunior colaborador = new ColaboradorJunior();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        assertEquals("Cargo do colaborador não identificado", colaborador.verificarCargo());
    }

    @Test
    void deveRetornarInformacoes() {
        ColaboradorJunior colaborador = new ColaboradorJunior();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        colaborador.setNome("Raphael");
        colaborador.setMatricula(1);
        assertEquals("ColaboradorJunior{matrícula=1, nome='Raphael', cargo=Cargo do colaborador não identificado}", colaborador.getInfo());
    }
}
