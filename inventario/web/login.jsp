<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/estilos_1.css">
</head>
<body>
    <div class="contenedor-form">
        <div class="toggle">
            <span> Crear Cuenta</span>
            
        </div>
        
        <div class="formulario">
         <h1 align="center" >
             <a>  <h1 align="center">Variedades Carlita</small></h1></a>
            </h1>
           
 
				<form role="form" action="procesalogin.jsp" target="sessionJsp">
					<!--span class="login100-form-title p-b-120">
						Bienvenido
					</span-->					
					<div class="wrap-input100 validate-input m-t-10 m-b-35" data-validate = "Ingrese usuario">
						<input class="input100" type="text" name="nombre" placeholder="Ingrese su Usuario" >
						<span class="focus-input100" data-placeholder="Nombre usuario"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-50" data-validate="Ingrese contraseña">
						<input class="input100" type="password" name="clave" placeholder="Ingrese su Contraseña" >
						<span class="focus-input100" data-placeholder="Contraseña"></span>
					</div>
					
                                        <h3 align="center">
                                            <button onclick= "location= 'btn_guardar'"/>Ingresar </button>
				        </h3>

				
				</form>			
                            </div>

     <div class="formulario">
            <h2>Crea tu cuenta</h2>
            <form method="POST" action="procesa_nuevo.jsp">
                <input type="text" class="form-control" placeholder="Ingrese Un Nombre"  required id="nombre_usuario" name="nombre_usuario">
                <input type="password" class="form-control" placeholder="Ingrese Una Contraseña" required id="contrasenia" name="contrasenia">                
                <input type="text" class="form-control" placeholder="Cedula" required id="identificacion" name="identificacion">
              
                
            
                    <h4 align="center">
                               <button  id="btn_guardar" name="btn_guardar" type="submit" class="btn btn-primary" >Guardar</button>
             
                    </h4>
                    <h4 align="center">
                    <button  id="btn_regresar" name="btn_regresar" type="submit" class="btn btn-primary" >Regresar</button>  
                             
                    </h4>
               
               
            </form>
        </div>
        
    </div>
    <script src="js/jquery-3.1.1.min.js"></script>    
    <script src="js/main.js"></script>
</body>
</html>