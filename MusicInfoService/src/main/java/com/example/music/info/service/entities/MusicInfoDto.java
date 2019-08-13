package com.example.music.info.service.entities;

public class MusicInfoDto {

	private int id;
	private String musicName;
	private String musicId;
	private String musicCatogery;
	private String releaseDate;

	public MusicInfoDto() {
		super();
	}

	public MusicInfoDto(int id, String musicName, String musicId, String musicCatogery, String releaseDate) {
		super();
		this.id = id;
		this.musicName = musicName;
		this.musicId = musicId;
		this.musicCatogery = musicCatogery;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicId() {
		return musicId;
	}

	public void setMusicId(String musicId) {
		this.musicId = musicId;
	}

	public String getMusicCatogery() {
		return musicCatogery;
	}

	public void setMusicCatogery(String musicCatogery) {
		this.musicCatogery = musicCatogery;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "MusicInfoDto [id=" + id + ", musicName=" + musicName + ", musicId=" + musicId + ", musicCatogery="
				+ musicCatogery + ", releaseDate=" + releaseDate + "]";
	}
}
