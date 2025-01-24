package com.study.dslist.dto;

import java.util.Objects;

import com.study.dslist.entities.Game;
import com.study.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer gameYear;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(){
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		gameYear = entity.getGameYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		gameYear = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
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

	public Integer getGameYear() {
		return gameYear;
	}

	public void setgameYear(Integer gameYear) {
		this.gameYear = gameYear;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, imgUrl, shortDescription, title, gameYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameMinDTO other = (GameMinDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(imgUrl, other.imgUrl)
				&& Objects.equals(shortDescription, other.shortDescription) && Objects.equals(title, other.title)
				&& Objects.equals(gameYear, other.gameYear);
	}
	
	
}
