package com.example.music.catalog.service.restclients.feign;

import static com.example.music.catalog.service.constants.URLS.MUSIC_INFO_SERVICE_GET_INFO;
import static com.example.music.catalog.service.constants.URLS.MUSIC_INFO_SERVICE_NAME;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.client.MusicDto;

@FeignClient(name = MUSIC_INFO_SERVICE_NAME)
@RibbonClient(name = MUSIC_INFO_SERVICE_NAME)
public interface MusicInfoAPI {
	
	@RequestMapping(MUSIC_INFO_SERVICE_GET_INFO+"{musicId}")
	MusicDto getMusicInfoByMusicId(@PathVariable("musicId") int musicId);
}
