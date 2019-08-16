package com.example.music.info.service.movieinfoserviceimpl;

import org.springframework.stereotype.Service;
import com.example.music.info.service.entities.MusicInfoDto;
import com.example.music.info.service.movieinfoservice.MovieInfoService;

@Service
public class MusicInfoServiceImpl implements MovieInfoService {

	
	@Override
	public MusicInfoDto getMusicByMusicId(int movieId) {
		return new MusicInfoDto(1, "test", "1kjh2", "C", "2gwiuytw");
	}

}
