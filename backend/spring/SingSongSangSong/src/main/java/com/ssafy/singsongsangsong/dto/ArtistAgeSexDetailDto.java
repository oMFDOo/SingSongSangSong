package com.ssafy.singsongsangsong.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistAgeSexDetailDto {
	
	private ArtistInfoDto artistInfo;
	private int playCount;
	private TrendSongDto song;

}
