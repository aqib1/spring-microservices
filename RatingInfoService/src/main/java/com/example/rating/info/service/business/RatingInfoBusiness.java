package com.example.rating.info.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rating.info.service.entities.RatingInfoDto;
import com.example.rating.info.service.ratinginfoserviceimpl.RatingInfoServiceImpl;

@Component
public class RatingInfoBusiness {

	@Autowired
	private RatingInfoServiceImpl ratingInfoServiceImpl;
	
	public RatingInfoDto getRatingInfoByMusicId(int musicId) {
		return ratingInfoServiceImpl.getRatingsByMusicId(musicId);
	}
}
