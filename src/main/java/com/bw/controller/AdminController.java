package com.bw.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bw.entity.Goods;
import com.bw.service.AdminService;


@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	
	
	
	//�б�չʾ
	@RequestMapping("list.do")
	public String list(Model m,Goods admin) {
		List<Goods>list=adminService.list(admin);
		m.addAttribute("list", list);
		m.addAttribute("name", admin.getName());
		m.addAttribute("p1", admin.getP1());
		m.addAttribute("p2", admin.getP2());
		return "list";
	}
	
	

	
	//��ӷ���
	@ResponseBody
	@RequestMapping("add.do")
	public Object add(Goods add) {
	System.out.println(add);	
	boolean flag=adminService.add(add);	
		
    return flag;
	
	}
	
	//��ת�����ҳ��
	@RequestMapping("add")
	public String add() {
		return "add";
	}
	
	
}
