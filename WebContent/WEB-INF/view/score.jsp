<%@page import="com.morphosis.login.userSID"%>
<%@page import="com.morphosis.quiz.CalScore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
   String userId = (String) session.getAttribute("leader");
   if(userId == null) {
      response.sendRedirect("login");
   }
   int SID=(int)session.getAttribute("SID");
   userSID usersid = new userSID();
   int USID= usersid.getSID(userId);
   if(USID!=SID)
   {
	   response.sendRedirect("logout");
   }
%>

<%
   String answer3 = request.getParameter("answer3");
   String user=(String)session.getAttribute("leader");

   if(answer3!=null)
   {
	   CalScore.calScore(user,3,answer3);

   }
   
   response.sendRedirect("scoreDisplay");
	    %>
