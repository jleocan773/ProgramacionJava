package org.ieslosremedios.daw.ud8.tareas_clase;

import org.ieslosremedios.daw.aaa_clases_universales.EventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Ejercicio5_6_7 {
    public static void main(String[] args) {

//      Con esto abrimos la conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("C:\\Users\\1DAW_2223_01\\Desktop\\objectdb-2.8.8\\db\\evento.odb");
        EntityManager em = emf.createEntityManager();

//      Iniciar Transacción
        em.getTransaction().begin();

//      EventoMusical eventoMusicalParaEjercicio5_numero1 = new EventoMusical("Evento EJ5 1", Timestamp.valueOf("2023-05-30 00:00:00"), new BigInteger("4000"));
//      EventoMusical eventoMusicalParaEjercicio5_numero2 = new EventoMusical("Evento EJ5 2", Timestamp.valueOf("2023-05-30 00:00:00"), new BigInteger("4000"));

//      Se persisten
//      em.persist(eventoMusicalParaEjercicio5_numero1);
//      em.persist(eventoMusicalParaEjercicio5_numero2);


//      Recuperar: Query Estática
        System.out.println("Recuperamos el nombre con Query Estática:");
        EventoMusical recuperarEventoMusical = em.find(EventoMusical.class, 1);
        System.out.println(recuperarEventoMusical);

//      Recuperar: Query Dinámica
        System.out.println("Recuperamos el nombre con Query Dinámica:");
        TypedQuery<EventoMusical> queryRecuperarEventoMusical = em.createQuery("SELECT e FROM EventoMusical e WHERE nombreEvento LIKE ?1", EventoMusical.class);
        queryRecuperarEventoMusical.setParameter(1, "Evento EJ5 2");
        EventoMusical pruebaRecuperar = queryRecuperarEventoMusical.getSingleResult();
        System.out.println(pruebaRecuperar);

//      Cambiar Nombre: Query Estática
        System.out.println("Cambiamos el nombre con Query Estática:");
        EventoMusical cambiarNombreEventoMusical = em.find(EventoMusical.class, 1);
        if (cambiarNombreEventoMusical == null){
            System.out.println("Evento Musical no encontrado");
        } else {
            cambiarNombreEventoMusical.setNombreEvento(cambiarNombreEventoMusical.getNombreEvento().toUpperCase());
            System.out.println(cambiarNombreEventoMusical.getNombreEvento());
        }

//      Cambiar Nombre: Query Dinámica
        System.out.println("Cambiamos el nombre con Query Dinámica");
        TypedQuery<EventoMusical> queryCambiarNombreEventoMusical = em.createQuery("UPDATE EventoMusical SET nombreEvento = 'NOMBRE CAMBIADO EVENTO MUSICAL 2' WHERE id = ?1", EventoMusical.class);
        queryCambiarNombreEventoMusical.setParameter(1, 2);
        System.out.println("Registro Actualizado: " + queryCambiarNombreEventoMusical.executeUpdate());

//      Borrar: Query Estática
        System.out.println("Borramos Query Estática:");
        EventoMusical borrarEventoMusical = em.find(EventoMusical.class,3);
        if (borrarEventoMusical == null){
            System.out.println("Evento Musical no encontrado");
        } else {
            em.remove(borrarEventoMusical);
        }


//      Borrar: Query Dinámica
        System.out.println("Borramos Query Dinámica:");
        TypedQuery<EventoMusical> queryBorrarEventoMusical = em.createQuery("DELETE FROM EventoMusical WHERE id = :id", EventoMusical.class);
        queryBorrarEventoMusical.setParameter("id", 4);
        System.out.println("Registro borrado: " + queryBorrarEventoMusical.executeUpdate());

//       Commit
         em.getTransaction().commit();

    }
}
