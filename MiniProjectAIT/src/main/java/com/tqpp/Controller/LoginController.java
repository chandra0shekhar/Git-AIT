package com.tqpp.Controller;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tqpp.Service.ProductService;
import com.tqpp.Service.UserService;
import com.tqpp.dto.Item;
import com.tqpp.model.Product;
import com.tqpp.model.User;
import com.tqpp.dto.Item;

@Controller
public class LoginController {
	@Autowired
	private UserService uservice;

	@Autowired
	private ProductService prodservice;

	@GetMapping("/")
	public String startpage(Model m,HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			String userrole=(String) session.getAttribute("role");
			m.addAttribute("userrole",userrole);
			
		}
		return "home";
	}

	@GetMapping("/signin")
	public String login(Model m, HttpServletRequest req) {
		HttpSession session=req.getSession();
		if(session!=null)
		return "/home";
		m.addAttribute("status", req.getAttribute("status"));
		return "signin";
	}

	@GetMapping("/signup")
	public String signup(Model m, HttpServletRequest req) {
		return "signup";
	}

	@PostMapping("/addsignup")
	public String login(@ModelAttribute User user) {
		uservice.insertUser(user);
		return "redirect:/signin";
	}

	@GetMapping("/validateuser")
	public String ValidateUser(@ModelAttribute User user, HttpServletRequest req,Model m) {
		System.out.println("&&&&&&&&&&&&&&" + user);
		String usernm = user.getUserName();
		String pass = user.getPassword();
		User u1 = uservice.getUserByNameAndPassword(usernm, pass);
		if (u1 == null) {
			m.addAttribute("status", "Invalid username and password");
			return "signin";
		} else {
			HttpSession session = req.getSession();
		
			String role=u1.getRole().getRoleType();
			 ArrayList<Item> cartlist=new ArrayList<Item>();
			 session.setAttribute("cartlist", cartlist);
			session.setAttribute("role", role);
			session.setAttribute("total", 0.0);
			if(role.equalsIgnoreCase("admin"))
				return "forward:/admin/";
			else
			return "home";

		}

	}

	@GetMapping("/viewproducts")
	public ModelAndView viewProducts() 
	{
		List<Product> lst = prodservice.getAllProducts();
		System.out.println("(((((((((((((((("+lst);
		ModelAndView mv = new ModelAndView("viewprod");
		mv.addObject("productlist", lst);
		return mv;

	}
	
	
	@GetMapping("/cart")
	public String addCart(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		ArrayList<Item> al=(ArrayList<Item>) session.getAttribute("cartlist");
		if(al==null)
			return "redirect:/signin";
	
	else
	{
		int productid=Integer.parseInt(request.getParameter("id"));
		Double total=(double) session.getAttribute("total");
		
		Product p=prodservice.getProductById(productid);
		total=total+p.getPrice()*1;
		al.add(new Item(p.getProductId(), p.getName(),p.getPrice(),1));
		session.setAttribute("cartlist",al);
		session.setAttribute("total",total);
		return "forward:/viewproducts";
	}
	}
	
	
	@GetMapping("/viewcart")
	public String showCart(HttpServletRequest request,Model m)
	{
		HttpSession session = request.getSession();
		if(session!=null)
			m.addAttribute("status","empty");
		else {
			ArrayList<Item> al=(ArrayList<Item>)session.getAttribute("cartlist");
			 m.addAttribute("cartlist",al);
			 m.addAttribute("total",session.getAttribute("total"));
			
		}	
		return "viewcart";
		
	}
	
	
	@ResponseBody
	@GetMapping("/logout")
	public String logout(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		session.setAttribute("userrole", null);
		if(session!=null)
			session.invalidate();
		
		return "thankx for visiting.....";
		
	}

}

