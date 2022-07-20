import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColaboradorPlenoTest {
    @Test
    void deveRetonarPleno() {
        ColaboradorPleno colaborador = new ColaboradorPleno();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(4.1f);
        assertEquals("Pleno", colaborador.verificarCargo());
    }

    @Test
    void deveRetonarNaoIdentificado() {
        ColaboradorPleno colaborador = new ColaboradorPleno();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        assertEquals("Cargo do colaborador não identificado", colaborador.verificarCargo());
    }

    @Test
    void deveRetornarInformacoes() {
        ColaboradorPleno colaborador = new ColaboradorPleno();
        colaborador.setSalarioBase(1000.0f);
        colaborador.setPorcentagem(0.0f);
        colaborador.setNome("Aline");
        colaborador.setMatricula(3);
        assertEquals("ColaboradorPleno{matrícula=3, nome='Aline', cargo=Cargo do colaborador não identificado}", colaborador.getInfo());
    }
}
