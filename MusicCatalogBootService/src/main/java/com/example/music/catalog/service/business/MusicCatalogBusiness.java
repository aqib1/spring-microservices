package com.example.music.catalog.service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.client.MusicCatalogDto;
import com.example.music.catalog.service.businessServicesImpl.MusicCatalogServiceImpl;

@Component
public class MusicCatalogBusiness {
	@Autowired
	private MusicCatalogServiceImpl musicCatalogServiceImpl;

	public List<MusicCatalogDto> getCatalogByUserId(int musicId) {
		return musicCatalogServiceImpl.getCatalogByUserId(musicId);
	}
}
