package com.bottomdog.teamhub;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.bottomdog.teamhub.domain.Player;
import com.bottomdog.teamhub.persistence.PlayerDao;

public class Main {
	public static void main(String[] args){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context.xml");
		ctx.refresh();
		
		PlayerDao playerDao = ctx.getBean("playerDao", PlayerDao.class);		
		
		System.out.println("ALL ACCOUNTS: ");
		// Find and list all accounts
		List<Player> players = playerDao.findAll();
		for (Player player: players) {
			System.out.println(player);
		}
		
		/*System.out.println("\n");
		System.out.println("ALL ACCOUNTS: ");
		// Find and list all accounts
		List<Account> accounts = accountDao.findAll();
		for (Account account: accounts) {
			System.out.println(account);
		}
		
		System.out.println("\n");
		System.out.println("ALL ACCOUNTS IN CLAN TEST: ");
		// Find and list all accounts in the clan "Test"
		accounts = accountDao.findByClanTag("test");
		for (Account account: accounts) {
			System.out.println(account);
		}
		
		System.out.println("\n");
		System.out.println("FIND BY GAMER NAME (iK2Crash): ");
		//Print out account with gamer name iK2Crash
		System.out.println(accountDao.findByGamerName("iK2Crash"));	
		
		System.out.println("\n");
		System.out.println("ALL GAMES BY ACCOUNT NAME (iK2Crash): ");
		// Find and list all accounts in the clan "Test"
		List<Player> players = accountDao.findPlayersByAccount("iK2Crash");
		for (Player player: players) {
			System.out.println(player);
		}
		
		// List accounts with details
		accounts = accountDao.findAllWithDetail();
		listAccountsWithDetail(accounts);
		
		System.out.println("\n");
		System.out.println("ALL GAMES WITH iK2CRASH: ");
		players = accountDao.findPlayersByAccount("iK2Crash");
		for (Player player: players) {
			System.out.println(player);
		}		
		
		System.out.println("\n");
		System.out.println("TESTING UPDATE: ");		
		Account account = new Account();
		account.setGamerName("lensflare");
		account.setClan("TTYL", "Talk to you later bro");
		accountDao.update(account);
		System.out.println("Account update successfully: " + account);
		System.out.println("");	
		
		System.out.println("\n");
		System.out.println("TESTING INSERT: ");		
		account = new Account();
		account.setGamerName("newguy");
		account.setClan("TTYL", "Talk to you later bro");
		accountDao.insert(account);
		System.out.println("Account inserted successfully: " + account);
		System.out.println("");	*/
		
		
		ctx.close();
	}
	
/*	private static void listAccountsWithDetail(List<Account> accounts) {
		System.out.println("");
		System.out.println("Listing accounts with details:");
		for (Account account: accounts) {
			System.out.println(account);
			if (account.getPlayers() != null) {
				for (Player player: account.getPlayers()) {
					System.out.println(player);
				}
			}			
			System.out.println();
		}
	}	*/
}
