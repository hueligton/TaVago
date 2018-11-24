package model.manager;

import model.entity.Cartao;
import model.entity.Hospede;
import model.entity.Pessoa;
import model.entity.UsuarioHospede;
import model.entity.UsuarioProprietario;

public class PessoaManager {
    
    private final DAO factory;

    public PessoaManager() {
        
        factory = DAO.getFactory();
        
    }
    
    public boolean cadastrarHospede(String nome, long cpf, String telefone, String rua, int numeroCasa, String cidade, String estado, String pais) {
        
        Hospede hospede = new Hospede(nome, cpf, telefone, rua, numeroCasa, cidade, estado, pais);
        
        return factory.salvar(hospede);
        
    }

    public boolean cadastrarUsuarioHospede(String nome, String email, String senha, long cpf, String telefone) {

        UsuarioHospede usuarioHospede = new UsuarioHospede(nome, cpf, telefone, email, senha);
        
        return factory.salvar(usuarioHospede);
        
    }

    public boolean cadastrarUsuarioProprietario(String nome, String email, String senha, long cpf, String telefone) {

        UsuarioProprietario usuarioProprietario = new UsuarioProprietario(nome, cpf, telefone, email, senha);
        
        return factory.salvar(usuarioProprietario);
        
    }

    public boolean excluir(int id) {
        
        Pessoa pessoa = (Pessoa) factory.buscar(new Pessoa(), id);
        
        boolean sucesso = false;
        
        if (pessoa != null)
            sucesso = factory.deletar(pessoa);
        
        return sucesso;

    }

    public Object consultarHospede(int id) {
        
        return factory.buscar(new Hospede(), id);

    }
    
    public Object consultarUsuarioHospede(int id) {
        
        return factory.buscar(new UsuarioHospede(), id);

    }
    
    public Object consultarUsuarioProprietario(int id) {
        
        return factory.buscar(new UsuarioProprietario(), id);

    }

    public boolean cadastrarCartao(String titular, String numeroCartao, String vencimento, int codigoSeguranca, int idUsuarioHospede) {
        
        UsuarioHospede usuarioHospede = (UsuarioHospede) factory.buscar(new UsuarioHospede(), idUsuarioHospede);
        
        boolean sucesso = false;
        
        if (usuarioHospede != null){
            
            Cartao cartao = new Cartao(titular, numeroCartao, vencimento, codigoSeguranca);
            factory.salvar(cartao);
            
            usuarioHospede.setCartao(cartao);
            sucesso = factory.editar(usuarioHospede);
            
        }
        
        return sucesso;
        
    }

    public boolean atualizarHospede(int id, String nome, long cpf, String telefone, String rua, int numeroCasa, String cidade, String estado, String pais) {

        Hospede hospede = (Hospede) factory.buscar(new Hospede(), id);
        
        boolean sucesso = false;
        
        if (hospede != null){
            hospede.setNome(nome);
            hospede.setCpf(cpf);
            hospede.setTelefone(telefone);
            hospede.setRua(rua);
            hospede.setNumeroCasa(numeroCasa);
            hospede.setCidade(cidade);
            hospede.setEstado(estado);
            hospede.setPais(pais);

            sucesso = factory.editar(hospede);
        }
        
        return sucesso;
      
    }

    public boolean atualizarUsuarioHospede(int id, String nome, String email, String senha, long cpf, String telefone) {

        UsuarioHospede usuarioHospede = (UsuarioHospede) factory.buscar(new UsuarioHospede(), id);
        
        boolean sucesso = false;
        
        if (usuarioHospede != null){
            usuarioHospede.setNome(nome);
            usuarioHospede.setEmail(email);
            usuarioHospede.setSenha(senha);
            usuarioHospede.setCpf(cpf);
            usuarioHospede.setTelefone(telefone);
            
            sucesso = factory.editar(usuarioHospede);
        }
        
        return sucesso;
        
    }

    public boolean atualizarUsuarioProprietario(int id, String nome, String email, String senha, long cpf, String telefone) {
        
        UsuarioProprietario usuarioProprietario = (UsuarioProprietario) factory.buscar(new UsuarioProprietario(), id);
        
        boolean sucesso = false;
        
        if (usuarioProprietario != null){
            usuarioProprietario.setNome(nome);
            usuarioProprietario.setEmail(email);
            usuarioProprietario.setSenha(senha);
            usuarioProprietario.setCpf(cpf);
            usuarioProprietario.setTelefone(telefone);

            sucesso = factory.editar(usuarioProprietario);
        }
        
        return sucesso;
      
    }

}
