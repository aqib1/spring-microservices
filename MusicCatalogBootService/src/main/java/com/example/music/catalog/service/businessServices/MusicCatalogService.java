package com.example.music.catalog.service.businessServices;

import java.util.List;

import com.example.music.catalog.service.entities.MusicCatalogDto;

public interface MusicCatalogService {

	List<MusicCatalogDto> getCatalogByUserId(String userId);
}
