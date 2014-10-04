
package com.simondupreez.spring.bottomdog.domain;

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
	
	public List<Player> getAccounts() {
		return players;
	}

	public void setAccounts(List<Player> players) {
		this.players = players;
	}
	 
}
