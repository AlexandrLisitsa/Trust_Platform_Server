package launcher;

import model.User;
import services.Server;
import services.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Launcher {

    private  ArrayList<Service> services = new ArrayList<Service>();


    public static void main(String[] args) {
       // new Launcher().launchServices();
        new Launcher().testBase();
    }

    private void testBase() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Trust");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        User user = new User();
        user.setAge(22);
        user.setName("WyPik");
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    private void launchServices() {
        services.add(new Server());
        for (Service service : services) {
            service.launch();
        }
    }

}
