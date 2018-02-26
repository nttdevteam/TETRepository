package com.nttdata.testexecutiontracker.controller;

import static org.junit.Assert.*;

import javax.security.sasl.AuthorizeCallback;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.AfterClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.ui.ModelMap;

import com.nttdata.testexecutiontracker.controller.HistoryController;
import com.nttdata.testexecutiontracker.controller.LoginController;
import com.nttdata.testexecutiontracker.dao.AuthenticationDao;
import com.nttdata.testexecutiontracker.entity.Authentication;
import com.nttdata.testexecutiontracker.form.LoginForm;
import com.nttdata.testexecutiontracker.util.Util;

public class LoginControllerTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAuthenticate() {
	/*	LoginController loginController=new LoginController();
		ModelMap model=new ModelMap();
		LoginForm loginForm=new LoginForm();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		AuthenticationDao authenticationDao=Mockito.mock(AuthenticationDao.class);
		HttpSession session=Mockito.mock(HttpSession.class);
		Mockito.when(request.getSession()).thenReturn(session);
		Mockito.when(authenticationDao.ifExists(loginForm.getUserName(), loginForm.getPassword())).thenReturn(true);
		Mockito.when(model.addAttribute("userName", request.getSession().getValue(Util.USER_NAME))).thenReturn(model.addAttribute("userName", "John Cart"));
		String page=loginController.authenticate(loginForm, model, request);
		assertNotNull(page);*/
	}

	@Test
	public void testIndex() {
		/*LoginController loginController=new LoginController();
		ModelMap model=new ModelMap();
		LoginForm loginForm=new LoginForm();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		AuthenticationDao authenticationDao=Mockito.mock(AuthenticationDao.class);
		HttpSession session=Mockito.mock(HttpSession.class);
		Mockito.when(request.getSession()).thenReturn(session);
		Mockito.when(authenticationDao.ifExists(loginForm.getUserName(), loginForm.getPassword())).thenReturn(true);
		Mockito.when(model.addAttribute("userName", request.getSession().getValue(Util.USER_NAME))).thenReturn(model.addAttribute("userName", "John Cart"));
		String page=loginController.index(request,model);
		assertNotNull(page);*/
	}

	@Test
	public void testLogout() {
		/*LoginController loginController=new LoginController();
		ModelMap model=new ModelMap();
		LoginForm loginForm=new LoginForm();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		AuthenticationDao authenticationDao=Mockito.mock(AuthenticationDao.class);
		HttpSession session=Mockito.mock(HttpSession.class);
		Mockito.when(request.getSession()).thenReturn(session);
		Mockito.when(authenticationDao.ifExists(loginForm.getUserName(), loginForm.getPassword())).thenReturn(true);
		Mockito.when(model.addAttribute("userName", request.getSession().getValue(Util.USER_NAME))).thenReturn(model.addAttribute("userName", "John Cart"));
		String page=loginController.logout(request,model);
		assertNotNull(page);*/
	}

	@Test
	public void testProjectCycleSelection() {
		/*LoginController loginController=new LoginController();
		ModelMap model=new ModelMap();
		LoginForm loginForm=new LoginForm();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		AuthenticationDao authenticationDao=Mockito.mock(AuthenticationDao.class);
		HttpSession session=Mockito.mock(HttpSession.class);
		Mockito.when(request.getSession()).thenReturn(session);
		Mockito.when(authenticationDao.ifExists(loginForm.getUserName(), loginForm.getPassword())).thenReturn(true);
		Mockito.when(model.addAttribute("userName", request.getSession().getValue(Util.USER_NAME))).thenReturn(model.addAttribute("userName", "John Cart"));
		String page=loginController.logout(request,model);
		assertNotNull(page);*/
	}

	@Test
	public void testGetProjectCycleSelection() {
		
	}

}
