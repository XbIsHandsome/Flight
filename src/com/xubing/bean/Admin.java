package com.xubing.bean;

import java.io.Serializable;
import java.util.Date;


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


public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer adminid;
	private String adminname;
	private String adminpass;
	
	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}

	
	
}
