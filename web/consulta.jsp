<%-- 
   
    ///////////////////////////////////////////////////////////////
    //                                                           //
    //            CÓDIGO TESTE DA PÁGINA CONSULTA                //
    //        APENAS TESTE, PODEM ATUALIZAR À VONTADE            //
    //                                                           //
    ///////////////////////////////////////////////////////////////
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                            <th>Estrelas</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="hotel" items="${consulta}">
                            <tr>
                                <td>${hotel.nome}</td>
                                <td>${hotel.qtdEstrela}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </c:otherwise>
            </c:choose>
    </body>
</html>
