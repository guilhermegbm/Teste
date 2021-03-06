/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.SQL;

import Jpa.JpaUtil;
import Modelo.BEAN.Fornecimento;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Guilherme
 */
public class FornecimentoSql {

    public static void insereFornecimentoEItens(Fornecimento f) throws PersistenceException {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();

        try {
            tx.begin();

            manager.persist(f);

            tx.commit();
        } finally {
            manager.close();
        }

    }

    public static void editaFornecimento(Fornecimento f) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();

        try {
            tx.begin();

            manager.merge(f);

            tx.commit();
        } finally {
            manager.close();
        }

    }

    public static void deletaFornecimento(Fornecimento f) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();

        try {
            tx.begin();

            manager.merge(f);

            manager.remove(f);

            tx.commit();
        } finally {
            manager.close();
        }

    }

    public static List<Fornecimento> listarTodos() throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();

        try {
            TypedQuery<Fornecimento> tq = manager.createQuery("from Fornecimento", Fornecimento.class);
            return tq.getResultList();
        } finally {
            manager.close();
        }

    }

    public static List<Fornecimento> listarFornecimentoPorCodigo(int codigo) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();

        try {
            List<Fornecimento> s = new ArrayList<>();
            s.add(manager.find(Fornecimento.class, codigo));
            return s;
        } finally {
            manager.close();
        }
    }

    public static List<Fornecimento> listarTudoTodosOuPorCodigo(int cod) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();

        try {
            if (cod == 0) {
                TypedQuery<Fornecimento> query = manager.createQuery(""
                        + "select distinct f from Fornecimento f left join fetch f.fornecedor", Fornecimento.class);
                
                return query.getResultList();
                
            } else {
                TypedQuery<Fornecimento> tq = manager.createQuery("select distinct f from Fornecimento f left join fetch f.fornecedor where f.codigo = :cod", Fornecimento.class);
                tq.setParameter("cod", cod);
                return tq.getResultList();
            }
        } finally {
            manager.close();
        }
    }

    public static List<Fornecimento> listarPorDataInicioFim(Date dataInicio, Date dataFim) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();
        
        try {
            TypedQuery tq = manager.createQuery("select distinct f from Fornecimento f left join fetch f.fornecedor "
                    + "where f.data >= :dataInicio and f.data <= :dataFim", Fornecimento.class);
            tq.setParameter("dataInicio", dataInicio);
            tq.setParameter("dataFim", dataFim);
            return tq.getResultList();
        } finally {
            manager.close();
        }
    }

    public static List<Fornecimento> listarPorDataInicio(Date dataInicio) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();
        
        try {
            TypedQuery tq = manager.createQuery("select distinct f from Fornecimento f left join fetch f.fornecedor"
                    + " where f.data >= :dataInicio", Fornecimento.class);
            tq.setParameter("dataInicio", dataInicio);
            return tq.getResultList();
        } finally {
            manager.close();
        }
    }

    public static List<Fornecimento> listarPorDataFim(Date dataFim) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();
        
        try {
            TypedQuery tq = manager.createQuery("select distinct f from Fornecimento f left join fetch f.fornecedor "
                    + "where f.data <= :dataFim", Fornecimento.class);
            tq.setParameter("dataFim", dataFim);
            return tq.getResultList();
        } finally {
            manager.close();
        }
    }
}
