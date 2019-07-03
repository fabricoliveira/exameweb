<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<s:select key="global.paciente"
		  name="paciente" 
		  id="paciente"
		  list="pacientes"
		  listKey="id"
		  listValue="nome"
		  headerKey="null"
		  headerValue="Todos" />

<s:select key="global.medico"
 		  name="medico"
 		  id="medico"
 		  list="medicos"
 		  listKey="id"
 		  listValue="nome"
 		  headerKey="null"
 		  headerValue="Todos" />