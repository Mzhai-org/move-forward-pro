
package com.zs.designpatternrest.discount.strategy;

import com.zs.designpatternrest.discount.factory.DiscountFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * <pre>
 *    描述信息
 * </pre>
 *
 * @author zhaishuo
 * @version $Id: VipDiscountServiceImpl.java, v1.0 2019/11/6 16:10 zhaishuo Exp $
 */
@Service("Vip")
public class VipDiscountServiceImpl implements DiscountService, InitializingBean {
  
  public double discount(Integer price) {
    return 0.9;
  }

  public void afterPropertiesSet() throws Exception {
    DiscountFactory.register("Vip", this);
  }
}
