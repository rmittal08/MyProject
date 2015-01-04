package com.test.site.bo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.test.site.model.HotelInfo;

@Service
public class JSONUtility {

	public JSONUtility(){
		
	}
	/**
	 * This method is used to parse the string
	 * @param url
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws ParseException
	 * @throws java.text.ParseException
	 */
	public List<HotelInfo> getParseObject(String url) throws MalformedURLException, IOException, ParseException, java.text.ParseException{
		InputStreamReader input = new InputStreamReader(new URL(url).openStream());
		JSONParser parser=new JSONParser();
		Object jsonObject = parser.parse(input);
		JSONArray array = (JSONArray) jsonObject;
		List<HotelInfo> list = new ArrayList<HotelInfo>();
		for(Object obj: array){
			list.add(this.parseObject((JSONObject) obj));
		}
		return list;
		
	}
	
	/**
	 * This method is used to send the set of the all available values of passed attribute
	 * @param attribute
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Set<Object> getListOfValues(String attribute) throws MalformedURLException, IOException, ParseException{
		InputStreamReader input = new InputStreamReader(new URL("http://deals.expedia.com/beta/deals/hotels.json").openStream());
		JSONParser parser=new JSONParser();
		Object jsonObject = parser.parse(input);
		JSONArray array = (JSONArray) jsonObject;
		Set<Object> list = new HashSet<Object>();
		for(Object obj: array){
			list.add(((JSONObject) obj).get(attribute));
		}
		return list;
	}
	
	/**
	 * This method is used to parse the json object int to Hotel Info Object
	 * @param jsonObject
	 * @return
	 * @throws java.text.ParseException
	 */
	public HotelInfo parseObject(JSONObject jsonObject) throws java.text.ParseException{
		HotelInfo hotelInfo = new HotelInfo();
		hotelInfo.setMovingAverageScore((Double) jsonObject.get("movingAverageScore"));
		hotelInfo.setRawAppealScore((Double) jsonObject.get("rawAppealScore"));
		hotelInfo.setRelevanceScore((Double) jsonObject.get("relevanceScore"));
		hotelInfo.setUserCity((String) jsonObject.get("userCity"));
		hotelInfo.setUserOrigin((String) jsonObject.get("userOrigin"));
		hotelInfo.setCheckInDate((String) jsonObject.get("checkInDate"));
		hotelInfo.setCheckOutDate((String) jsonObject.get("checkOutDate"));
		hotelInfo.setHotelId((Long) jsonObject.get("hotelId"));
		hotelInfo.setName((String) jsonObject.get("name"));
		hotelInfo.setStreetAddress((String) jsonObject.get("streetAddress"));
		hotelInfo.setCity((String) jsonObject.get("city"));
		hotelInfo.setProvince((String) jsonObject.get("province"));
		hotelInfo.setCountry((String) jsonObject.get("country"));
		hotelInfo.setLatitude((Double) jsonObject.get("latitude"));
		hotelInfo.setLongitude((Double) jsonObject.get("longitude"));
		hotelInfo.setDescription((String) jsonObject.get("description"));
		hotelInfo.setDestination((String) jsonObject.get("destination"));
		hotelInfo.setLongDestinationName((String) jsonObject.get("longDestinationName"));
		hotelInfo.setRegionId(Long.parseLong((String) jsonObject.get("regionId")));
		hotelInfo.setStatusCode(((Long) jsonObject.get("statusCode")).intValue());
		hotelInfo.setStatusDescription((String) jsonObject.get("statusDescription"));
		hotelInfo.setBaseRate((Double) jsonObject.get("baseRate"));
		hotelInfo.setOriginalBaseRate((Double) jsonObject.get("originalBaseRate"));
		hotelInfo.setCurrency((String) jsonObject.get("currency"));
		hotelInfo.setTaxesAndFees((Double) jsonObject.get("taxesAndFees"));
		hotelInfo.setTotalRate((Double) jsonObject.get("totalRate"));
		hotelInfo.setPromotionAmount((Double) jsonObject.get("promotionAmount"));
		hotelInfo.setPromotionDescription((String) jsonObject.get("promotionDescription"));
		hotelInfo.setDealDeepLink((String) jsonObject.get("dealDeepLink"));
		hotelInfo.setSimilarDeepLink((String) jsonObject.get("similarDeepLink"));
		hotelInfo.setStarRating((Double) jsonObject.get("starRating"));
		hotelInfo.setGuestRating((Double) jsonObject.get("guestRating"));
		hotelInfo.setLengthofStay(((Long) jsonObject.get("lengthofStay")).intValue());
		hotelInfo.setPricePerNight((Double) jsonObject.get("pricePerNight"));
		hotelInfo.setOriginalPricePerNight((Double) jsonObject.get("originalPricePerNight"));
		hotelInfo.setDRR((Boolean) jsonObject.get("isDRR"));
		hotelInfo.setAllInclusive((Boolean) jsonObject.get("isAllInclusive"));
		hotelInfo.setImageUrl((String) jsonObject.get("imageUrl"));
		hotelInfo.setLanguage((String) jsonObject.get("language"));
		hotelInfo.setMandatoryTaxesAndFees((Double) jsonObject.get("mandatoryTaxesAndFees"));
		hotelInfo.setPromotionTag((String) jsonObject.get("promotionTag"));
		hotelInfo.setCarPackage((Boolean) jsonObject.get("carPackage"));
		hotelInfo.setDistanceFromUser((Double) jsonObject.get("carPackageScore"));
		hotelInfo.setDistanceFromUser((Double) jsonObject.get("distanceFromUser"));
		return hotelInfo;
	}
}
