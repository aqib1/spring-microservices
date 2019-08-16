package com.example.music.info.service.constants;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.client.MusicDto;

@Component
public class DataBuilder {

	private List<MusicDto> musicDataList;

	@PostConstruct
	public void init() {
		musicDataList = new ArrayList<>();

		MusicDto dto = new MusicDto();
		dto.setId(1);
		dto.setMusicCatogery("C");
		dto.setMusicId(1);
		dto.setReleaseDate("12-1-2019");
		dto.setMusicName("track-1");

		musicDataList.add(dto);

		dto = new MusicDto();
		dto.setId(2);
		dto.setMusicCatogery("B");
		dto.setMusicId(2);
		dto.setReleaseDate("11-1-2019");
		dto.setMusicName("track-2");

		musicDataList.add(dto);

		dto = new MusicDto();
		dto.setId(3);
		dto.setMusicCatogery("D");
		dto.setMusicId(3);
		dto.setReleaseDate("09-1-2019");
		dto.setMusicName("track-3");

		musicDataList.add(dto);
	}

	public MusicDto getMusicDto(int musicId) {
		return musicDataList.stream().filter(x -> x.getMusicId() == musicId).findFirst().orElse(null);
	}
}
