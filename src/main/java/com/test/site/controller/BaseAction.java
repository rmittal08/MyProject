package com.test.site.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.site.bo.JSONUtility;
import com.test.site.model.HotelInfo;

@Controller
public class BaseAction {

	private static final String VIEW_INDEX = "index";
	private static final String HOME = "home";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseAction.class);
	
	@Autowired
	private JSONUtility jsonUtility;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		try {
			Set<Object> listOfCity = jsonUtility.getListOfValues("city");
			model.addAttribute("listOfCity", listOfCity);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		List<Integer> listOfClass = new ArrayList<Integer>();
		listOfClass.add(1);
		listOfClass.add(2);
		listOfClass.add(3);
		listOfClass.add(4);
		model.addAttribute("listOfClass", listOfClass);
 
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return HOME;
 
	}
 
	@RequestMapping(value = "/{findHotels}",params = {"city", "star", "checkInDate", "checkOutDate"}, method = RequestMethod.GET)
	public String welcomeName(@RequestParam String city,@RequestParam String star,@RequestParam String checkInDate,@RequestParam String checkOutDate, ModelMap model, HttpServletResponse response) {
		try {
			logger.info("City: "+city);
			logger.info("Star: "+star);
			logger.info("checkInDate: "+checkInDate);
			logger.info("checkOutDate: "+checkOutDate);
			List<HotelInfo> list = jsonUtility.getParseObject("http://deals.expedia.com/beta/deals/hotels.json?city="+city+"&minStarRating="+star);
			
			//Sort data in the order of totalMeanScore which is average of all ratings and scores
			Collections.sort(list);
			response.addHeader("Access-Control-Allow-Origin", "*");
			model.addAttribute("listOfHotel", list);
		} catch (Exception exp){
			exp.printStackTrace();
		}
		return VIEW_INDEX;
 
	}

	/**
	 * @return the jsonUtility
	 */
	public JSONUtility getJsonUtility() {
		return jsonUtility;
	}

	/**
	 * @param jsonUtility the jsonUtility to set
	 */
	public void setJsonUtility(JSONUtility jsonUtility) {
		this.jsonUtility = jsonUtility;
	}
	
}
