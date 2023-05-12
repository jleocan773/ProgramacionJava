package org.ieslosremedios.daw.ud8.ejercicios;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.ieslosremedios.daw.aaa_clases_universales.EventoMusical;
import org.ieslosremedios.daw.aaa_clases_universales.Ordenador;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

public class Ejercicio8_1 {
    public static void main(String[] args) {

//        Ordenador ordenadorDeClase1 = new Ordenador("192.169.51.101", "ABC001", new BigInteger("1073741824"), new BigInteger("1099511627776"), "AMD", Timestamp.valueOf("2023-05-05 00:00:00"), false);
//        Ordenador ordenadorDeClase2 = new Ordenador("192.169.51.102", "ABC002", new BigInteger("1073741824"), new BigInteger("1099511627776"), "AMD", Timestamp.valueOf("2023-05-05 00:00:00"), false);
//        Ordenador ordenadorDeClase3 = new Ordenador("192.169.51.103", "ABC003", new BigInteger("1073741824"), new BigInteger("1099511627776"), "AMD", Timestamp.valueOf("2023-05-05 00:00:00"), true);
//        Ordenador ordenadorDeClase4 = new Ordenador("192.169.51.104", "ABC004", new BigInteger("1073741824"), new BigInteger("1099511627776"), "AMD", Timestamp.valueOf("2023-05-05 00:00:00"), true);
//        Ordenador ordenadorDeClase5 = new Ordenador("192.169.51.105", "ABC005", new BigInteger("1073741824"), new BigInteger("1099511627776"), "AMD", Timestamp.valueOf("2023-05-05 00:00:00"), false);

//      Con esto abrimos la conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("C:\\Users\\1DAW_2223_01\\Objectdb-2.8.8\\db\\estudiantes.odb");
        EntityManager em = emf.createEntityManager();

//      Iniciar Transacción
        em.getTransaction().begin();

//      Creamos los alumnos y ordenadores asignados

//        Estudiante estudiante1 = new Estudiante("Primer Estudiante", 0, "1ºDAW", ordenadorDeClase1);
//        Estudiante estudiante2 = new Estudiante("Segundo Estudiante", 5, "1ºDAW", ordenadorDeClase2);
//        Estudiante estudiante3 = new Estudiante("Tercer Estudiante", 10, "2ºDAW", ordenadorDeClase3);
//        Estudiante estudiante4 = new Estudiante("Cuarto Estudiante", 15, "2ºDAW", ordenadorDeClase4);
//        Estudiante estudiante5 = new Estudiante("Quinto Estudiante", 20, "1ºDAW", ordenadorDeClase5);
//        Estudiante estudiante6 = new Estudiante("Sexto Estudiante", 3, "1ºDAW");
//
////      Se persisten los objetos
//        em.persist(estudiante1);
//        em.persist(estudiante2);
//        em.persist(estudiante3);
//        em.persist(estudiante4);
//        em.persist(estudiante5);
//        em.persist(estudiante6);


//      Selecciona todos los alumnos que no tengan ordenador (porque utilizan el suyo propio)
        System.out.println("Selecciona todos los alumnos que no tengan ordenador (porque utilizan el suyo propio)");
        TypedQuery<Estudiante> queryAlumnosSinOrdenador = em.createQuery("SELECT e FROM Estudiante e WHERE ordenadorAsignado IS NULL", Estudiante.class);
        List<Estudiante> alumnosSinOrdenador = queryAlumnosSinOrdenador.getResultList();
        System.out.println(alumnosSinOrdenador);


//      Selecciona aquellos alumnos que no tienen Windows activado.
        System.out.println("Selecciona aquellos alumnos que no tienen Windows activado");
        TypedQuery<Estudiante> queryAlumnosSinWindowsActivado = em.createQuery("SELECT e FROM Estudiante e WHERE ordenadorAsignado.activado = false", Estudiante.class);
        List<Estudiante> alumnosSinWindowsActivado = queryAlumnosSinWindowsActivado.getResultList();
        System.out.println(alumnosSinWindowsActivado);

//      Actualiza todos los ordenadores con menos de 8Gb de RAM a 16Gb.
        System.out.println("Actualiza todos los ordenadores con menos de 8Gb de RAM a 16Gb.");
        Query queryActualizar8GBen16GB = em.createQuery("UPDATE memoria FROM ordenadorAsignado.memoria SET 17179869184 WHERE memoria = 8589934592");


//      Commit
        em.getTransaction().commit();






    }
}
