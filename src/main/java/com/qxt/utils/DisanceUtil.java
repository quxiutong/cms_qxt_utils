/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DisanceUtil.java 
 * @Prject: qxt-utils
 * @Package: com.qxt.utils 
 * @Description: TODO
 * @author: Administrator   
 * @date: 2019年12月22日 下午7:00:37 
 * @version: V1.0   
 */
package com.qxt.utils;

import java.awt.geom.Point2D;

/** 
 * @ClassName: DisanceUtil 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年12月22日 下午7:00:37  
 */
public class DisanceUtil {
	
	 private static final double EARTH_RADIUS = 6371393; // 平均半径,单位：m
	 //输入经纬度，计算两个坐标间的距离
	  public static double getDistance(double j1,double w1,double j2,double w2) {
	    	 Point2D pointDD = new Point2D.Double(j1, w1);
		     Point2D pointXD = new Point2D.Double(j2, w2);
			return calculate(pointDD, pointXD);
	    }
	    /**
	     * 通过AB点经纬度获取距离
	     * @param pointA A点(经，纬)
	     * @param pointB B点(经，纬)
	     * @return 距离(单位：米)
	     */
	    public static double calculate(Point2D pointA, Point2D pointB) {
	        // 经纬度（角度）转弧度。弧度用作参数，以调用Math.cos和Math.sin
	        double radiansAX = Math.toRadians(pointA.getX()); // A经弧度
	        double radiansAY = Math.toRadians(pointA.getY()); // A纬弧度
	        double radiansBX = Math.toRadians(pointB.getX()); // B经弧度
	        double radiansBY = Math.toRadians(pointB.getY()); // B纬弧度
	        double cos = Math.cos(radiansAY) * Math.cos(radiansBY) * Math.cos(radiansAX - radiansBX)
	                + Math.sin(radiansAY) * Math.sin(radiansBY);
	        double acos = Math.acos(cos); // 反余弦值
	        return EARTH_RADIUS * acos; // 最终结果
	    }
	    
	  
	    public static void main(String[] args) {
	        // 北京 东单地铁站
	       // Point2D pointDD = new Point2D.Double(116.425249, 39.914504);
	        // 北京 西单地铁站
	       // Point2D pointXD = new Point2D.Double(116.382001, 39.913329);
	    	double d = getDistance(116.425249, 39.914504,116.382001, 39.913329);
	        System.out.println("两点的距离:"+d+"米");
	    }
}
