import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HospedeBuilderTest {

    @Test
    void deveRetornarExcecaoParaHospedeSemCodigo() {
        try {
            HospedeBuilder hospedeBuilder = new HospedeBuilder();
            Hospede hospede = hospedeBuilder
                    .setNome("Hospede 1")
                    .setEmail("hospede@gamil.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemNome() {
        try {
            HospedeBuilder hospedeBuilder = new HospedeBuilder();
            Hospede hospede = hospedeBuilder
                    .setCodigo(1)
                    .setEmail("hospede@gamil.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarHospedeValido() {

        HospedeBuilder hospedeBuilder = new HospedeBuilder();
        Hospede hospede = hospedeBuilder
                .setCodigo(1)
                .setNome("Hospede 1")
                .setEmail("hospede@gamil.com")
                .build();
        assertNotNull(hospede);
    }
}
