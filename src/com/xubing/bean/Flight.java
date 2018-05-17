package com.xubing.bean;

import java.io.Serializable;
import java.sql.Date;


/**
 * 
 * @author Administrator
 *DROP TABLE IF EXISTS `flight`;
CREATE TABLE `flight`  (
  `fid` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT ' ',
  `from` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `to` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` date NOT NULL,
  `price` double(255, 2) NOT NULL,
  `seat` int(255) NOT NULL,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
 *
 *
 */


public class Flight implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fid;
	private String flight_from;
	private String flight_to;
	private Date flight_time;
	private Double flight_price;
	private Integer flight_seat;

	public String getFid() {
		return fid;
	}



	public void setFid(String fid) {
		this.fid = fid;
	}



	public String getFlight_from() {
		return flight_from;
	}



	public void setFlight_from(String flight_from) {
		this.flight_from = flight_from;
	}



	public String getFlight_to() {
		return flight_to;
	}



	public void setFlight_to(String flight_to) {
		this.flight_to = flight_to;
	}



	public Date getFlight_time() {
		return flight_time;
	}



	public void setFlight_time(Date flight_time) {
		this.flight_time = flight_time;
	}



	public Double getFlight_price() {
		return flight_price;
	}



	public void setFlight_price(Double flight_price) {
		this.flight_price = flight_price;
	}



	public Integer getFlight_seat() {
		return flight_seat;
	}



	public void setFlight_seat(Integer flight_seat) {
		this.flight_seat = flight_seat;
	}



	@Override
	public String toString() {
		return "Flight [fid=" + fid + ", from=" + flight_from + ", to=" + flight_to
				+ ", time=" + flight_time + ", price=" + flight_price + ", seat=" + flight_seat
				+ "]";
	}
	
	
}
