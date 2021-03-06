
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
 * @version $Id: SuperVipServiceImpl.java, v1.0 2019/11/6 16:09 zhaishuo Exp $
 */
@Service("SVip")
public class SuperVipDiscountServiceImpl implements DiscountService, InitializingBean {
  public double discount(Integer price) {
    return 0.8;
  }

  public void afterPropertiesSet() throws Exception {
    DiscountFactory.register("SVip", this);
  }
}
