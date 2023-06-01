<%-- 
    Document   : UsuarioOFuncionario
    Created on : 31/05/2023, 12:16:47 PM
    Author     : ANDRES CASCAVITA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <br>
    <title>Tipo de persona</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f2f2f2;
        }
        h1 {
            color: #333;
        }
        button {
            display: inline-block;
            margin: 20px;
            width: 150px;
            height: 150px;
            border: none;
            border-radius: 50%;
            background-repeat: no-repeat;
            background-position: center;
            background-size: 80%;
            cursor: pointer;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        }
        button:hover {
            transform: scale(1.05);
            box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);
        }     
        #natural {
            background-image: url('https://www.lesdebrouillardes.be/themes/debrouillardes/images/user.svg');
        }
        #juridica {
            background-image: url('https://th.bing.com/th/id/OIP.M-hzoXpSBjWJdPRDIRUjcwHaEj?pid=ImgDet&rs=1');
        }

    </style>
</head>
<body>

    <h1>Seleccione el tipo de Usuario con el que se quiere loguear</h1>
    <button id="natural" onclick="location.href = 'http://localhost:8080/UTactico-war/LoginUsuario.html';"></button>
    <button id="juridica" onclick="location.href = 'http://localhost:8080/UTactico-war/LoginFuncionario.jsp';"></button>
</body>


<h2>Usuario  o   Funcionario</h2>

<br>
<br>
<br>
<br>
<br>
<br>
</body
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
