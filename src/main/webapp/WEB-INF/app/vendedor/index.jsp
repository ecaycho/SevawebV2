<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <h1>Hello Vendedor!</h1>
        <a href="<%=request.getContextPath()%>/adm/vendedor/nuevo">"Nuevo"</a>
         
    </body>
    <%@include file="/public/footer.jsp" %>
</html>
