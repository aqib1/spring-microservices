package com.example.music.info.service.movieinfoserviceimpl;

import org.springframework.stereotype.Service;

import com.example.client.MusicDto;
import com.example.music.info.service.movieinfoservice.MusicInfoService;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

	
	@Override
	public MusicDto getMusicByMusicId(int movieId) {
		return new MusicDto();
	}

}
