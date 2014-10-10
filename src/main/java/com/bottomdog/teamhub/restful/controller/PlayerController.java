package com.bottomdog.teamhub.restful.controller;

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
import com.bottomdog.teamhub.domain.Players;
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
		logger.info("List data request begin: " );
		return new Players(playerDao.findAll());
	}	

	@RequestMapping(value="/{playerCode}", method=RequestMethod.GET)
	@ResponseBody
	public Player findPlayerByCode(@PathVariable String playerCode) {	
		logger.info("Retrieving player by code: " + playerCode );
		return playerDao.findByPlayerCode(playerCode);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody
	public Player create(@RequestBody Player player, HttpServletResponse response) {
		logger.info("Creating player: " + player);
		playerDao.insert(player);
		logger.info("Player created successfully with info: " + player);
		response.setHeader("Location",  "/players/" + player.getPlayerCode());
		return player;
	}
	
	@RequestMapping(value="/{playerCode}", method=RequestMethod.PUT)
	@ResponseBody
	public void update(@RequestBody Player player, @PathVariable String playerCode) {
		logger.info("Updating player: " + player);
		playerDao.update(player);
		logger.info("Player updated successfully with info: " + player);
	}	

	@RequestMapping(value="/{playerCode}", method=RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable String playerCode) {
		logger.info("Deleting player with player code: " + playerCode);
		Player player = playerDao.findByPlayerCode(playerCode);
		playerDao.delete(player);
		logger.info("Player deleted successfully");
	}		
}