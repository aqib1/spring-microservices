package com.example.rating.info.service.ratinginfoservice;

import com.example.client.RatingInfoDto;

public interface RatingInfoService {

	RatingInfoDto getRatingsByMusicId(int movieId);
}
