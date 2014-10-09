
package com.bottomdog.teamhub.restful;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.bottomdog.teamhub.domain.Player;
import com.bottomdog.teamhub.domain.Players;

public class RestfulClient {

	private static final String URL_GET_ALL_ACCOUNTS = "http://localhost:8080/Account/accounts";
	private static final String URL_GET_ACCOUNT_BY_GAMERNAME = "http://localhost:8080/Account/accounts/{gamerName}";
	private static final String URL_CREATE_ACCOUNT = "http://localhost:8080/Account/accounts/";
	private static final String URL_UPDATE_ACCOUNT = "http://localhost:8080/Account/accounts/{gamerName}";
	private static final String URL_DELETE_ACCOUNT = "http://localhost:8080/Account/accounts/{gamerName}";	
	private static final String URL_GET_PLAYERS_BY_GAMERNAME = "http://localhost:8080/Account/accounts/{gamerName}/players";
	

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:restful-client-app-context.xml");
		ctx.refresh();
		
		/*Accounts accounts;
		Account account;
		Players players;
		
		RestTemplate restTemplate = ctx.getBean("restTemplate", RestTemplate.class);
		
		// Test retrieve all accounts
		System.out.println("Testing retrieve all accounts:");		
		accounts = restTemplate.getForObject(URL_GET_ALL_ACCOUNTS, Accounts.class);	
		listAccounts(accounts); 
		System.out.println("");	
		
		// Test retrieve all players by account
		System.out.println("Testing retrieve all games by account (iK2Crash):");		
		players = restTemplate.getForObject(URL_GET_PLAYERS_BY_GAMERNAME, Players.class, "iK2Crash");
		listPlayers(players); 
				
		// Test update account
		account = restTemplate.getForObject(URL_UPDATE_ACCOUNT, Account.class, "lensflare");
		account.setClan("TTYL", "Talk to you later bro");
		System.out.println("Testing update account by gamerName :");
		restTemplate.put(URL_UPDATE_ACCOUNT, account, 1);
		System.out.println("Account update successfully: " + account);
		System.out.println("");	
		
		// Testing create account
        System.out.println("Testing create account :");
		Account accountNew = new Account();
		accountNew.setGamerName("BroomBringer");
		accountNew.setTotalDeaths(0);
		accountNew.setTotalKills(0);
		accountNew.setClan("MgBm", "Magic Broom Bringers");
		accountNew = restTemplate.postForObject(URL_CREATE_ACCOUNT, accountNew, Account.class);
		System.out.println("Account created successfully: " + accountNew); 
		System.out.println("");	
		
		// Test retrieve account by gamerName
		System.out.println("Testing retrieve a account by gamerName :");
		account = restTemplate.getForObject(URL_GET_ACCOUNT_BY_GAMERNAME, Account.class, "BroomBringer");
		System.out.println(account);
		System.out.println("");
				
		// Testing delete account
		restTemplate.delete(URL_DELETE_ACCOUNT, "BroomBringer");
		System.out.println("Testing delete account by gamerName :");
        accounts = restTemplate.getForObject(URL_GET_ALL_ACCOUNTS, Accounts.class);
        listAccounts(accounts);
        System.out.println("");	

		// Test retrieve all accounts
		System.out.println("Testing retrieve all accounts:");
		accounts = restTemplate.getForObject(URL_GET_ALL_ACCOUNTS, Accounts.class);
		listAccounts(accounts); 
		System.out.println("");	*/
		
		ctx.close();
	}
/*	private static void listAccounts(Accounts accounts) {
		for (Account account: accounts.getAccounts()) {
			System.out.println(account);
		}	
		System.out.println("");
	}
	
	private static void listPlayers(Players players) {
		for (Player player : players.getPlayers()) {
			System.out.println(player);
		}	
		System.out.println("");
	}*/

}
