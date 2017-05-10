package main.java.principal;

import java.sql.Date;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.dao.PageVO;

public class Program {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
		Scanner input = new Scanner(System.in);

		input.nextLine();
		System.out.println("--------------------------------------");
		doSomeInsert(emf);
		
	    emf.close();
		System.out.println("done...");

	}

	private static void doSomeInsert(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Random rd = new Random();
		
		for (int i = 1; i < 20; i++) {
			int f = rd.nextInt(10);
			System.out.println("f => " + f);			
			int status = 200;
			String header = "header";
			String content = "content";
			em.persist(new PageVO(i*10, status, header, content));
		}
		tx.commit();
		em.close();
		
	}

}
