package com.zafar.filer;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.zafar.jwt.JwtHelper;
import com.zafar.service.UserDefineService;
@Component
public class FilerForJwt extends OncePerRequestFilter {
	@Autowired
	private JwtHelper jwt;
	@Autowired
	private UserDefineService userdefine;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	String header = request.getHeader("Authorization");
	String username=null;
	String jwtToken=null;
	if(header!=null && header.startsWith("bearer "))
	{
		jwtToken=header.substring(7);
		try {
			username = this.jwt.extractUsername(jwtToken);
		} catch (Exception e) {
			e.printStackTrace();
		}
		UserDetails details = userdefine.loadUserByUsername(username);
		
		if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null)
		{
			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(details,null,details.getAuthorities());
			usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
		SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
		}
		else
		{
			System.out.println("token is not validate");
		}
	}
	filterChain.doFilter(request, response);
	
	}

}