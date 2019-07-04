<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="input-field col s6">
	<s:select key="global.paciente"
		  name="paciente" 
		  id="paciente"
		  list="pacientes"
		  listKey="id"
		  listValue="nome"
		  headerKey="null"
		  headerValue="Selecione um paciente" />
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
	 		  headerValue="Selecione um médico" />
	<label for="medico">Médico</label>
</div>