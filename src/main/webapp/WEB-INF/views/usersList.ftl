<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Users list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
<#list users as user>
    <tr>
        <th><a href="/user/${user.id}">${user.id}</a></th>
        <th>${user.name}</th>
        <th>${user.email}</th>
        <th>${user.age}</th>
    </tr>
</#list>
</table>

</body>
</html>