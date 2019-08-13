package com.example.music.catalog.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.music.catalog.service.business.MusicCatalogBusiness;
import com.example.music.catalog.service.constants.URLS;
import com.example.music.catalog.service.entities.MusicCatalogDto;

@RestController
@RequestMapping(URLS.MUSIC_CAT_URL)
public class MusicCatalogController {

	@Autowired
	private MusicCatalogBusiness musicCatalogBusiness;

	@RequestMapping(value = URLS.MUSIC_CAT_BY_USER_ID, method = RequestMethod.GET)
	public List<MusicCatalogDto> getCatalogByUserById(@PathVariable("userId") String userId) {
		return musicCatalogBusiness.getCatalogByUserId(userId);
	}
}
