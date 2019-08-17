package com.example.rating.info.service.ratinginfoserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.RatingInfoDto;
import com.example.rating.info.service.consts.DataBuilder;
import com.example.rating.info.service.ratinginfoservice.RatingInfoService;

@Service
public class RatingInfoServiceImpl implements RatingInfoService{

	@Autowired
	private DataBuilder dataBuilder;
	
	@Override
	public RatingInfoDto getRatingsByMusicId(int musicId) {
		return dataBuilder.getRatingByMusicId(musicId);
	}
	

}
