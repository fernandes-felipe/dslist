package com.study.dslist.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.study.dslist.entities.Game;

public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO(){}
	
	public GameDTO(Game entity) {
		// usado para fazer o mapeamento das entidades desde que os nomes sejam iguais
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}
 
	public void setScore(Double score) {
		this.score = score;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre, id, imgUrl, longDescription, platforms, score, shortDescription, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameDTO other = (GameDTO) obj;
		return Objects.equals(genre, other.genre) && Objects.equals(id, other.id)
				&& Objects.equals(imgUrl, other.imgUrl) && Objects.equals(longDescription, other.longDescription)
				&& Objects.equals(platforms, other.platforms) && Objects.equals(score, other.score)
				&& Objects.equals(shortDescription, other.shortDescription) && Objects.equals(title, other.title)
				&& Objects.equals(year, other.year);
	}	
	
}
