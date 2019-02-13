<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="javax.servlet.http.HttpSession"%>

        
<%
     String user = (String) request.getSession().getAttribute("nombre");
     
        if(user==null){
            response.sendRedirect("index.html");
        }
%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Menu</title>
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>

<body>
    <div id="wrapper">
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Menu</a>
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                  
                        <li class="divider"></li>
                        <li><a href="/inventario/inicio/index.html/index.html"><i class="fa fa-sign-out fa-fw"></i> Salir</a>
                        </li>
                       
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
        </nav>
        <!--/. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                           
                    <li>
                        <a href="mod_inventario/categorias/listar.jsp"><i class="fa fa-edit"></i> Categorias</a>
                    </li>
                   <li>
                        <a href="mod_inventario/clientes/listar.jsp"><i class="fa fa-edit"></i> Clientes</a>
                    </li>
                    <li>
                        <a href="mod_inventario/productos/listar.jsp"><i class="fa fa-edit"></i> Productos</a>
                    </li>
                    <li>
                        <a href="mod_inventario/proveedores/listar.jsp"><i class="fa fa-edit"></i> Proveedores</a>
                    </li><li>
                        <a href="mod_inventario/ordenes/listar.jsp"><i class="fa fa-edit"></i> Ordenes</a>
                    </li><li>
                        <a href="mod_inventario/venta/listar.jsp"><i class="fa fa-edit"></i> Ventas</a>
                    </li>
                    <li>
                        <a href="mod_inventario/usuarios/listar.jsp"><i class="fa fa-edit"></i> Usuarios</a>
                    </li>
                    <li>
                        <a href="mod_inventario/roles/listar.jsp"><i class="fa fa-edit"></i> Roles</a>
                    </li>
                    <li>
                        <a href="mod_inventario/paginas/listar.jsp"><i class="fa fa-edit"></i> Paginas</a>
                    </li>

     
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <!--<div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-header">
                            Variedades Carlita</small>-->
                            <img src="img/menu2.jpg" alt=""/>
                        <!--</h1>
                    </div>
                <!--</div>-->
                <!-- /. ROW  -->     
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
    <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>



</body>

</html>