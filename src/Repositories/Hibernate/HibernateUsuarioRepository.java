package Repositories.Hibernate;

import Entities.User;
import Utils.JpaManager;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import Repositories.UserRepository;

public class HibernateUsuarioRepository implements UserRepository {

    private final EntityManager entityManager;

    public HibernateUsuarioRepository() {
        this.entityManager = JpaManager.getEntityManager();
    }

    @Override
    public User create(User usuario) {
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(usuario);
            this.entityManager.getTransaction().commit();
            return usuario;
        } catch(Exception e){
            return null;
        }
    }

    @Override
    public User buscarPorEmail(String email) {
        try {
            TypedQuery<User> query = this.entityManager.createQuery("SELECT u FROM User AS u WHERE u.email = :email", User.class);
            query.setParameter("email", email);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
