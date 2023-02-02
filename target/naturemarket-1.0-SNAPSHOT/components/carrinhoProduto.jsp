
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:useBean id="produto" class="edu.ucan.naturemarket.bean.ProdutoBean" type="edu.ucan.naturemarket.bean.ProdutoBean"/>
<div class="body">
    <h2>Categoria de Produtos</h2>
    <div class="search-section">
        <div class="search-box">

            <input type="search" name="search" id="search" placeholder="Pesquise aqui o produto que desejas">
        </div>
    </div>

    <div class="products">
        <c:forEach var="item" items="${produto.produtos}">
        <div class="product"></div>
        </c:forEach>
    </div>
</div>