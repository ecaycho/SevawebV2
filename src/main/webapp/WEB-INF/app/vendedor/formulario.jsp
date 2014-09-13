<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <h1>Hello Vendedor!</h1>
        
         <div>
             <form id="form1" method="post" action="<%=request.getContextPath()%>/adm/vendedor/guardar">
            <label>Paterno:</label>
            <input name="paterno" type="text" />
            <label>Materno: </label>
            <input name="materno" type="text" />
            <label>Nombres:</label>
            <input name="nombres" type="text" />
            <label>Email:</label>
            <input name="email" type="text" />
            <button name="enviar" value="Enviar" >Enviar</button>
        </form>
    </div>
    </body>
    <%@include file="/public/footer.jsp" %>
</html>
