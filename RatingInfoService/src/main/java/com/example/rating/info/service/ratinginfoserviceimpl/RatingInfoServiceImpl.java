package com.example.rating.info.service.ratinginfoserviceimpl;

import org.springframework.stereotype.Service;
import com.example.rating.info.service.entities.RatingInfoDto;
import com.example.rating.info.service.ratinginfoservice.RatingInfoService;

@Service
public class RatingInfoServiceImpl implements RatingInfoService{

	@Override
	public RatingInfoDto getRatingsByMusicId(String musicId) {
		return new RatingInfoDto(1, "akj12", 5);
	}
	

}
