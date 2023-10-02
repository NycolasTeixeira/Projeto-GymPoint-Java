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
        } finally {
            this.entityManager.close();
        }
    }

    @Override
    public User buscarPorEmail(String emai) {
        try {
            TypedQuery<User> query = this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", User.class);
            query.setParameter("email", emai);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }finally {
            this.entityManager.close();
        }
    }

}
