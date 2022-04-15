<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="dist/css/css-bootstrap/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
    <jsp:useBean id="myBean" class="hello.MessageBean"/>
    <jsp:useBean id="CumprimentoBean" class="hello.CumprimentoBean"/>
    <jsp:useBean id="TratamentoBean" class="hello.TratamentoBean"/>
    <jsp:useBean id="FaixaEtariaBean" class="hello.FaixaEtariaBean"/>
    <% String lang = request.getParameter("lang"); %>
    <% String trat = request.getParameter("tratamento"); %>
    <% String idade = request.getParameter("idade"); %>
    <div class="container" style="margin-top: 50px;"> <h1>SayHello.jsp</h1>
        <jsp:setProperty name="CumprimentoBean" property="msg" value="<%=lang%>"/>
        <div class="form-group mt-4">
            <h2><jsp:getProperty name="CumprimentoBean" property="msg"/></h2>
        </div>

        <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
        <jsp:setProperty name="TratamentoBean" property="lang" value="<%=lang%>"/>
        <jsp:setProperty name="TratamentoBean" property="msg" value="<%=trat%>"/>

        <div class="form-group mt-4">
            <jsp:getProperty name="myBean" property="msg"/>, <jsp:getProperty name="TratamentoBean" property="msg"/> <%=request.getParameter("nome")%>!
        </div>

        <jsp:setProperty name="FaixaEtariaBean" property="msg" value="<%=idade%>"/>
        <div class="form-group mt-4">
            Você é considerado <jsp:getProperty name="FaixaEtariaBean" property="msg"/>
        </div>
    </div>

    <script src="dist/jquery/jquery-3.5.1.min.js"></script>
    <script src="dist/jquery/jquery.mask.min.js"></script>
    <script src="dist/popper/popper.js"></script>
    <script src="dist/js/js-bootstrap/bootstrap.min.js"></script>
</body>
</html>
