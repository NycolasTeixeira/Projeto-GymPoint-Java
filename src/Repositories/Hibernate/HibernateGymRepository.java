/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories.Hibernate;

import Entities.Gym;
import Entities.User;
import Repositories.GymRepository;
import Utils.JpaManager;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author nycolas_teixeira
 */
public class HibernateGymRepository implements GymRepository{
  private final EntityManager entityManager;

    public HibernateGymRepository() {
        this.entityManager = JpaManager.getEntityManager();
    }
    @Override
    public Gym create(Gym gym) {
           try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(gym);
            this.entityManager.getTransaction().commit();
            return gym;
        } catch(Exception e){
            return null;
        }
    }

    @Override
    public Gym SearchGymName(String nome) {
           try {
            TypedQuery<Gym> query = this.entityManager.createQuery("SELECT a FROM academia AS a WHERE a.nome = :nome", Gym.class);
            query.setParameter("nome", nome);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
