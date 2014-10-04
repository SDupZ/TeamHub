
package com.simondupreez.spring.bottomdog.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER")
@NamedQueries({		
	@NamedQuery(name="Player.findByPlayerCode", 
			    query="select distinct p from Player p where p.playerCode = :playerCodeParam"),	    			
})
public class Player implements Serializable {
	private static final long serialVersionUID = -8475926083985065474L;
	
	@Id 
	@Column(name = "PLAYER_CODE")	
	private String playerCode;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;	
	
	@Column(name = "CLUB")
	private String club;
	
	@Column(name = "RANK")
	private int rank;
	
	public String getPlayerCode() {
		return playerCode;
	}

	public void setPlayerCode(String playerCode) {
		this.playerCode = playerCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String toString() {
		return "[Player] Code: " + this.playerCode + " Name: " + this.firstName + " " + 
				this.lastName + " Club: " + this.club + " Rank: " + this.rank;
	}		
	
}
