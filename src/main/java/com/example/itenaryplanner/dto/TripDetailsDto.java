package com.example.itenaryplanner.dto;

import java.util.List;

import lombok.Data;

@Data
public class TripDetailsDto {

	private String id;
	private String fromPlace;
	private String toPlace;
	private String fromDate;
	private String toDate;
	private String numberOfPeople;
	private String totalCost;

	private List<ActivityDto> activity;
}
