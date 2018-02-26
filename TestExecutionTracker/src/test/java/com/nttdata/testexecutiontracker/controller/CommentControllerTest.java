package com.nttdata.testexecutiontracker.controller;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

import org.junit.AfterClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.ui.ModelMap;

import com.nttdata.testexecutiontracker.controller.CommentController;
import com.nttdata.testexecutiontracker.util.Util;

public class CommentControllerTest {

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testShowCommentsPage() {
		/*CommentController commentController=new CommentController();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpSession session=Mockito.mock(HttpSession.class);
		Mockito.when(request.getSession()).thenReturn(session);
		ModelMap model=new ModelMap();
		Mockito.when(((String)request.getSession().getAttribute(Util.USER_NAME))).thenReturn("John");
		String page=commentController.enterComment(22222, model, request);
		assertNotNull(page);
		assertEquals("comment", page);*/
		
	}

	@Test
	public void testEnterComment() {
		/*CommentController commentController=new CommentController();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpSession session=Mockito.mock(HttpSession.class);
		Mockito.when(request.getSession()).thenReturn(session);
		ModelMap model=new ModelMap();
		Mockito.when(((String)request.getSession().getAttribute(Util.USER_NAME))).thenReturn("John");
		String page=commentController.enterComment(2222, model, request);
		assertNotNull(page);
		assertEquals("comment", page);*/
	}

}
