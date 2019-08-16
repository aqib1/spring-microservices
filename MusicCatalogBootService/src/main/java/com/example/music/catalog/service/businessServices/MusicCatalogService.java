package com.example.music.catalog.service.businessServices;

import java.util.List;
import com.example.client.MusicCatalogDto;


public interface MusicCatalogService {

	List<MusicCatalogDto> getCatalogByUserId(int musicId);
}
