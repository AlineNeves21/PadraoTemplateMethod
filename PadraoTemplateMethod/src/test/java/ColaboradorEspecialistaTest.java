import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorEspecialistaTest {
    @Test
    void deveRetonarEspecialista() {
        ColaboradorEspecialista colaborador = new ColaboradorEspecialista();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(10.0f);
        assertEquals("Especialista", colaborador.verificarCargo());
    }

    @Test
    void deveRetonarNaoIdentificado() {
        ColaboradorEspecialista colaborador = new ColaboradorEspecialista();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        assertEquals("Cargo do colaborador não identificado", colaborador.verificarCargo());
    }

    @Test
    void deveRetornarInformacoes() {
        ColaboradorEspecialista colaborador = new ColaboradorEspecialista();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        colaborador.setNome("Marcelo");
        colaborador.setMatricula(2);
        assertEquals("ColaboradorEspecialista{matrícula=2, nome='Marcelo', cargo=Cargo do colaborador não identificado}", colaborador.getInfo());
    }
}
