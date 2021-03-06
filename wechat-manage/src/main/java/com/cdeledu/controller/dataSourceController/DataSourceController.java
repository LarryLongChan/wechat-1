package com.cdeledu.controller.dataSourceController;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdeledu.controller.BaseController;

/**
 * @类描述: 数据库管理
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午2:26:19
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Controller
@RequestMapping("/dataSourceController")
@Transactional(readOnly = true)
public class DataSourceController extends BaseController {
	/** ----------------------------------------------------- Fields start */

	private static final long serialVersionUID = 1L;

	/** ----------------------------------------------------- Fields end */
	/**
	 * @方法: 跳转到连接池监控页面
	 * @创建人:独泪了无痕
	 * @return
	 */
	@Transactional
	@RequestMapping(params = "goDruid")
	public ModelAndView goDruid() {
		return new ModelAndView("/system/druid/index");
	}
}
