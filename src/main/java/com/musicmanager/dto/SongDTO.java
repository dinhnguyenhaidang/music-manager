package com.musicmanager.dto;

import java.util.List;

/**
 * Creates song data transfer objects that carry data between processes
 * 
 * @author Void Wind
 * @version 1.2
 * @since 2021-07-12
 */
public class SongDTO extends AbstractDTO<SongDTO> {
	
	private String title;
	private Long albumId;
	private String category;
	private List<Long> singerIds;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Long getAlbumId() {
		return albumId;
	}
	
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public List<Long> getSingerIds() {
		return singerIds;
	}

	public void setSingerIds(List<Long> singerIds) {
		this.singerIds = singerIds;
	}

}
