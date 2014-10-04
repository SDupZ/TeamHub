package com.simondupreez.spring.bottomdog.restful.controller;
/*package com.simondupreez.spring.honapp.restful.controller;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.simondupreez.spring.honapp.domain.Players;
import com.simondupreez.spring.honapp.persistence.PlayerDao;

@RequestMapping(value="/accounts")
public class AccountController {

	final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	private PlayerDao accountDao;

	public AccountController(PlayerDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Accounts listData(WebRequest webRequest) {
		return new Accounts(accountDao.findAllWithDetail());
	}	

	@RequestMapping(value="/{gamerName}", method=RequestMethod.GET)
	@ResponseBody
	public Account findAccountById(@PathVariable String gamerName) {		
		return accountDao.findByGamerName(gamerName);
	}
	
	@RequestMapping(value="/{gamerName}/players", method=RequestMethod.GET)
	@ResponseBody
	public Players findPlayersByGamerName(@PathVariable String gamerName) {	

		return new Players(accountDao.findPlayersByAccount(gamerName));
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody
	public Account create(@RequestBody Account account, HttpServletResponse response) {
		System.out.println("test");
		logger.info("Creating account: " + account);
		accountDao.insert(account);
		System.out.println("test2");
		logger.info("Account created successfully with info: " + account);
		response.setHeader("Location",  "/accounts/" + account.getGamerName());
		return account;
	}
	
	@RequestMapping(value="/{gamerName}", method=RequestMethod.PUT)
	@ResponseBody
	public void update(@RequestBody Account account, @PathVariable String gamerName) {
		logger.info("Updating account: " + account);
		accountDao.update(account);
		logger.info("Account updated successfully with info: " + account);
		//return account;
	}	

	@RequestMapping(value="/{gamerName}", method=RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable String gamerName) {
		logger.info("Deleting account with game name: " + gamerName);
		Account account = accountDao.findByGamerName(gamerName);
		accountDao.delete(account);
		logger.info("Account deleted successfully");
	}	
	
}
*/