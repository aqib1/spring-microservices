package com.example.rating.info.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rating.info.service.business.RatingInfoBusiness;
import com.example.rating.info.service.consts.URLS;
import com.example.rating.info.service.entities.RatingInfoDto;

@RestController
@RequestMapping(value = URLS.RATING_URL)
public class RatingInfoController {

	@Autowired
	private RatingInfoBusiness ratingInfoBusiness;
	
	@RequestMapping(value = URLS.RATING_MOVIE_ID, method = RequestMethod.GET)
	public RatingInfoDto getRatingByMusicId(String musicId) {
		return ratingInfoBusiness.getRatingInfoByMusicId(musicId);
	}
}
