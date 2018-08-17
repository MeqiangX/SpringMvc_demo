package cn.itheima.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itheima.pojo.Items;

@Controller
public class ItemController {
   
	
	//���ﻹҪ����RequestMapping ע��  ������url��ַ ���ܷ��ʵ����action���� ,.action����ʡ��  ���Ƿ������������ʱ��Ҫ����
	@RequestMapping("/itemList")
	public ModelAndView itemList() throws Exception{

		List<Items> itemList = new ArrayList<Items>();
  		
		//��Ʒ�б�
		Items items_1 = new Items();
		items_1.setName("����ʼǱ�_3");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
		
		Items items_2 = new Items();
		items_2.setName("ƻ���ֻ�");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6ƻ���ֻ���");
		
		itemList.add(items_1);
		itemList.add(items_2);
		
		
	    //����ģ������ͼ����
		ModelAndView modelAndView = new ModelAndView();
		
		//��List�ӵ�ģ�Ͷ���  ������ request.setAttribute ��ҳ����������
		modelAndView.addObject("itemList", itemList);
		
		//����ͼ����  ���ص�jspҳ��   ��Ҫ�Żص�jspҳ��   ����ת��
		//modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
		
		//������Spring�ĺ��������ļ���  ��ʽ����������ͼ�������������������������ԣ�ǰ׺���׺��
		//֮���ֻ��Ҫд�������м���ļ������� ����  ���Զ�ƴ��  ǰ׺prefix + itemList + suffix
		
		modelAndView.setViewName("itemList");
		//���ض���
		return modelAndView;
	}
}
