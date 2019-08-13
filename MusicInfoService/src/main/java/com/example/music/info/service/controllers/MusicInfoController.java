package com.example.music.info.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.music.info.service.business.MusicInfoBusiness;
import com.example.music.info.service.constants.URL;
import com.example.music.info.service.entities.MusicInfoDto;

@RestController
@RequestMapping(value = URL.MUSIC_INFO_URL)
public class MusicInfoController {

	@Autowired
	private MusicInfoBusiness musicInfoBusiness;
	
	@RequestMapping(value = URL.MUSIC_INFO_GET_BY_MUSIC_ID, method = RequestMethod.GET)
	public MusicInfoDto getMusicInfoByMusicId(@PathVariable(name = "musicId") String musicId) {
		return musicInfoBusiness.getMusicByMusicId(musicId);
	}
}
