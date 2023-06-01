<%-- 
    Document   : Reporte
    Created on : 31/05/2023, 01:28:48 PM
    Author     : ANDRES CASCAVITA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Reporte de Incidente</title>
    </head>
    <body>
        <style>
            body {
                font-family: cursive;
                text-align: center;
                background-color: cadetblue;
            }
            h1 {
                color: #f0f0f0;
            }
        </style>
        <h1>Reporte de Incidentes</h1>
        <br>
     
        <form  action="./ReporteServlet" method="POST">
            
            <label for="transporte">Actor Vial:</label>
            <select type="text" name="tipoactorvial" value="${reporteincidente.tipoactorvial}"><br><br>
                <option value="">Elija un actor</option>
                <option value="Ciclista">Ciclista</option>
                <option value="Peaton">Peaton</option>
                <option value="Conductor">Conductor</option>
            </select><br><br>
            
            <label for="localidad">Ubicación - Localidad:</label>
            <input type="text" name="localidad" value="${reporteincidente.localidad}"><br><br>

            <label for="barrio">Ubicación - Barrio:</label>
            <input type="text" name="barrio" value="${reporteincidente.barrio}"><br><br>

            <label for="zona">Ubicación - Zona:</label>
            <input type="text" name="zona" value="${reporteincidente.zona}"><br><br>


            <label for="suelo">Tipo de Uso del Suelo:</label>
             <select name="tiposuelo" value="${reporteincidente.tiposuelo}" >
                <option value="">Selecciona una opción</option>
                <option value="Comercial">Comercial</option>
                <option value="Residencial">Residencial</option>
                <option value="Industrial">Industrial</option>
                </select><br><br>
 
            <label for="equipamiento">Equipamiento y Espacio Público:</label>
            <input type="text" name="equipamiento" value="${reporteincidente.equipamiento}"><br><br>

            <label for="senales">Existencia de Señales de Tránsito:</label>
            <select name="senales" value="${reporteincidente.senales}" >
                <option value="">Selecciona una opción</option>
                <option value="Si hay">Sí</option>
                <option value="No hay">No</option>
            </select><br><br>

            <label for="tiposenal">Tipo de señal (si no hay, seleccione Ninguna)</label>
            <select name="tiposenal" value="${reporteincidente.tiposenal}" >
                <option value="">Selecciona una opción</option>
                <option value="Vertical Preventiva"> Vertical Preventiva</option>
                <option value="Reglamentaria">Reglamentaria</option>
                <option value="Informativa">Informativa</option>
                <option value="Transversal">Transversal</option>
                <option value="Ninguna">niguna</option>
            </select><br><br>
            
                <td colspan="2">
            <input type="submit" name="action" value="Generar Reporte" style="background-color: #33cc00; border-radius: 35%" location.href="http://localhost:8080/ProyectoU_Tactico-war/verReportes.jsp" >
             
        </form>
        <br>
        
    </body>
</html>