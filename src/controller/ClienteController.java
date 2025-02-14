/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ClienteDAO;
import model.ClienteModel;
import java.util.ArrayList;
import javax.swing.table.TableModel;

public class ClienteController {

    public static boolean salvar(String nome,
            String email,
            String cpf,
            String sexo,
            String nascimento,
            String estadoCivil,
            String celular,
            String telefone,
            String endereco) {

        ClienteModel c = new ClienteModel(nome,
                email,
                cpf,
                sexo,
                nascimento,
                estadoCivil,
                celular,
                telefone,
                endereco);

        return ClienteDAO.salvar(c);
    }

    public static boolean excluir(int id) {
        return ClienteDAO.excluir(id);
    }

    public static boolean atualizar(int id,
            String nome,
            String email,
            String cpf,
            String sexo,
            String nascimento,
            String estadoCivil,
            String celular,
            String telefone,
            String endereco) {

        ClienteModel c = new ClienteModel(id,
                nome,
                email,
                cpf,
                sexo,
                nascimento,
                estadoCivil,
                celular,
                telefone,
                endereco);

        return ClienteDAO.atualizar(c);
    }

    public static ClienteModel visualizar(int id) {

        return ClienteDAO.visualizar(id);
    }

    public static ArrayList<String[]> buscaCliente(int id) {
        ArrayList<ClienteModel> produtos = ClienteDAO.buscaCliente(id);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (ClienteModel c : produtos) {
            resultado.add(new String[]{
                String.valueOf(c.getId()),
                c.getNome(),
                c.getEmail(),
                c.getCpf(),
                c.getSexo(),
                c.getNascimento(),
                c.getEstadoCivil(),
                c.getCelular(),
                c.getTelefone(),
                c.getEndereco()});
        }
        return resultado;

    }

    public static ArrayList<String[]> buscaCliente(String nome) {
        ArrayList<ClienteModel> clientes = ClienteDAO.buscaCliente(nome);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (ClienteModel c : clientes) {
            resultado.add(new String[]{
                String.valueOf(c.getId()),
                c.getNome(),
                c.getEmail(),
                c.getCpf(),
                c.getSexo(),
                c.getNascimento(),
                c.getEstadoCivil(),
                c.getCelular(),
                c.getTelefone(),
                c.getEndereco()});

        }
        return resultado;

    }

    public static ArrayList<String[]> buscaCliente(long cpf) {
        ArrayList<ClienteModel> clientes = ClienteDAO.buscaCliente(cpf);
        ArrayList<String[]> resultado = new ArrayList<>();

        for (ClienteModel c : clientes) {
            resultado.add(new String[]{
                String.valueOf(c.getId()),
                c.getNome(),
                c.getEmail(),
                c.getCpf(),
                c.getSexo(),
                c.getNascimento(),
                c.getEstadoCivil(),
                c.getCelular(),
                c.getTelefone(),
                c.getEndereco()});

        }
        return resultado;

    }

    public static ArrayList<ClienteModel> buscaClienteVenda(long cpf) {
        return ClienteDAO.buscaCliente(cpf);
    }

    public static ArrayList<String[]> getClientes() {
        return ClienteDAO.getClientes();

    }

}
