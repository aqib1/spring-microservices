package com.example.music.catalog.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.client.MusicCatalogDto;
import com.example.client.MusicCatalogResponse;
import com.example.client.MusicDto;
import com.example.music.catalog.service.business.MusicCatalogBusiness;
import com.example.music.catalog.service.constants.URLS;

@RestController
@RequestMapping(URLS.MUSIC_CAT_URL)
public class MusicCatalogController {
	
	//soon it will be deprecated.
	@Autowired
	private RestTemplate restTemplate;

	//Async call to API with spring reactive web
	//web-client (asynchronous)
	
//	@Autowired
//	private WebClient.Builder webClientBuilder;
	
	@Autowired
	private MusicCatalogBusiness musicCatalogBusiness;

	
	@RequestMapping(value = URLS.MUSIC_CAT_BY_USER_ID, method = RequestMethod.GET)
	public MusicCatalogResponse getCatalogByUserById(@PathVariable("musicId") int musicId) {
		//calling a service
		MusicCatalogResponse response = new MusicCatalogResponse();
		MusicDto musicDto = restTemplate.getForObject(URLS.CALL_MUSIC_INFO_SERVICE + musicId, MusicDto.class);
		response.setListMusicCatalogDto(musicCatalogBusiness.getCatalogByUserId(musicId));
		response.setMusicDto(musicDto);
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
