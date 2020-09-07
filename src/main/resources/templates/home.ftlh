<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Home </title>
</head>
<body>
<#if types??>
    <#foreach t in types>
        <form method="get" action="/pathologies/${t.id}">
            <input type="submit" value="${t.type}">
        </form>
    </#foreach>
<#else>
    No data is available
</#if>
</body>
</html>