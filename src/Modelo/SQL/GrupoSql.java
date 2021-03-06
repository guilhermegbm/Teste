/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.SQL;

import Jpa.JpaUtil;
import Modelo.BEAN.Grupo;
import java.util.ArrayList;
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
public class GrupoSql {

    public static void insereGrupo(Grupo g) throws PersistenceException {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();

        try {
            tx.begin();

            manager.persist(g);

            tx.commit();
        } finally {
            manager.close();
        }

    }

    public static void editaGrupo(Grupo g) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();

        try {
            tx.begin();

            manager.merge(g);

            tx.commit();
        } finally {
            manager.close();
        }

    }

    public static void deletaGrupo(Grupo g) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();

        try {
            tx.begin();

            Grupo grupo = manager.merge(g);

            manager.remove(grupo);

            tx.commit();
        } finally {
            manager.close();
        }

    }

    public static List<Grupo> listarTodos() throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();

        try {
            TypedQuery<Grupo> tq = manager.createQuery("from Grupo", Grupo.class);
            return tq.getResultList();
        } finally {
            manager.close();
        }

    }

    public static List<Grupo> listarTudoTodosOuPorCodigo(int codigo) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();

        try {
            if (codigo == 0) {

                TypedQuery<Grupo> query = manager.createQuery("select g "
                        + "select distinct g from Grupo g left join fetch g.subGrupos", Grupo.class);

                return query.getResultList();
            } else {
                List<Grupo> s = new ArrayList<>();
                Grupo g = manager.find(Grupo.class, codigo);
                
                if (g != null){
                    s.add(g);
                }
                
                return s;
            }
        } finally {
            manager.close();
        }
    }
    
    public static List<Grupo> listarPorNome (String nome) throws RuntimeException {
        EntityManager manager = JpaUtil.getEntityManager();

        try {
            TypedQuery<Grupo> tq = manager.createQuery("select g from Grupo g where g.nome like :nome", Grupo.class);
            tq.setParameter("nome", "%" + nome + "%");
            return tq.getResultList();
        } finally {
            manager.close();
        }
    }
}
