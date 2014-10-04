package com.simondupreez.spring.bottomdog.persistence;

import java.util.List;

import org.hibernate.SessionFactory;

import com.simondupreez.spring.bottomdog.domain.Player;

public interface PlayerDao {

	public SessionFactory getSessionFactory();
	
	public List<Player> findAll();
	
	public Player findByPlayerCode(String playerCode);	
	
	public Player insert(Player contact);
	
	public Player update(Player contact);
	
	public void delete(Player contact);
	
}
