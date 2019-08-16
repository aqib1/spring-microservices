package com.example.music.catalog.service.businessServicesImpl;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.client.MusicCatalogDto;
import com.example.music.catalog.service.businessServices.MusicCatalogService;

@Service
public class MusicCatalogServiceImpl implements MusicCatalogService {

	@Override
	public List<MusicCatalogDto> getCatalogByUserId(int musicId) {
		MusicCatalogDto dto = new MusicCatalogDto();
		dto.setId(1);
		dto.setName("track-1");
		dto.setDesc("track-1");
		dto.setRatingId(4);
		return Collections.singletonList(dto);
	}

}
