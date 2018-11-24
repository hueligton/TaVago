/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipecaggi
 */
public class PessoaManagerTest {
    
    public PessoaManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        PessoaManager pessoaManager = new PessoaManager();
    }
    
    @After
    public void tearDown() {
    }
    
    PessoaManager pessoaManager = new PessoaManager();
        
    @Test
    public void cadastrarHospede() {
        
        String nome = "Tamires";
        String email = "tamires@email.com";
        String senha = "s&nh@D@Tam1res";
        long cpf = 123456789;
        String telefone = "987654321";
        String rua = "Street Tamires";
        int numeroCasa = 12;
        String cidade = "Tamires City";
        String estado = "Tamires State";
        String pais = "United States of Tamires";

        PessoaManager pessoaManager = new PessoaManager();
        
        if (pessoaManager.cadastrarHospede(nome, cpf, telefone, rua, numeroCasa, cidade, estado, pais)) 
            
            System.out.println("++++++++ HOSPEDE CADASTRADO COM SUCESSO");
        
        else  
            System.out.println("++++++++ FALHA AO CADASTRAR HOSPEDE");
        
        atualizarHospede();
    }
    
    @Test
    public void cadastrarUsuarioHospede() {
        
        String nome = "Geraldo";
        String email = "geraldo@email.com";
        String senha = "s&nh@D@Gerald0";
        long cpf = 987254631;
        String telefone = "987654321";
        
        if (pessoaManager.cadastrarUsuarioHospede(nome, email, senha, cpf, telefone)) 
            
            System.out.println("++++++++ USUARIO HOSPEDE CADASTRADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO CADASTRAR USUARIO HOSPEDE");
        
        cadastrarCartao();
        atualizarUsuarioHospede();
    }
    
    @Test
    public void cadastrarUsuarioProprietario() {
        
        String nome = "Santana";
        String email = "santana@email.com";
        String senha = "s&nh@D@Sant@na";
        long cpf = 972635173;
        String telefone = "987654321";
        
        if (pessoaManager.cadastrarUsuarioProprietario(nome, email, senha, cpf, telefone)) 
            
            System.out.println("++++++++ USUARIO PROPRIETARIO CADASTRADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO CADASTRAR USUARIO PROPRIETARIO");
        
        atualizarUsuarioProprietario();
    }
    
    public void cadastrarCartao() {
        
        String titular = "Tamires da Silva";        
        String numeroCartao = "198273645";        
        String vencimento = "01/2019";        
        int codigoSeguranca = 012;
        int idUsuarioHospede = 1;
        
        if (pessoaManager.cadastrarCartao(titular, numeroCartao, vencimento, codigoSeguranca, idUsuarioHospede)) 
            
            System.out.println("++++++++ CARTAO CADASTRADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO CADASTRAR CARTAO");
        
    }
    
    public void atualizarHospede() {
        
        int id = 2;
        String nome = "Tamires";
        long cpf = 12345679;
        String telefone = "987654321";
        String rua = "Street Tamires";
        int numeroCasa = 12;
        String cidade = "Tamires City";
        String estado = "Tamires State";
        String pais = "United States of Tamires";
        
        if (pessoaManager.atualizarHospede(id, nome, cpf, telefone, rua, numeroCasa, cidade, estado, pais))
            
            System.out.println("++++++++ HOSPEDE ATUALIZADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO ATUALIZAR HOSPEDE");
        
    }
    
    public void atualizarUsuarioHospede() {

        int id = 1;
        String nome = "Geraldo";
        String email = "geraldo@email.com";
        String senha = "s&nh@D@Gerald0";
        long cpf = 98725431;
        String telefone = "987654321";       
        
        if (pessoaManager.atualizarUsuarioHospede(id, nome, email, senha, cpf, telefone))
            
            System.out.println("++++++++ USUARIO HOSPEDE ATUALIZADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO ATUALIZAR USUARIO HOSPEDE");
        
    }
    
    public void atualizarUsuarioProprietario() {
        
        int id = 3;
        String nome = "Santana";
        String email = "santana@email.com";
        String senha = "s&nh@D@Sant@na";
        long cpf = 97263513;
        String telefone = "987654321";
        
        if (pessoaManager.atualizarUsuarioProprietario(id, nome, email, senha, cpf, telefone))
            
            System.out.println("++++++++ USUARIO PROPRIETARIO ATUALIZADO COM SUCESSO");
        
        else
            
            System.out.println("++++++++ FALHA AO ATUALIZAR USUARIO PROPRIETARIO");
        
    }
    
    public void consultarHospede() {
        
        int id = 2;

        System.out.println("++++++++ HOSPEDE: " + pessoaManager.consultarHospede(id));
        
    }
    
    public void consultarUsuarioHospede() {
        
        int id = 1;
        
        System.out.println("++++++++ USUARIO HOSPEDE: " + pessoaManager.consultarUsuarioHospede(id));

    }
    
    public void consultarUsuarioProprietario() {
        
        int id = 3;
        
        System.out.println("++++++++ USUARIO PROPRIETARIO: " + pessoaManager.consultarUsuarioProprietario(id));

    }
    
//    @Test
//    public void excluir() {
//        
//        if (pessoaManager.excluir(id)) 
//            
//            System.out.println("++++++++ EXLUSAO RELIZADA COM SUCESSO");
//        
//        else
//            
//            System.out.println("++++++++ FALHA AO EXCLUIR");
//
//    }
    
}
