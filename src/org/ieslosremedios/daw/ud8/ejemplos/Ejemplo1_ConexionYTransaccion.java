package org.ieslosremedios.daw.ud8.ejemplos;
import org.ieslosremedios.daw.aaa_clases_universales.Coche;
import org.ieslosremedios.daw.aaa_clases_universales.EventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.math.BigInteger;
import java.sql.Timestamp;

public class Ejemplo1_ConexionYTransaccion {
    public static void main(String[] args) {
        //Con esto abrimos la conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("C:\\Users\\1DAW_2223_01\\Desktop\\objectdb-2.8.8\\db\\coche.odb");
        EntityManager em = emf.createEntityManager();

        //Iniciar Transacción
        em.getTransaction().begin();

        //Operaciones
        Coche coche1 = new Coche("Ferrari", "Azul", "ABCD123");
        Coche coche2 = new Coche("Bugatti", "Verde", "EFGH456");
        Coche coche3 = new Coche("BMW", "Amarillo", "UVXYH789");
        EventoMusical eventoMusical1 = new EventoMusical("Evento Muy Bueno", Timestamp.valueOf("2023-05-30 00:00:00"), new BigInteger("4000"));
        EventoMusical eventoMusical2 = new EventoMusical("Evento No Tan Bueno", Timestamp.valueOf("2023-05-25 00:00:00"), new BigInteger("3000"));


        em.persist(coche1);
        em.persist(coche2);
        em.persist(coche3);
        em.persist(eventoMusical1);
        em.persist(eventoMusical2);


        //Commit Transacción
        em.getTransaction().commit();

        //La clave principal empieza en 3 por alguna razón
        Coche prueba = em.find(Coche.class, 4);
        System.out.println(prueba.getColor());

//        TypedQuery<Coche> query1 = em.createQuery("SELECT c FROM Coche c WHERE color like ?1", Coche.class);
//        query1.setParameter("color", "Amarillo");
//        Coche prueba2 = query1.getSingleResult();
//        System.out.println(prueba2);


        //Cerrar flujo
        em.close();
        emf.close();

    }
}
