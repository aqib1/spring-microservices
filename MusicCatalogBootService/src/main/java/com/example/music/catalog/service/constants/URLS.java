package com.example.music.catalog.service.constants;

public interface URLS {
	String MUSIC_CAT_URL = "/music/catalog/service";
	String MUSIC_CAT_BY_USER_ID = "/{musicId}";

	String MUSIC_INFO_SERVICE_NAME = "MUSIC-INFO-SERVICE";
	String MUSIC_INFO_SERVICE_GET_INFO = "/music/info/";
	String CALL_MUSIC_INFO_SERVICE = "http://" + MUSIC_INFO_SERVICE_NAME + MUSIC_INFO_SERVICE_GET_INFO;

	String RATING_INFO_SERVICE_NAME = "RATING-INFO-SERVICE";
	String RATING_INFO_SERVICE_GET_RATING = "/ratings/";
	String CALL_RATING_INFO_SERVICE = "http://" + RATING_INFO_SERVICE_NAME + RATING_INFO_SERVICE_GET_RATING;
}
