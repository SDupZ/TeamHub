
package com.bottomdog.teamhub.domain;

import java.io.Serializable;
import java.util.List;


public class Players implements Serializable {
	private static final long serialVersionUID = -6937531833796469888L;
	
	private List<Player> players;

	public Players() {
	}
	
	public Players(List<Player> players) {
		this.players = players;
	}
	
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	 
}
