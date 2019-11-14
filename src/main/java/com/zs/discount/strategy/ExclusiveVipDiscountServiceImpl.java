/**
 * Talcloud.com Inc. Copyright (c) 2018-2020 All Rights Reserved.
 */

package com.zs.discount.strategy;

import com.zs.discount.factory.DiscountFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * <pre>
 *    描述信息
 * </pre>
 *
 * @author zhaishuo
 * @version $Id: ExclusiveVipDiscountServiceImpl.java, v1.0 2019/11/6 16:08 zhaishuo Exp $
 */
@Service("EVip")
public class ExclusiveVipDiscountServiceImpl implements DiscountService, InitializingBean {
  
  public double discount(Integer price) {
    if (price > 300) {
      return 0.7;
    }
    return 1;
  }

  public void afterPropertiesSet() throws Exception {
    DiscountFactory.register("EVip", this);
  }
}