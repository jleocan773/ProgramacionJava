package org.ieslosremedios.daw.ud8.ejemplos;
import org.ieslosremedios.daw.aaa_clases_universales.Coche;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        //Con esto abrimos la conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
        EntityManager em = emf.createEntityManager();

        //Iniciar Transacción
        em.getTransaction().begin();

        //Operaciones
        Coche coche1 = new Coche("Ferrari", "Azul", "ABCD123");
        Coche coche2 = new Coche("Bugatti", "Verde", "EFGH456");

        //Commit Transacción
        em.getTransaction().commit();


        //Cerrar flujo
        em.close();
        emf.close();

    }
}
