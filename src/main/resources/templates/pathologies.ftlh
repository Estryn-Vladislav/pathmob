<!DOCTYPE html>
<html lang="en">
<#if pathologies??>
<#list pathologies as p>
<head>
    <meta charset="UTF-8">
    <title> ${p.type.type} </title>
</head>
<body>
<form method="get" action="/">
    <input type="submit" value="go back to types">
</form>
<h1>${p.type.type}</h1>
<table border="1">
    <tr>
        <td>Pathology</td>
        <td>Type</td>
        <td>Model</td>
        <td>Cut</td>
        <td>Hemodynamic</td>
    </tr>
    <tr>
        <#foreach s in p.subtypes>
        <td> ${p.name} </td>
        <#if s.subtype??>
            <td> ${s.subtype} </td>
        <#else >
            <td>-</td>
        </#if>
        <#if s.model??>
            <td> ${s.model} </td>
        <#else >
            <td>-</td>
        </#if>
        <#if s.cut??>
            <td> ${s.cut} </td>
        <#else >
            <td>-</td>
        </#if>
        <#if s.hemodynamic??>
            <td> ${s.hemodynamic} </td>
        <#else >
            <td>-</td>
        </#if>
    </tr>
    </#foreach>
    </#list>
    </#if>
</table>
<form method="get" action="/pathologies/add">
    <input type="submit" value="add new">
</form>
</body>
</html>