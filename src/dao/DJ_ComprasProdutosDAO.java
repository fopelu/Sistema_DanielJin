/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Dj_compras_produtos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author danie
 */
public class DJ_ComprasProdutosDAO extends DJ_AbstractDAO{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Dj_compras_produtos.class);
        criteria.add(Restrictions.eq("dj_id_compras_produtos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Dj_compras_produtos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
        public static void main(String[] args) {
        DJ_ComprasProdutosDAO dJ_ComprasProdutosDAO = new DJ_ComprasProdutosDAO();
        dJ_ComprasProdutosDAO.listAll();
        System.out.println("Deu certo DAO do Crompra de Produtos");
    }
}
