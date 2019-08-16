package com.example.music.info.service.constants;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.client.MusicDto;

@Component
public class DataBuilder {

	private List<MusicDto> musicDataList;
	
	@PostConstruct
	public void init() {
		
	}
}
