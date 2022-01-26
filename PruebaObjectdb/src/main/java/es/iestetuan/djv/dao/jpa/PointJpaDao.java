package es.iestetuan.djv.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import es.iestetuan.dvj.utilidad.GestorConfiguracion;
import es.iestetuan.dvj.vo.Point;
import ies.iestetuan.dvj.dao.IPoint;

public class PointJpaDao implements IPoint {

	
	public void Crear(Point point) {
		

		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(GestorConfiguracion.getInfoConfiguracion("RUTA_BBDD"));
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
		
        em.persist(point);
        
        em.getTransaction().commit();
        em.close();
        
	}

	public void CrearPuntos() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory(GestorConfiguracion.getInfoConfiguracion("RUTA_BBDD"));
            EntityManager em = emf.createEntityManager();

            // Store 1000 Point objects in the database:
            em.getTransaction().begin();
            for (int i = 0; i < 1000; i++) {
                Point p = new Point(i, i);
                em.persist(p);
            }
            em.getTransaction().commit();
            em.close();
	}

	public long getNumeroPuntos() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory(GestorConfiguracion.getInfoConfiguracion("RUTA_BBDD"));
            EntityManager em = emf.createEntityManager();
            
            Query q1 = em.createQuery("SELECT COUNT(p) FROM Point p");
            long resultado = (Long) q1.getSingleResult();
            
		return resultado;
	}

	public float getMediaPuntos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Point> getListaPuntos() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
