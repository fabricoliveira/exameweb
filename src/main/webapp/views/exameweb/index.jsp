<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title><s:text name="global.exame.web" /></title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col s12">
				<h3>
					<s:text name="global.buscar.exames" />
				</h3>
			</div>
		</div>
		
		<s:if test="hasActionErrors()">
			<div class="row">
				<div class="col s12">
					<div class="card red accent-1">
						<div class="card-content white-text">
							<p>
								<s:actionerror/>
							</p>
	        			</div>
		        	</div>
		        </div>
			</div>
		</s:if>
		
		<div class="row">
			<s:form id="buscarForm" action="buscar" method="post" class="col s12">
				<div class="row">
					<div class="input-field col s6">
						<s:select key="global.paciente" 
								  name="paciente"
								  id="paciente"
								  list="pacientes"
								  listKey="id"
								  listValue="nome"
								  headerKey="null"
								  headerValue="Todos" />
						<label for="paciente">Paciente</label>
					</div>
					
					<div class="input-field col s6">
						<s:select key="global.medico" 
								  name="medico"
								  id="medico"
								  list="medicos" 
								  listKey="id" 
								  listValue="nome" 
								  headerKey="null"
								  headerValue="Todos" />
						<label for="medico">Médico</label>
					</div>
				</div>

				<s:submit class="waves-effect waves-light btn" key="global.buscar" />

			</s:form>
		</div>

		<s:if test="exames">
			<div class="row">
				<div id="resultados" class="col s12">
					<br>
					<h5><s:text name="global.exames.encontrados" /></h5>
					<hr>
					<s:if test="exames != null && !exames.isEmpty()">
						<s:include value="lista_exames_encontrados.jsp" />
					</s:if>
					<s:else>
						<br>
						
						<div class="row">
							<div class="col s12">
								<div class="card orange lighten-5">
									<div class="card-content">
										<span class="card-title">
											<s:text name="global.exames.nao.encontrados" />
										</span>
				        			</div>
					        	</div>
					        </div>
						</div>
						
					</s:else>
				</div>
			</div>
		</s:if>
		
		<div class="row">
			<div class="col s12">
				<a href="adicionar">
					<button class="waves-effect waves-light btn">
						<s:text name="global.adicionar.novo.exame" />
					</button>
				</a>
			</div>
		</div>
	</div>

	<!--Import jQuery before materialize.js-->
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>

</body>
	<script>
		$(document).ready(function() { $('select').material_select(); });
	</script>
</html>