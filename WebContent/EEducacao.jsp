<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "java.util.ArrayList, services.SEEducacao, model.Encarregado" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Dados do Encarregado Educa&ccedil;&atilde;o</h1>
	<form action="HEEducacao" method="post">
		<label>Nome
			<input type="text" name="nome" />	
		</label>
		<label>Data Nascimento
			<input type="text" name="data_nascimento" />	
		</label>
		<label>Cartao Cidad&atilde;o
			<input type="text" name="ccidadao" />	
		</label>
		<label>Contacto Principal
			<input type="text" name="telefoneP" />
		</label>
		<label>Contacto Secundario
			<input type="text" name="telefoneS" />
		</label>
		<input type="submit" value="Enviar" />
	</form>
	
	<table>
		<tr>
			<th>Nome</th>
			<th>Data Nascimento</th>
			<th>Cartao Cidadao</th>
			<th>Telefone Principal</th>
			<th>Telefone Secundario</th>
		</tr>
		
		<%	
			ArrayList arC = (ArrayList) request.getAttribute("listaEE");
			
			for(int i=0; i<arC.size(); i++){
				Encarregado e = (Encarregado) arC.get(i);
				out.append("<tr><td>" + e.getNome()+"</td><td>"+e.getContactoP()+"</td></tr>");
			}
		
		%>

</body>
</html>