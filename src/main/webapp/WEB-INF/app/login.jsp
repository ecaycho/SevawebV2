
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <div class="col-md-12 container">

            <div class="row">
            <div class="col-md-12 cabecera">
                <img style="margin: 0px 100px 10px;" width="150px;" src="<%=request.getContextPath()%>/public/images/buyup.png" />
            </div>    
            </div>
            

            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4 cuerpo">

                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Usuario</label>
                            <div class="col-xs-8 col-sm-10">
                                <input type="email" class="form-control" id="inputEmail3" placeholder="Usuario">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Contraseña</label>
                            <div class="col-xs-8 col-sm-10">
                                <input type="password" class="form-control" id="inputPassword3" placeholder="Contraseña">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12">

                                <label>
                                    <a href="#"> ¿Olvid&oacute; su contraseña?</a>
                                </label>

                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12">
                                <button type="submit" class="btn btn-info">Ingresar</button>
                            </div>
                        </div>
                    </form>

                </div>
                <div class="col-md-4"></div>    

            </div>

        </div>
        







    </body>
    <%@include file="/public/footer.jsp" %>
</html>
