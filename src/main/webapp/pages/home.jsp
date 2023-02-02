<%-- 
    Document   : home
    Created on : Feb 1, 2023, 12:55:53 PM
    Author     : ismael
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nature Market</title>
        <link rel="stylesheet" href="assets/style/css/style.css">
       
        <script src="assets/js/jquery-3.6.1.min.js"></script>
        <script src="assets/js/main.js"></script> 
        <script src="assets/js/cart.js"></script> 
    </head>
    <body>
        <jsp:include page="/fragments/header.jspf" flush="true" />	
        <jsp:include page="/components/categoriaProduto.jsp" flush="true" />	
        <jsp:include page="/fragments/footer.jspf" flush="true" />
    </body>
</html>
