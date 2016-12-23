<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>c:forEach Tag Example </title>
</head>
<body>
<h2>hello ${userList}</h2>
<c:forEach var="user"  items="${userList}" varStatus="id" >
    <tr>  
             <td>  
                <s:property value="#vs.index+1"/>  
             </td>  
             <td align = "center">${user.id}</td> 
             <td align = "center">${user.username}</td>  
         </tr>  
</c:forEach>
</body>
</html>