<%-- 
    Document   : Estadistica
    Created on : 31/05/2023, 03:25:39 PM
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



        <h1>Estadistica </h1>
        <p>Esta estadistica añade los incidentes por Mes <p>


        <form action="./EstadisticaServlet" method="POST">

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

            <BR>
            <br>
            <table style="position: absolute ; left: 10% "> 
                <tr>
                    <td><label for="mes">Ingrese el Mes:</label></td>
                    <td> <input type="datetime" name="mese" value="${estadisticas.mese}" id="mes" required><br><br></td>

                </tr>
                <tr>
                    <td>  <label for="barrio">Barrio:</label></td>
                    <td>   <input type="text" name="barrioe" value="${estadisticas.barrioe}" id="barrio" required><br><br></td>
                </tr>
                <tr>
                    <td> <label for="zona">Zona:</label></td>
                    <td>  <input type="text" name="zonae" value="${estadisticas.zonae}" id="zona" required><br><br></td>
                </tr> 
                <tr>
                    <td> <label for="localidad">Localidad:</label></td>
                    <td>  <input type="text" name="localidade" value="${estadisticas.localidade}" id="localidad" required><br><br></td>
                </tr>
                <tr>
                    <td>  <label for="numeroaccidentes">Numero de accidentes :</label> </td>
                    <td>   <input type="number" name="numeroaccidentese" value="${estadisticas.numeroaccidentese}" id="numeroaccidentes" required><br><br> </td>

                </tr>
            </table>
            <table style="position: absolute;right: 12%">
                <tr>
                    <td> <label for="tipoactorinvolucrado">Actores involucrados:<br>(ciclistas,peatones o conductores)</label></td>
                    <td> <input type="text" name="tipoactorinvolucradoe" value="${estadisticas.tipoactorinvolucradoe}" id="tipoactorinvolucrado" required><br><br></td>
                </tr>
                <tr>
                    <td>  <label for="personasquetransitan">Cantidad de personas que transitan el lugar:</label></td>
                    <td>   <input type="number" name="personasquetransitane" value="${estadisticas.personasquetransitane}" id="personasquetransitan" required><br><br></td>
                </tr>
                <tr>  

                    <td>  <label for="heridos">Cantidad de heridos:</label> </td>
                    <td>   <input type="number" name="heridose" value="${estadisticas.heridose}" id="heridos" required><br><br> </td>
                </tr>
                <tr>
                    <td><label for="fallecidos" >Cantidad de fallecidos:</label> </td>
                    <td>  <input type="number" name="fallecidose" value="${estadisticas.fallecidose}" id="fallecidos" required><br><br></td>
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


            <input type="submit" name="action" value="Generar Estadistica" style="background-color:   aquamarine ;border-radius: 35%">
            <br>
            <br>
            <br>

            <table border="1" style="margin: 0 auto;">
                <th>ID</th>
                <th>Ingrese el mes</th>
                <th>Zona</th>
                <th>Barrio</th>
                <th>Ciudad</th>
                <th>Localidad</th>
                <th>Transito de personas</th>
                <th>Numero de accidentes</th>
                <th>Heridos</th>
                <th>Fallecidos</th>
                <th>Fecha</th>
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
        </form>

    </body>
</html>
