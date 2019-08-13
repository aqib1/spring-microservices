package com.example.rating.info.service.entities;

public class RatingInfoDto {

	private int id;
	private String musicId;
	private int rating;

	
	public RatingInfoDto() {
		super();
	}

	public RatingInfoDto(int id, String musicId, int rating) {
		super();
		this.id = id;
		this.musicId = musicId;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getMusicId() {
		return musicId;
	}

	public void setMusicId(String musicId) {
		this.musicId = musicId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
