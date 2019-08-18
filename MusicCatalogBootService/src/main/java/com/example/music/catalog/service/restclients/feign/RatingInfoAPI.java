package com.example.music.catalog.service.restclients.feign;

import static com.example.music.catalog.service.constants.URLS.RATING_INFO_SERVICE_GET_RATING;
import static com.example.music.catalog.service.constants.URLS.RATING_INFO_SERVICE_NAME;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.client.RatingInfoDto;

@FeignClient(name = RATING_INFO_SERVICE_NAME)
@RibbonClient(name = RATING_INFO_SERVICE_NAME)
public interface RatingInfoAPI {

	@RequestMapping(RATING_INFO_SERVICE_GET_RATING + "{musicId}")
	RatingInfoDto getRatingInfoByMusicId(@PathVariable("musicId") int musicId);
}
