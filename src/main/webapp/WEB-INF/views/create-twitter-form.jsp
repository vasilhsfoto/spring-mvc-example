<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>

	<h2>
		submit your twitter in the below form
	</h2>
	
	<sf:form method="POST" 
			 modelAttribute="twitter"
			 enctype="multipart/form-data">
		<table>
			<tr>
				<th> <sf:label path="username">username-vassilis: </sf:label> </th>
				<td> <sf:input path="username" /> </td>
			</tr>
			
			<tr>
				<th> <sf:label path="text">twitter: </sf:label> </th>
				<td> <sf:input path="text" /> </td>
			</tr>
		
			<tr>
				<th> <sf:label path="password">password: </sf:label> </th>
				<td> <sf:password path="password" /> </td>
			</tr>
			
			<tr>
				<th> <sf:label path="updatedWithEmail">send me email address: </sf:label> </th>
				<td> <sf:checkbox path="updatedWithEmail" /> </td>
			</tr>
			
			<tr>
				<th> <sf:label path="dbName">select DB : </sf:label> </th>
				<td> <sf:select path="dbName" items="${db_names}"/> </td>
			</tr>
			
			<tr>
				<th> <label> upload a file: </label> </th>
				<td> <input type="file" name="file"/> </td>
			</tr>
		
			<tr>
		        <td colspan="2">
		            <input type="submit" value="spit it out"/>
		        </td>
    		</tr>
		</table>
	</sf:form>