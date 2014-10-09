/*package com.bottomdog.teamhub.restful.controller;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.bottomdog.teamhub.domain.Player;
import com.bottomdog.teamhub.persistence.PlayerDao;

@RequestMapping(value="/players")
public class PlayerController {

	final Logger logger = LoggerFactory.getLogger(PlayerController.class);
	
	private PlayerDao playerDao;

	public PlayerController(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Players listData(WebRequest webRequest) {
		return new Players(playerDao.findAllWithDetail());
	}	

	@RequestMapping(value="/{gamerName}", method=RequestMethod.GET)
	@ResponseBody
	public Player findPlayerById(@PathVariable String gamerName) {		
		return playerDao.findByGamerName(gamerName);
	}
	
	@RequestMapping(value="/{gamerName}/players", method=RequestMethod.GET)
	@ResponseBody
	public Players findPlayersByGamerName(@PathVariable String gamerName) {	

		return new Players(playerDao.findPlayersByPlayer(gamerName));
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody
	public Player create(@RequestBody Player player, HttpServletResponse response) {
		System.out.println("test");
		logger.info("Creating player: " + player);
		playerDao.insert(player);
		System.out.println("test2");
		logger.info("Player created successfully with info: " + player);
		response.setHeader("Location",  "/players/" + player.getGamerName());
		return player;
	}
	
	@RequestMapping(value="/{gamerName}", method=RequestMethod.PUT)
	@ResponseBody
	public void update(@RequestBody Player player, @PathVariable String gamerName) {
		logger.info("Updating player: " + player);
		playerDao.update(player);
		logger.info("Player updated successfully with info: " + player);
		//return player;
	}	

	@RequestMapping(value="/{gamerName}", method=RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable String gamerName) {
		logger.info("Deleting player with game name: " + gamerName);
		Player player = playerDao.findByGamerName(gamerName);
		playerDao.delete(player);
		logger.info("Player deleted successfully");
	}	
	
}*/