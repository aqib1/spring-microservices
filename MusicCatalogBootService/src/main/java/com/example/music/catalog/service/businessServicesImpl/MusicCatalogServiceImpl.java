package com.example.music.catalog.service.businessServicesImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.music.catalog.service.businessServices.MusicCatalogService;
import com.example.music.catalog.service.entities.MusicCatalogDto;

@Service
public class MusicCatalogServiceImpl implements MusicCatalogService {

	@Override
	public List<MusicCatalogDto> getCatalogByUserId(String userId) {
		return Collections.singletonList(new MusicCatalogDto(1, "test", "test", 4));
	}

}
