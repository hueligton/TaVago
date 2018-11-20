<%-- 
   
    ///////////////////////////////////////////////////////////////
    //                                                           //
    //            CÓDIGO TESTE DA PÁGINA CONSULTA                //
    //        APENAS TESTE, PODEM ATUALIZAR À VONTADE            //
    //                                                           //
    ///////////////////////////////////////////////////////////////
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/consulta.css"/>
        <title>Consulta JSP Page</title>
    </head>
    <body>
        
        <c:choose>
            <c:when test="${empty consulta}"> 
                <p>- N&atilde;o h&aacute; hoteis </p>
            </c:when>
            <c:otherwise>

                <table>
                    <caption>Resultado da busca</caption>
                    <thead>
                        <tr>
                            <th>Nome</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="consulta" items="${consulta}">
                            <tr>
                                <td>${consulta}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </c:otherwise>
            </c:choose>
    </body>
</html>
