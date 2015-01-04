package com.test.site.model;

import java.util.Comparator;
/**
 * This comparator is used to sort the data by star Rating
 * @author hp
 *
 */
public class StarComp implements Comparator<HotelInfo>{

	public int compare(HotelInfo o1, HotelInfo o2) {
		if(o1.getStarRating()>o2.getStarRating())
			return 1;
		else if(o1.getStarRating()<o2.getStarRating())
			return -1;
		return 0;
	}


}
