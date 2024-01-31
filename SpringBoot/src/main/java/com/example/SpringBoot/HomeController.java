package com.example.SpringBoot;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
import com.example.SpringBoot.model.Alien;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String Home(){
        return "index";
    }
@RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model mv){
//    public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,HttpSession session){
//        int i=Integer.parseInt(req.getParameter("num1"));
//        int j=Integer.parseInt(req.getParameter("num2"));
//
//        int sum=i+j;
//        HttpSession session= req.getSession();
    int sum=i+j;
//ModelAndView mv=new ModelAndView("result");
    mv.addAttribute("sum",sum);
   // mv.setViewName("result");

//        session.setAttribute("sum",sum);
    return "result";
    }

//   public String addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname,Model m){
@RequestMapping("addAlien")
public String addAlien(@ModelAttribute("a1") Alien a){
//public String addAlien( Alien a,Model m){
/*
        Alien a =new Alien();
        a.setAid(aid);
        a.setAname(aname);
*/
    //m.addAttribute("Alien",a);
       return "result";
   }


}
