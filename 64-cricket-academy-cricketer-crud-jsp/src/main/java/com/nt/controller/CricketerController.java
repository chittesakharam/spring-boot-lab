package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.CricketerService;
import com.nt.vo.CricketerVO;

@Controller
public class CricketerController {

	private final  CricketerService service;

	CricketerController(CricketerService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public String showHomePage()
	{
		System.out.println("CricketerController.showHomePage()");
		return "index";
	}
	
	@GetMapping("/viewCricketers")
	public String viewAllCricketers(Map<String,Object> map)
	{
		System.out.println("CricketerController.viewAllCricketers()");
		List<CricketerVO> list = service.viewAllCricketers();
		map.put("cricketers", list);
		return "view_cricketers";
	}
	@GetMapping("/addCricketer")
	public String addCricketer(@ModelAttribute("cricketerVO") CricketerVO vo)
	{
		System.out.println("CricketerController.addCricketer()");
		return "add_cricketer";
	}
	
	@PostMapping("/saveCricketer")
	public String saveCricketer(@ModelAttribute("cricketerVO") CricketerVO vo,RedirectAttributes attrs)
	{
		System.out.println("CricketerController.saveCricketer()");
		 String msg = service.addCricketer(vo);
		 attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:viewCricketers";
	}
	
	@GetMapping("/editCricketer")
	public String updateCricketer(@RequestParam("playerId")Integer id,@ModelAttribute("cricketerVO") CricketerVO vo)
	{
		System.out.println("CricketerController.updateCricketer()");
		  CricketerVO cricketer = service.findCricketerById(id);
		  BeanUtils.copyProperties(cricketer, vo);
		return "update_cricketer";
	}
	@PostMapping("/updateCricketer")
	public String updateCricketer(@ModelAttribute("cricketerVO") CricketerVO vo,RedirectAttributes attrs)
	{
		System.out.println("CricketerController.updateCricketer()");
		String msg = service.updateCricketer(vo);
		attrs.addFlashAttribute("updateMsg",msg);
		return "redirect:viewCricketers";
	}
	
	@GetMapping("/deleteCricketer")
	public String deleteCricketer(@RequestParam("playerId") Integer id,RedirectAttributes attrs)
	{
		System.out.println("CricketerController.deleteCricketer()");
		String msg = service.deleteCricketer(id);
		attrs.addFlashAttribute("deleteMsg",msg);
		return "redirect:viewCricketers";
	}
}

