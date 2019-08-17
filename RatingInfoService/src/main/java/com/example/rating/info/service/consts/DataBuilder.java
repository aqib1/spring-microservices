package com.example.rating.info.service.consts;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.client.RatingInfoDto;

@Component
public class DataBuilder {

	private List<RatingInfoDto> ratingDataList;

	@PostConstruct
	public void init() {
		ratingDataList = new ArrayList<>();

		RatingInfoDto ratingInfoDto = new RatingInfoDto();
		ratingInfoDto.setId(1);
		ratingInfoDto.setMusicId(1);
		ratingInfoDto.setRating(3);

		ratingDataList.add(ratingInfoDto);

		ratingInfoDto = new RatingInfoDto();
		ratingInfoDto.setId(2);
		ratingInfoDto.setMusicId(2);
		ratingInfoDto.setRating(5);

		ratingDataList.add(ratingInfoDto);

		ratingInfoDto = new RatingInfoDto();
		ratingInfoDto.setId(3);
		ratingInfoDto.setMusicId(3);
		ratingInfoDto.setRating(2);

		ratingDataList.add(ratingInfoDto);

	}

	public RatingInfoDto getRatingByMusicId(int musicId) {
		return ratingDataList.stream().filter(x -> x.getMusicId() == musicId).findFirst().orElse(null);
	}
}
