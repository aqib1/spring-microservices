package com.example.music.info.service.movieinfoserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.MusicDto;
import com.example.music.info.service.constants.DataBuilder;
import com.example.music.info.service.movieinfoservice.MusicInfoService;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

	@Autowired
	private DataBuilder dataBuilder;
	
	@Override
	public MusicDto getMusicByMusicId(int musicId) {
		return dataBuilder.getMusicDto(musicId);
	}

}
