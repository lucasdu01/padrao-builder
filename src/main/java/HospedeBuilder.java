import java.util.Date;

public class HospedeBuilder {

    private Hospede hospede;

    public HospedeBuilder() {
        hospede = new Hospede();
    }

    public Hospede build() {
        if (hospede.getCodigo() == 0)
            throw new IllegalArgumentException("Código inválido");
        if (hospede.getNome().equals(""))
            throw new IllegalArgumentException("Nome inválido");

        return hospede;
    }

    public HospedeBuilder setCodigo(int codigo) {
        hospede.setCodigo(codigo);
        return this;
    }

    public HospedeBuilder setNome(String nome) {
        hospede.setNome(nome);
        return this;
    }

    public HospedeBuilder setDataNascimento(Date dataNascimento) {
        hospede.setDataNascimento(dataNascimento);
        return this;
    }

    public HospedeBuilder setCpf(String cpf) {
        hospede.setCpf(cpf);
        return this;
    }

    public HospedeBuilder setRg(String rg) {
        hospede.setRg(rg);
        return this;
    }

    public HospedeBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        hospede.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public HospedeBuilder setEnderecoNumero(int enderecoNumero) {
        hospede.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public HospedeBuilder setEnderecoBairro(String enderecoBairro) {
        hospede.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public HospedeBuilder setEnderecoCidade(String enderecoCidade) {
        hospede.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public HospedeBuilder setEnderecoUF(String enderecoUF) {
        hospede.setEnderecoUF(enderecoUF);
        return this;
    }

    public HospedeBuilder setCep(String cep) {
        hospede.setCep(cep);
        return this;
    }

    public HospedeBuilder setEmail(String email) {
        hospede.setEmail(email);
        return this;
    }

    public HospedeBuilder setCelular(String celular) {
        hospede.setCelular(celular);
        return this;
    }
}
