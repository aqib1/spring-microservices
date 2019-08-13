package com.example.music.catalog.service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.music.catalog.service.businessServicesImpl.MusicCatalogServiceImpl;
import com.example.music.catalog.service.entities.MusicCatalogDto;

@Component
public class MusicCatalogBusiness {
	@Autowired
	private MusicCatalogServiceImpl musicCatalogServiceImpl;

	public List<MusicCatalogDto> getCatalogByUserId(String userId) {
		return musicCatalogServiceImpl.getCatalogByUserId(userId);
	}
}
