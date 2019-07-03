<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="highlight responsive-table">
	<thead>
		<tr>
			<th><s:text name="global.paciente" /></th>
			<th><s:text name="global.idade" /></th>
			<th><s:text name="global.medico" /></th>
			<th><s:text name="global.crm" /></th>
			<th><s:text name="global.data" /></th>
			<th><s:text name="global.hora" /></th>
			<th><s:text name="global.diagnostico" /></th>
			<th colspan="2"></th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="exames" var="exame">
			<tr>
				<td><s:property value="#exame.paciente.nome" /></td>
				<td><s:property value="#exame.paciente.idade" /></td>
				<td><s:property value="#exame.medico.nome" /></td>
				<td><s:property value="#exame.medico.crm" /></td>
				<td><s:property value="#exame.data" /></td>
				<td><s:property value="#exame.hora" /></td>
				<td><s:property value="#exame.diagnostico" /></td>
				<td>
					<s:form action="alterar">
						<s:hidden id="idExame" name="idExame" value="%{#exame.id}" />
						
						<button class="btn waves-effect waves-light" type="submit">
							<i class="material-icons">edit</i>
						</button>
						
					</s:form>
				</td>
				<td>
					<s:form action="deletar">
						<s:hidden id="idExame" name="idExame" value="%{#exame.id}"/>
						<button class="btn waves-effect waves-light" type="submit">
							<i class="material-icons">delete_forever</i>
						</button>
					</s:form>
				</td>
			</tr>
		</s:iterator>
	</tbody>
</table>
