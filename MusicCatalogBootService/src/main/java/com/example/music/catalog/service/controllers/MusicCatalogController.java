package com.example.music.catalog.service.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.MusicCatalogDto;
import com.example.client.MusicCatalogResponse;
import com.example.client.MusicDto;
import com.example.client.RatingInfoDto;
import com.example.music.catalog.service.business.MusicCatalogBusiness;
import com.example.music.catalog.service.constants.URLS;
import com.example.music.catalog.service.restclients.feign.MusicInfoAPI;
import com.example.music.catalog.service.restclients.feign.RatingInfoAPI;

@RestController
@RequestMapping(URLS.MUSIC_CAT_URL)
public class MusicCatalogController {

	// soon it will be deprecated.
//	@Autowired
//	private RestTemplate restTemplate;

	// Async call to API with spring reactive web
	// web-client (asynchronous)

//	@Autowired
//	private WebClient.Builder webClientBuilder;

	@Autowired
	private MusicInfoAPI musicInfoApi;

	@Autowired
	private RatingInfoAPI ratingInfoAPI;

	@Autowired
	private MusicCatalogBusiness musicCatalogBusiness;

	@RequestMapping(value = URLS.MUSIC_CAT_BY_USER_ID, method = RequestMethod.GET)
	public MusicCatalogResponse getCatalogByUserById(@PathVariable("musicId") int musicId) {
		// calling a service
		List<MusicCatalogDto> catalogs = musicCatalogBusiness.getCatalogByUserId(musicId);
		if (Objects.isNull(catalogs) || catalogs.isEmpty())
			return null;
		// proceed
		MusicCatalogResponse response = new MusicCatalogResponse();
//		MusicDto musicDto = restTemplate.getForObject(URLS.CALL_MUSIC_INFO_SERVICE + musicId, MusicDto.class);

		MusicDto musicDto = musicInfoApi.getMusicInfoByMusicId(musicId);
		response.setListMusicCatalogDto(catalogs);
		response.setMusicDto(musicDto);
		List<RatingInfoDto> ratings = new ArrayList<>();
		catalogs.stream().forEach(x -> ratings.add(ratingInfoAPI.getRatingInfoByMusicId(musicId)));
		response.setListRatingInfoDto(ratings);
		return response;
	}

//  do not forget to make is asynchronous using mono and flux
//	MusicDto musicDto = webClientBuilder.build()
//	.get()
//	.uri(URLS.CALL_MUSIC_INFO_SERVICE)
//	.retrieve()
//	.bodyToMono(MusicDto.class)
//	.block();
//	System.out.println(musicDto);
}
