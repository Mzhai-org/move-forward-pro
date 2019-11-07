/**
 * Talcloud.com Inc. Copyright (c) 2018-2020 All Rights Reserved.
 */

package com.zs.discount.controller;

import com.zs.discount.factory.DiscountFactory;
import com.zs.discount.strategy.DiscountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *    描述信息
 * </pre>
 *
 * @author zhaishuo
 * @version $Id: DiscountController.java, v1.0 2019/11/7 15:09 zhaishuo Exp $
 */
@RestController
public class DiscountController {
  
  private static final Logger LOGGER = LoggerFactory.getLogger("request.accesslog");
  
  @Autowired
  Map<String, DiscountService> serviceMap;
  
  @GetMapping("/price")
  private double getPrice(String vipType, Integer price) {
    double d = serviceMap.get(vipType).discount(price);
    LOGGER.info("serviceMap get service discount: {}", d);
    LOGGER.info("get param vipType:{}, price:{}", vipType, price);
    double disount = DiscountFactory.getImpl(vipType).discount(price);
    LOGGER.error("test error");
    return price * disount;
  }
  
}
