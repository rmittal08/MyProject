package com.test.site.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelInfo implements Comparable<HotelInfo> {

	private double movingAverageScore;
	private double rawAppealScore;
	private double relevanceScore;
	private String userCity;
	private String userOrigin;
	private Date checkInDate;
	private Date checkOutDate;
	private long hotelId;
	private String name;
	private String streetAddress;
	private String city;
	private String province;
	private String country;
	private double latitude;
	private double longitude;
	private String description;
	private String destination;
	private String longDestinationName;
	private long regionId;
	private int statusCode;
	private String statusDescription;
	private double baseRate;
	private double originalBaseRate;
	private String currency;
	private double taxesAndFees;
	private double totalRate;
	private double promotionAmount;
	private String promotionDescription;
	private String dealDeepLink;
	private String similarDeepLink;
	private double starRating;
	private double guestRating;
	private int lengthofStay;
	private double pricePerNight;
	private double originalPricePerNight;
	private double percentSavings;
	private boolean isDRR;
	private boolean isAllInclusive;
	private String imageUrl;
	private String language;
	private double mandatoryTaxesAndFees;
	private String promotionTag;
	private boolean carPackage;
	private double carPackageScore;
	private double distanceFromUser;
	private double totalMeanScore;
	
	/**
	 * @return the movingAverageScore
	 */
	public double getMovingAverageScore() {
		return movingAverageScore;
	}
	/**
	 * @return the rawAppealScore
	 */
	public double getRawAppealScore() {
		return rawAppealScore;
	}
	/**
	 * @return the relevanceScore
	 */
	public double getRelevanceScore() {
		return relevanceScore;
	}
	/**
	 * @return the userCity
	 */
	public String getUserCity() {
		return userCity;
	}
	/**
	 * @return the userOrigin
	 */
	public String getUserOrigin() {
		return userOrigin;
	}
	/**
	 * @return the checkInDate
	 */
	public Date getCheckInDate() {
		return checkInDate;
	}
	/**
	 * @return the checkOutDate
	 */
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	/**
	 * @return the hotelId
	 */
	public long getHotelId() {
		return hotelId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @return the longDestinationName
	 */
	public String getLongDestinationName() {
		return longDestinationName;
	}
	/**
	 * @return the regionId
	 */
	public long getRegionId() {
		return regionId;
	}
	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}
	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}
	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}
	/**
	 * @return the originalBaseRate
	 */
	public double getOriginalBaseRate() {
		return originalBaseRate;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @return the taxesAndFees
	 */
	public double getTaxesAndFees() {
		return taxesAndFees;
	}
	/**
	 * @return the totalRate
	 */
	public double getTotalRate() {
		return totalRate;
	}
	/**
	 * @return the promotionAmount
	 */
	public double getPromotionAmount() {
		return promotionAmount;
	}
	/**
	 * @return the promotionDescription
	 */
	public String getPromotionDescription() {
		return promotionDescription;
	}
	/**
	 * @return the dealDeepLink
	 */
	public String getDealDeepLink() {
		return dealDeepLink;
	}
	/**
	 * @return the similarDeepLink
	 */
	public String getSimilarDeepLink() {
		return similarDeepLink;
	}
	/**
	 * @return the starRating
	 */
	public double getStarRating() {
		return starRating;
	}
	/**
	 * @return the guestRating
	 */
	public double getGuestRating() {
		return guestRating;
	}
	/**
	 * @return the lengthofStay
	 */
	public int getLengthofStay() {
		return lengthofStay;
	}
	/**
	 * @return the pricePerNight
	 */
	public double getPricePerNight() {
		return pricePerNight;
	}
	/**
	 * @return the originalPricePerNight
	 */
	public double getOriginalPricePerNight() {
		return originalPricePerNight;
	}
	/**
	 * @return the percentSavings
	 */
	public double getPercentSavings() {
		return percentSavings;
	}
	/**
	 * @return the isDRR
	 */
	public boolean isDRR() {
		return isDRR;
	}
	/**
	 * @return the isAllInclusive
	 */
	public boolean isAllInclusive() {
		return isAllInclusive;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @return the mandatoryTaxesAndFees
	 */
	public double getMandatoryTaxesAndFees() {
		return mandatoryTaxesAndFees;
	}
	/**
	 * @return the promotionTag
	 */
	public String getPromotionTag() {
		return promotionTag;
	}
	/**
	 * @return the carPackage
	 */
	public boolean isCarPackage() {
		return carPackage;
	}
	/**
	 * @return the carPackageScore
	 */
	public double getCarPackageScore() {
		return carPackageScore;
	}
	/**
	 * @return the distanceFromUser
	 */
	public double getDistanceFromUser() {
		return distanceFromUser;
	}
	/**
	 * @param movingAverageScore the movingAverageScore to set
	 */
	public void setMovingAverageScore(double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}
	/**
	 * @param rawAppealScore the rawAppealScore to set
	 */
	public void setRawAppealScore(double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}
	/**
	 * @param relevanceScore the relevanceScore to set
	 */
	public void setRelevanceScore(double relevanceScore) {
		this.relevanceScore = relevanceScore;
	}
	/**
	 * @param userCity the userCity to set
	 */
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	/**
	 * @param userOrigin the userOrigin to set
	 */
	public void setUserOrigin(String userOrigin) {
		this.userOrigin = userOrigin;
	}
	/**
	 * @param checkInDate the checkInDate to set
	 */
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	/**
	 * @param checkOutDate the checkOutDate to set
	 */
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	/**
	 * @param checkInDate the checkInDate to set
	 * @throws ParseException 
	 */
	public void setCheckInDate(String checkInDate) throws ParseException {
		this.checkInDate = new SimpleDateFormat("yyyy-MM-dd").parse(checkInDate);
	}
	/**
	 * @param checkOutDate the checkOutDate to set
	 * @throws ParseException 
	 */
	public void setCheckOutDate(String checkOutDate) throws ParseException {
		this.checkOutDate = new SimpleDateFormat("yyyy-MM-dd").parse(checkOutDate);
	}
	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @param longDestinationName the longDestinationName to set
	 */
	public void setLongDestinationName(String longDestinationName) {
		this.longDestinationName = longDestinationName;
	}
	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	/**
	 * @param originalBaseRate the originalBaseRate to set
	 */
	public void setOriginalBaseRate(double originalBaseRate) {
		this.originalBaseRate = originalBaseRate;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @param taxesAndFees the taxesAndFees to set
	 */
	public void setTaxesAndFees(double taxesAndFees) {
		this.taxesAndFees = taxesAndFees;
	}
	/**
	 * @param totalRate the totalRate to set
	 */
	public void setTotalRate(double totalRate) {
		this.totalRate = totalRate;
	}
	/**
	 * @param promotionAmount the promotionAmount to set
	 */
	public void setPromotionAmount(double promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	/**
	 * @param promotionDescription the promotionDescription to set
	 */
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	/**
	 * @param dealDeepLink the dealDeepLink to set
	 */
	public void setDealDeepLink(String dealDeepLink) {
		this.dealDeepLink = dealDeepLink;
	}
	/**
	 * @param similarDeepLink the similarDeepLink to set
	 */
	public void setSimilarDeepLink(String similarDeepLink) {
		this.similarDeepLink = similarDeepLink;
	}
	/**
	 * @param starRating the starRating to set
	 */
	public void setStarRating(double starRating) {
		this.starRating = starRating;
	}
	/**
	 * @param guestRating the guestRating to set
	 */
	public void setGuestRating(double guestRating) {
		this.guestRating = guestRating;
	}
	/**
	 * @param lengthofStay the lengthofStay to set
	 */
	public void setLengthofStay(int lengthofStay) {
		this.lengthofStay = lengthofStay;
	}
	/**
	 * @param pricePerNight the pricePerNight to set
	 */
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	/**
	 * @param originalPricePerNight the originalPricePerNight to set
	 */
	public void setOriginalPricePerNight(double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}
	/**
	 * @param percentSavings the percentSavings to set
	 */
	public void setPercentSavings(double percentSavings) {
		this.percentSavings = percentSavings;
	}
	/**
	 * @param isDRR the isDRR to set
	 */
	public void setDRR(boolean isDRR) {
		this.isDRR = isDRR;
	}
	/**
	 * @param isAllInclusive the isAllInclusive to set
	 */
	public void setAllInclusive(boolean isAllInclusive) {
		this.isAllInclusive = isAllInclusive;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @param mandatoryTaxesAndFees the mandatoryTaxesAndFees to set
	 */
	public void setMandatoryTaxesAndFees(double mandatoryTaxesAndFees) {
		this.mandatoryTaxesAndFees = mandatoryTaxesAndFees;
	}
	/**
	 * @param promotionTag the promotionTag to set
	 */
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}
	/**
	 * @param carPackage the carPackage to set
	 */
	public void setCarPackage(boolean carPackage) {
		this.carPackage = carPackage;
	}
	/**
	 * @param carPackageScore the carPackageScore to set
	 */
	public void setCarPackageScore(double carPackageScore) {
		this.carPackageScore = carPackageScore;
	}
	/**
	 * @param distanceFromUser the distanceFromUser to set
	 */
	public void setDistanceFromUser(double distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}
	
	
	public int compareTo(HotelInfo o) {
		if(this.totalMeanScore>o.totalMeanScore)
			return 1;
		else if(this.totalMeanScore<o.totalMeanScore)
			return -1;
		return 0;
	}
	/**
	 * @return the totalMeanScore
	 */
	public double getTotalMeanScore() {
		return totalMeanScore;
	}
	/**
	 * This is used to calculate the best deals
	 * @param totalMeanScore the totalMeanScore to set
	 */
	public void setTotalMeanScore() {
		this.totalMeanScore = movingAverageScore + rawAppealScore + relevanceScore + starRating + guestRating;
	}
	
	
	
}
