/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.BEAN.Saida;
import Modelo.SQL.SaidaSql;
import java.util.List;
import java.util.Set;
import javax.persistence.PersistenceException;

/**
 *
 * @author Guilherme
 */
public class ControleSaida {
    
    public static void insereSaidaEItens(Saida s) throws PersistenceException {
        SaidaSql.insereSaidaEItens(s);
    }
    
    public static void editaSaida(Saida s) throws RuntimeException {
        SaidaSql.editaSaida(s);
    }
    
    public static void deletaSaida(Saida s) throws RuntimeException {
        SaidaSql.deletaSaida(s);
    }
    
    public static List<Saida> listarTodos() throws RuntimeException {
        return SaidaSql.listarTodos();
    }
    
    public static List<Saida> listarSaidaPorCodigo(int codigo) throws RuntimeException {
        return SaidaSql.listarSaidaPorCodigo(codigo);
    }
}
