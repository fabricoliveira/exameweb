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
					<s:if test="idExame == null">
						<s:text name="global.adicionar.novo.exame" />
					</s:if>
					<s:else>
						<s:text name="global.alterar.exame" />
					</s:else>
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
			<div id="editarForm">
				<s:form action="salvar" method="post" class="col s12">
					<div class="row">
						<s:hidden name="idExame" id="idExame" value="%{idExame}" />
						
						<div class="input-field col s6">
							<s:select key="global.paciente"
								  name="paciente" 
								  id="paciente"
								  list="pacientes"
								  listKey="id"
								  listValue="nome"
								  headerKey="null"
								  headerValue="Selecione um paciente"
								  />
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
							 		  headerValue="Selecione um médico"
							 		  />
							<label for="medico">Médico</label>
						</div>
					</div>
						
					<div class="row">
						<div class="input-field col s6">
							<s:textfield id="data" name="data" type="date" key="global.data" />
							<label class="active" for="data">Data</label>
						</div>
						<div class="input-field col s6">
							<s:textfield id="hora" name="hora" type="time" class="timepicker" key="global.hora" />
							<label class="active" for="hora">Hora</label>
						</div>
					</div>
						
					<div class="row">
						<div class="input-field col s12">
							<s:textarea id="diagnostico" name="diagnostico" key="global.diagnostico" cols="30" rows="7" class="materialize-textarea" />
							<label for="diagnostico">Diagnóstico</label>
						</div>
					</div>
					
					<s:submit key="global.salvar" class="btn waves-effect waves-light" />
						
				</s:form>
			</div>
		</div>
		
		<div class="row">
			<div class="col s12">
				<a href="index">
					<button class="btn waves-effect waves-light">
						<s:text name="global.cancelar" />
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
		$('#diagnostico').trigger('autoresize');
	</script>
</html>