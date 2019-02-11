<%-- 
    Document   : editar
    Created on : 25-ene-2019, 17:02:22
    Author     : MI PC
--%>

<%@page import="ReglasDeNegocio.Sg_usuario"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
   Sg_usuario sg_usuario= new Sg_usuario();
%>

<%
    
    try {        
        String nombre1= request.getParameter("nombre");
        String clave1= request.getParameter("clave");

        //String claveencritada=StringEncrypter.StringEncrypter(clave1);
        //out.print("<script>alert("+claveencritada+");</script>");
        
        sg_usuario= Sg_usuario.sg_usuarios_buscar_credenciales(nombre1, clave1);
        
        if(sg_usuario!=null){
            session.setAttribute("nombre",sg_usuario.getNombre_usuario());
            response.sendRedirect("Menu.jsp");
            //out.println("<script>  location.replace('index.jsp');</script>");
            
        }else{
            out.println("<script>  location.replace('login.jsp');</script>");
            if(request.getParameter("cerrar")!=null){
            session.invalidate();            
            }
        }
        } catch (Exception e) {
        }
   
   
%>
