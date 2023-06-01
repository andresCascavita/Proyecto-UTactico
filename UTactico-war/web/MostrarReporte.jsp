<%-- 
    Document   : MostrarReporte
    Created on : 31/05/2023, 01:33:47 PM
    Author     : ANDRES CASCAVITA
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Reporte</title>
    </head>
    <body>
        <form  action="./MostrarReportes" method="POST">


            <style>
                body {
                    font-family: cursive;
                    text-align: center;
                    background-color: aliceblue;
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


            <table border="0" style="margin: 0 auto; background-color: honeydew;">
                <caption style="background-color: blue; color: #ffffff" >REPORTES REGISTRADOS</caption>


                <th style="padding: ">ID</th>
                <th style="padding: "> Tipo Actor Vial </th>
                <th style="padding: "> Localidad </th>
                <th style="padding: "> Barrio </th>
                <th style="padding: "> Zona </th>
                <th style="padding: "> Señales </th>
                <th style="padding: "> Tipo Suelo </th>
                <th style="padding: "> Equipamiento </th>
                <th style="padding: "> Tipo señal </th>
                <th style="padding: "> Fecha </th>
                    <c:forEach items="${allReportes}" var="repo">
                    <tr>
                        <td>${repo.id}</td>
                        <td>${repo.tipoactorvial}</td>
                        <td>${repo.localidad}</td>
                        <td>${repo.barrio}</td>
                        <td>${repo.zona}</td>
                        <td>${repo.senales}</td>
                        <td>${repo.tiposuelo}</td>
                        <td>${repo.equipamiento}</td>
                        <td>${repo.tiposenal}</td>
                        <td>${repo.fecha}</td>
                    </tr>
                </c:forEach> 
            </table>
        </form>

    </body>

    <footer>    


        <br>
        <br>
        <br>
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