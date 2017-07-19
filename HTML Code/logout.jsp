<%
session.setAttribute("userN", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>
