<%-- 
    Document   : RegistarFuncionario
    Created on : 31/05/2023, 01:58:38 PM
    Author     : ANDRES CASCAVITA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
    </head>
    <body>
        <style>
            body {
                font-family: cursive;
                text-align: center;
                background-color: greenyellow;
            }
            h1 {
                color: #333;
            }
            label {
                display: block;
                margin: 20px auto;
                width: 200px;
                height: 80px;
                line-height: 80px;
                border-radius: 10px;
                background-color: #fff;
                box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
                cursor: pointer;
            }
            label:hover {
                transform: scale(1.05);
                box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);
            }
            input[type="radio"] {
                display: none;
            }

        </style>
        <br>
        <br>
        <h1>Registrar Funcionario</h1>
        <p>Por favor rellene los campos correspondientes</p>
        <form action="./FuncionarioServlet" method="POST">
            <table style="margin: 0 auto;">
                <tr>
                    <td>Cedula Id</td>
                    <td><input type="text" name="cedula" value="${Usuarios.cedula}" /></td>
                </tr>
                <tr>
                    <td>Usuario</td>
                    <td><input type="text" name="nombre" value="${Usuarios.nombre}" /></td>
                </tr>
                <div>
                    <img src="https://pps.whatsapp.net/v/t61.24694-24/325965715_847637112996831_5881414437490173278_n.jpg?ccb=11-4&oh=01_AdTYA_2VGgXQD9HfneFURu70dHUhnRfFTisDPAsmVRoPQQ&oe=6484814A" width="50"  height="50" style="position: absolute; right: 20%" alt="Logo de GUSMIFEKI S.A.S">
                </div> 
                <tr>
                    <td>Correo</td>
                    <td><input type="email" name="email" value="${Usuarios.email}" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" value="${Usuarios.password}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Registrar" />


                        <p> Ya tengo cuenta <a href="http://localhost:8080/UTactico-war/LoginFuncionario.jsp"><input type="button" value="Iniciar sesion" style="background-color: aquamarine ;border-radius: 42%"></a></p>
                    </td>
                </tr>
            </table>
        </form>
        <br>



        <footer>     
            <br>
            <br>
            <br>
            <br>


            Correo Gusmifeki@gmail.com
            <br>
            Contactanos 3224195635
            <br>
            Copyright 2023©   
            <br>
        </footer>


         </body>
</html>