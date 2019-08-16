package com.example.music.info.service.movieinfoservice;

import com.example.music.info.service.entities.MusicInfoDto;

public interface MovieInfoService {
	
	MusicInfoDto getMusicByMusicId (int movieId);
}
