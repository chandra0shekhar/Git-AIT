package com.tqpp.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tqpp.Service.ProductService;
import com.tqpp.model.Product;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@Autowired
	private ProductService prodservice;
	
	@GetMapping("/")
	public String start(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		
		String role=(String) session.getAttribute("role");
		if(role!=null && role.equalsIgnoreCase("admin"))
		return "admin";
		else
			return "home";
		}
	
	
	@ResponseBody
	@GetMapping("/adminviewproducts")
	public String adminviewproducts()
	{
		List<Product> plist=prodservice.getAllProducts();
				return "adminviewprod";
	}
}
