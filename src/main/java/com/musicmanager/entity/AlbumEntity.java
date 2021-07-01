package com.musicmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This class defines album entity and map it to table in database
 * 
 * @author Void Wind
 * @version 1.0
 * @since 2021-07-01
 */
@Entity
@Table(name = "album")
public class AlbumEntity extends BaseEntity {

	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}