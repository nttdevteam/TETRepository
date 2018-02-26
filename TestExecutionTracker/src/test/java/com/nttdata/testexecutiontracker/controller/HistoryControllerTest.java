package com.nttdata.testexecutiontracker.controller;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.AfterClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpRequest;
import org.springframework.ui.ModelMap;

import com.nttdata.testexecutiontracker.controller.HistoryController;
import com.nttdata.testexecutiontracker.util.Util;

public class HistoryControllerTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testIndex() {
		/*ModelMap model=new ModelMap();
		HistoryController historyController=new HistoryController();
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpSession session=Mockito.mock(HttpSession.class);
		Mockito.when(request.getSession()).thenReturn(session);
		Mockito.when(model.addAttribute("userName", request.getSession().getValue(Util.USER_NAME))).thenReturn(model.addAttribute("userName", "John Cart"));
		String page=historyController.index(2222, model, request);
		assertNotNull(page);
		assertEquals("history", page);*/
	}

}
