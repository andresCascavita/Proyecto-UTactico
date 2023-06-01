<%-- 
    Document   : MenuUsuario
    Created on : 31/05/2023, 01:12:13 PM
    Author     : ANDRES CASCAVITA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title style="color: greenyellow">Menu usuario </title>
    <a href="index.html"><input type="button" value="Atras" style="height:40px; width:50px; position: relative; right: 47%; border-radius: 40%;background-color: red"></a>
    <style>
        body {
            font-family: cursive;
            text-align: center;
            background-color: #33cc00;
        }
        h1 {
            color: #fff;
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
</head>
<body>
    <h1>Menu de usuario</h1> 
    <br>
    <p>Bienvenidos a la plataforma de Gusmifeki aqui podras reportar incidentes y ver los 
        <br> reportes que se han echo por otros usuarios.</p>

    <br>


    <br>
    <a style="background-color: activeborder"href="http://localhost:8080/UTactico-war/ReporteServlet"><input type="button" value="Hacer Reportes" style="background-color: #fff; margin: 20px auto;width: 200px;height: 80px;line-height: 80px; border-radius: 10px;"></a>   

    <a href="http://localhost:8080/UTactico-war/MostrarReportes"><input type="button" value="Ver Reportes" style="background-color: #fff;margin: 20px auto;width: 200px;height: 80px;line-height: 80px; border-radius: 10px;" ></a>
    <a href="index.html"><input type="button" value="Salir" style="height:40px; width:50px; position: relative; right: 47%; border-radius: 40%;background-color: orangered"></a>
    <br>

</body>


<br>
<br>

<footer>     
    <div>
        <img src="https://pps.whatsapp.net/v/t61.24694-24/325965715_847637112996831_5881414437490173278_n.jpg?ccb=11-4&oh=01_AdTYA_2VGgXQD9HfneFURu70dHUhnRfFTisDPAsmVRoPQQ&oe=6484814A" width="50"  height="50" style="position: absolute; right: 20%" alt="Logo de GUSMIFEKI S.A.S">
    </div> 
    Correo Gusmifeki@gmail.com
    <br>
    Contactanos 3224195635
    <br>
    Copyright 2023©   
    <br>
</footer>
</html>
