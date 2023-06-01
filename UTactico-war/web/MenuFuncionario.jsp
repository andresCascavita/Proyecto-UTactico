<%-- 
    Document   : MenuFuncionario
    Created on : 31/05/2023, 03:05:32 PM
    Author     : ANDRES CASCAVITA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Opciones Toma de decisiones</title>
    
 <style>
      body {
        font-family: cursive;
        text-align: center;
  background-color: yellowgreen;
      }
      h1 {
          color: #fff;
      }
     
     
      input[type="radio"] {
        display: none;
      }
    </style>
  </head>
  <body>
    <h1>Toma de decisiones</h1>
    <form>
        <br>
 
        <a href="http://localhost:8080/UTactico-war/BorrarReporteServlet"><input type="button" value="Borar Reporte" style="background-color: #fff;margin: 20px auto;width: 200px;height: 80px;line-height: 80px; border-radius: 10px;" ></a>
        <br>
        <a href="http://localhost:8080/UTactico-war/EstadisticaServlet"><input type="button" value="Agregar Estadisticas" style="background-color: #fff; margin: 20px auto;width: 200px;height: 80px;line-height: 80px; border-radius: 10px;"></a>

      
        <a href="http://localhost:8080/UTactico-war/DecisionServlet"><input type="button" value="Tomar decisiones"  style="background-color: #fff;margin: 20px auto;width: 200px;height: 80px;line-height: 80px; border-radius: 10px;"></a>   
   
    </form>
  </body>
  
  <br>
   <br>
    <br>
    
  <footer>   
      <a href="index.html"><input type="button" value="Salir" style="height:40px; width:50px; position: relative; right: 47%; border-radius: 40%;background-color: orangered"></a>
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
