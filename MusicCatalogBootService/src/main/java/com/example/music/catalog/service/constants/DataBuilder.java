package com.example.music.catalog.service.constants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.client.MusicCatalogDto;

@Component
public class DataBuilder {

	List<MusicCatalogDto> catalogData;

	@PostConstruct
	public void init() {
		catalogData = new ArrayList<>();
		MusicCatalogDto dto = new MusicCatalogDto();
		dto.setId(1);
		dto.setName("cat-1");
		dto.setMusicId(1);
		dto.setRatingId(1);
		dto.setDesc("cat-music-1");

		catalogData.add(dto);

		dto = new MusicCatalogDto();
		dto.setId(2);
		dto.setName("cat-2");
		dto.setMusicId(1);
		dto.setRatingId(2);
		dto.setDesc("cat-music-2");

		catalogData.add(dto);

		dto = new MusicCatalogDto();
		dto.setId(3);
		dto.setName("cat-3");
		dto.setMusicId(3);
		dto.setRatingId(1);
		dto.setDesc("cat-music-3");

		catalogData.add(dto);

	}

	public List<MusicCatalogDto> getAllCatalogByMusicId(int musicId) {
		return this.catalogData.stream()
				.filter(x -> x.getMusicId() == musicId)
				.collect(Collectors.toList());
	}
}
