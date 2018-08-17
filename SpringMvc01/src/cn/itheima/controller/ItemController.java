package cn.itheima.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itheima.pojo.Items;

@Controller
public class ItemController {
   
	
	//这里还要加上RequestMapping 注解  属性是url地址 才能访问到这个action方法 ,.action可以省略  但是访问这个方法的时候要加上
	@RequestMapping("/itemList")
	public ModelAndView itemList() throws Exception{

		List<Items> itemList = new ArrayList<Items>();
  		
		//商品列表
		Items items_1 = new Items();
		items_1.setName("联想笔记本_3");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		
		itemList.add(items_1);
		itemList.add(items_2);
		
		
	    //创建模型与视图对象
		ModelAndView modelAndView = new ModelAndView();
		
		//将List加到模型对象  类似于 request.setAttribute 往页面上送数据
		modelAndView.addObject("itemList", itemList);
		
		//绑定视图对象  返回的jsp页面   绑定要放回的jsp页面   请求转发
		//modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
		
		//可以在Spring的核心配置文件中  显式的配置上视图解析器，配置上他的两个属性：前缀后后缀，
		//之后就只需要写上他的中间的文件名即可 方便  会自动拼接  前缀prefix + itemList + suffix
		
		modelAndView.setViewName("itemList");
		//返回对象
		return modelAndView;
	}
}
