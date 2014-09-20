
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="<%=request.getContextPath()%>/public/images/favicon.ico"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buyup</title>
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

                    <form id="formLogin" class="form-horizontal panel panel-primary" role="form" action="<%=request.getContextPath()%>/iniciarSesion" method="post">
                        <div class="panel-heading"><center><span style="font-size: 16px;">Iniciar Sesi&oacute;n</span></center></div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Usuario</label>
                            <div class="col-xs-8 col-sm-10">
                                <input type="email" name="usuario" class="form-control" id="usuario" placeholder="Campo obligatorio">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Contraseña</label>
                            <div class="col-xs-8 col-sm-10">
                                <input type="password" name="clave" class="form-control" id="clave" placeholder="Campo obligatorio">
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
                                <button id="enviar" type="button" class="btn btn-info">Ingresar</button>
                            </div>
                        </div>

                    </form>

                </div>
                <div class="col-md-4"></div>    

            </div>

        </div>

    </body>
    <%@include file="/public/footer.jsp" %>
    <script type="text/javascript">
        $(function() {

            $("#enviar").click(function() {

                if ($("#usuario").val() == '') {
                    $("#usuario").focus();

                    return false;
                } else
                if ($("#clave").val() == '') {
                    $("#clave").focus();

                    return false;
                } else {
                
                    $("#formLogin").submit();
                }
            });

        });

        /* function validar() {

            $.ajax({
                type: "POST",
                url: 'iniciarSesion/',
                data: $("#formLogin").serialize(),
                success: function() {
                   
                }
            });
        }*/
    </script>
</html>
