package com.example.rating.info.service.ratinginfoservice;

import com.example.rating.info.service.entities.RatingInfoDto;

public interface RatingInfoService {

	RatingInfoDto getRatingsByMusicId(int movieId);
}
