/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.BEAN.Cliente;
import Modelo.SQL.ClienteSql;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import javax.persistence.PersistenceException;

/**
 *
 * @author Guilherme
 */
public class ControleCliente {

    public static void insereCliente(Cliente c) throws PersistenceException {
        ClienteSql.insereCliente(c);
    }

    public static void editaCliente(Cliente c) throws RuntimeException {
        ClienteSql.editaCliente(c);
    }

    public static void deletaCliente(Cliente c) throws RuntimeException {
        ClienteSql.deletaCliente(c);
    }

    public static List<Cliente> listarTodos() throws RuntimeException {
        return ClienteSql.listarTodos();
    }

    public static List<Cliente> listarTodosAtivos() throws RuntimeException {
        return ClienteSql.listarTodosAtivos();
    }

    public static List<Cliente> listarTodosDesligados() throws RuntimeException {
        return ClienteSql.listarTodosDesligados();
    }

    public static List<Cliente> listarTudoTodosOuPorCodigo(int codigo) throws RuntimeException {
        return ClienteSql.listarTudoTodosOuPorCodigo(codigo);
    }

    public static List<Cliente> listarPorNome(String nome) throws RuntimeException {
        return ClienteSql.listarPorNome(nome);
    }

    public static void desativaCliente(Cliente c) throws RuntimeException {
        ClienteSql.desativaCliente(c);
    }

    public static void reativaCliente(Cliente c) throws RuntimeException {
        ClienteSql.reativaCliente(c);
    }

    public static List<Cliente> listarPorCodigoEAtivo(int cod) throws RuntimeException {
        return ClienteSql.listarPorCodigoEAtivo(cod);
    }

    public static List<Cliente> listarPorNomeEAtivo(String nome) throws RuntimeException {
        return ClienteSql.listarPorNomeEAtivo(nome);
    }

    public static List<Cliente> listarTodosAtivosJDBC() {
        return ClienteSql.listarTodosAtivosJDBC();
    }

    public static List<Cliente> listarTodosDesligadosJDBC() {
        return ClienteSql.listarTodosDesligadosJDBC();
    }

    public static List<Cliente> listarTudoTodosOuPorCodigoJDBC(int codigo) {
        return ClienteSql.listarTudoTodosOuPorCodigoJDBC(codigo);
    }

    public static List<Cliente> listarPorNomeJDBC(String nome) throws RuntimeException, SQLException{
        return ClienteSql.listarPorNomeJDBC(nome);
    }
}
