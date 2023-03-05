<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color:red;text-align:center">Task Creation</h1>
<form:form modelAttribute="todo">
<table border="2" bgcolor="cyan" align="center">
<tr>
  <td>Task name::</td>
  <td><form:input path="taskname"/></td>
</tr>

<tr>
  <td>Duration::</td>
  <td><form:input path="duration"/></td>
</tr>

<tr>
  <td>Start Date::</td>
  <td><form:input type="date" value="2023-01-01" path="startdate"  /></td>
</tr>
 
<tr>
  <td>End Date::</td>
  <td><form:input type="date" value="2023-01-01" path="enddate"/></td>
</tr>

<tr>
  <td>Task Description::</td>
  <td><form:input path="taskdescription"/></td>
</tr>

<tr>
  <td colspan="2" align="center"><input type="submit" value="task Creation"/></td>
</tr>
</table>
  
</form:form>

