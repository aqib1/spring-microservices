package com.example.music.info.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.music.info.service.entities.MusicInfoDto;
import com.example.music.info.service.movieinfoserviceimpl.MusicInfoServiceImpl;

@Component
public class MusicInfoBusiness {

	@Autowired
	private MusicInfoServiceImpl musicInfoServiceImpl;
	
	public MusicInfoDto getMusicByMusicId(int musicId) {
		return musicInfoServiceImpl.getMusicByMusicId(musicId);
	}
}
