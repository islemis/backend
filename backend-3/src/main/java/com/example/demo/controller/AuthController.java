package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MyUserDto;
import com.example.demo.model.JwtAuthenticationResponse;
import com.example.demo.model.LoginRequest;
import com.example.demo.model.MyUser;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.serviceimpl.UserServiceImp;
import com.example.demo.util.UserUtil;

@RestController
@RequestMapping("/api/auth")
//@CrossOrigin(origins = "http://localhost:53942") 
public class AuthController {

  
  
}
