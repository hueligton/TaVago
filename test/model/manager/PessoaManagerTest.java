/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;


import java.util.List;
import java.util.Random;
import model.entity.Cartao;
import model.entity.Pessoa;
import model.entity.UsuarioHospede;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author felipecaggi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PessoaManagerTest {
        
    private final DAO factory;
    
    PessoaManager pessoaManager = new PessoaManager();
    
    private int idPessoa;
    private String cpf;
    private String numeroCartao;
        
    public PessoaManagerTest(){
        
        factory = DAO.getFactory();

        idPessoa = 1;
        cpf = "1";
        numeroCartao = "1";
        
    }
    
    public void gerarId() {

        List<Pessoa> listPessoas = factory.listar(new Pessoa());

        Pessoa pessoa = listPessoas.get(listPessoas.size()-1);
        
        idPessoa = pessoa.getIdPessoa();
        idPessoa++;
        
    }
    
    public void gerarCpf() {
        
        List<Pessoa> listPessoas = factory.listar(new Pessoa());

        Random random = new Random();
        
        boolean cpfOk;
        
        do{
           
            int randomNumber = random.nextInt(1000);
            cpf = "" + randomNumber;
            cpfOk = true;
            
            for (Pessoa p: listPessoas){
                
                if (p.getCpf().equals(cpf))
                    cpfOk = false;
                  
            }
            
        } while (cpfOk != true);   
        
    }
    
    public void gerarNumeroCartao() {
        
        List<Cartao> listCartoes = factory.listar(new Cartao());

        Random random = new Random();

        boolean numeroCartaoOk;
                
        do{
            
            int randomNumber = random.nextInt(1000);
            numeroCartao = "" + randomNumber;
            numeroCartaoOk = true;

            for (Cartao c: listCartoes) {
                
                if (c.getNumeroCartao().equals(numeroCartao))
                    numeroCartaoOk = false;
                
            }
            
        } while (numeroCartaoOk != true);         
        
    }
        
    @Test
    public void test01_cadastrarHospede() {
        
        gerarCpf();
        gerarId();
        
        String nome = "Tamires";
        String telefone = "987654321";
        String rua = "Street Tamires";
        int numeroCasa = 12;
        String cidade = "Tamires City";
        String estado = "Tamires State";
        String pais = "United States of Tamires";
        
        if (pessoaManager.cadastrarHospede(nome, cpf, telefone, rua, numeroCasa, cidade, estado, pais)!=null) 
            
            System.out.println("++++++++ HOSPEDE CADASTRADO COM SUCESSO");
        
        else  
            System.out.println("++++++++ FALHA AO CADASTRAR HOSPEDE");
        
    }
    
    @Test
    public void test02_atualizarHospede() {
        
        String nome = "Tamires";
        String telefone = "987654321";
        String rua = "Street Tamires";
        int numeroCasa = 12;
        String cidade = "Tamires City";
        String estado = "Tamires State";
        String pais = "United States of Tamires";
        
        if (pessoaManager.atualizarHospede(idPessoa, nome, cpf, telefone, rua, numeroCasa, cidade, estado, pais))
            
            System.out.println("++++++++ HOSPEDE ATUALIZADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO ATUALIZAR HOSPEDE");
        
    }
    
    @Test
    public void test03_ConsultarHospede() {

        System.out.println("++++++++ HOSPEDE: " + pessoaManager.consultarHospede(idPessoa));
        
    }
    
    
    @Test
    public void test04_CadastrarUsuarioHospede() {
        
        gerarCpf();
        gerarId();
        
        String nome = "Geraldo";
        String email = "geraldo@email.com";
        String senha = "s&nh@D@Gerald0";
        String telefone = "987654321";
        
        if (pessoaManager.cadastrarUsuarioHospede(nome, email, senha, cpf, telefone)!=null) 
            
            System.out.println("++++++++ USUARIO HOSPEDE CADASTRADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO CADASTRAR USUARIO HOSPEDE");
        
    }
    
    @Test
    public void test05_atualizarUsuarioHospede() {

        String nome = "Geraldo";
        String email = "geraldo@email.com";
        String senha = "s&nh@D@Gerald0";
        String telefone = "987654321";       
        
        if (pessoaManager.atualizarUsuarioHospede(idPessoa, nome, email, senha, cpf, telefone))
            
            System.out.println("++++++++ USUARIO HOSPEDE ATUALIZADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO ATUALIZAR USUARIO HOSPEDE");
        
    }
       
    @Test
    public void test06_CadastrarCartao() {
     
        String titular = "Geraldo Pires";            
        String vencimento = "01/2019";
        int codigoSeguranca = 012;
        int idUsuarioHospede = idPessoa;
        
        if (pessoaManager.cadastrarCartao(titular, numeroCartao, vencimento, codigoSeguranca, idUsuarioHospede)!=null) 
            
            System.out.println("++++++++ CARTAO CADASTRADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO CADASTRAR CARTAO");
        
    }
    
    @Test
    public void test07_ConsultarUsuarioHospede() {
        
        System.out.println("++++++++ USUARIO HOSPEDE: " + pessoaManager.consultarUsuarioHospede(idPessoa));

    }
    
    @Test
    public void test08_CadastrarUsuarioProprietario() {
        
        gerarCpf();
        gerarId();
        
        String nome = "Santana";
        String email = "santana@email.com";
        String senha = "s&nh@D@Sant@na";
        String telefone = "987654321";
        
        if (pessoaManager.cadastrarUsuarioProprietario(nome, email, senha, cpf, telefone)!=null) 
            
            System.out.println("++++++++ USUARIO PROPRIETARIO CADASTRADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO CADASTRAR USUARIO PROPRIETARIO");
        
    }
    
    @Test
    public void test09_AtualizarUsuarioProprietario() {
        
        String nome = "Santana";
        String email = "santana@email.com";
        String senha = "s&nh@D@Sant@na";
        String telefone = "987654321";
        
        if (pessoaManager.atualizarUsuarioProprietario(idPessoa, nome, email, senha, cpf, telefone))
            
            System.out.println("++++++++ USUARIO PROPRIETARIO ATUALIZADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO ATUALIZAR USUARIO PROPRIETARIO");
        
    }
    
    @Test
    public void test10_ConsultarUsuarioProprietario() {
        
        System.out.println("++++++++ USUARIO PROPRIETARIO: " + pessoaManager.consultarUsuarioProprietario(idPessoa));

    }
    
    @Test
    public void test11_Excluir() {
        
        if (pessoaManager.excluirPessoa(idPessoa)) 
            
            System.out.println("++++++++ EXLUSAO RELIZADA COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO EXCLUIR");

    }

    
}
