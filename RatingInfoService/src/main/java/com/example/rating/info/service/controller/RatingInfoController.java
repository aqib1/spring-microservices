package com.example.rating.info.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.RatingInfoDto;
import com.example.rating.info.service.business.RatingInfoBusiness;
import com.example.rating.info.service.consts.URLS;

@RestController
@RequestMapping(value = URLS.RATING_URL)
public class RatingInfoController {

	@Autowired
	private RatingInfoBusiness ratingInfoBusiness;
	
	@RequestMapping(value = URLS.RATING_MOVIE_ID, method = RequestMethod.GET)
	public RatingInfoDto getRatingByMusicId(@PathVariable("movieId") int musicId) {
		return ratingInfoBusiness.getRatingInfoByMusicId(musicId);
	}
}
