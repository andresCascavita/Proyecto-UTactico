<%-- 
    Document   : Decision
    Created on : 31/05/2023, 04:16:35 PM
    Author     : ANDRES CASCAVITA
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Estadistica</title>
    </head>
    <body>
        <style>
            body {
                font-family: cursive;
                text-align: center;
                background-color: darkgrey;
            }
            h1 {
                color:  aquamarine
            }



        </style>



        <h1>Decision </h1>
        <p>Esta es la toma de decisiones <p>


        <form action="./DecisionServlet" method="POST">

            <table border="0" style="margin: 0 auto; background-color: honeydew;">
                <caption style="background-color: blue; color: #ffffff" >ESTADISTICAS REGISTRADOS</caption>

                <th style="padding: ">ID</th>
                <th style="padding: "> Mes </th>
                <th style="padding: "> Zona </th>
                <th style="padding: "> Barrio </th>
                <th style="padding: "> Localidad </th>
                <th style="padding: "> Tipo Actor Involucrado </th>
                <th style="padding: "> Personas Que Transitan </th>
                <th style="padding: "> Numero Accidentes </th>
                <th style="padding: "> Heridos </th>
                <th style="padding: "> Fallecidos </th>
                <th style="padding: "> Fecha </th>
                    <c:forEach items="${allEstadisticas}" var="est">
                    <tr>
                        <td>${est.ide}</td>
                        <td>${est.mese}</td>
                        <td>${est.zonae}</td>
                        <td>${est.barrioe}</td>
                        <td>${est.localidade}</td>
                        <td>${est. tipoactorinvolucradoe}</td>
                        <td>${est.personasquetransitane}</td>
                        <td>${est.numeroaccidentese}</td>
                        <td>${est.heridose}</td>
                        <td>${est.fallecidose}</td>
                        <td>${est.fechae}</td>
                    </tr>
                </c:forEach> 
            </table>

            <BR>
            <br>
            <table style="position: absolute ; left: 10% "> 
                <tr>
                    <td>  <label for="id">ID:</label></td>
                    <td>   <input type="text" name="id" value="${decision.id}" id="id" required><br><br></td>
                </tr>
                <tr>

                <tr>
                    <td>  <label for="senalizacion">Señalizacion:</label></td>
                    <td>   <input type="text" name="senalizacion" value="${decision.senalizacion}" id="senalizacion" required><br><br></td>
                </tr>
                <tr>
                    <td> <label for="decision">Decision:</label></td>
                    <td>  <input type="text" name="decision" value="${decision.decision}" id="decision" required><br><br></td>
                </tr> 


            </table>

            <br>
            <br>
            <br>
            <br>   
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>


            <input type="submit" name="action" value="Tomar decision" style="background-color:   aquamarine ;border-radius: 35%">
            <br>
            <br>
            <table border="1" style="margin: 0 auto;">
                <th>ID</th>
                <th>Señalizacion</th>
                <th>Decision</th>
                <th>Fecha</th>

                <c:forEach items="${allDecision}" var="des"> 
                    <tr>
                        <td>${des.id}</td>
                        <td>${des.senalizacion}</td>
                        <td>${des.decision}</td>
                        <td>${des.fecha}</td>


                    </tr>
                </c:forEach>
            </table> 
        </form>

    </body>
</html>

