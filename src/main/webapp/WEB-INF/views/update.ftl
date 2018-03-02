<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    id:<br>
    <input title="Id" type="text" name="id" value=${user.id}>
    <br>Name:<br>
    <input title="Name" type="text" name="name" value=${user.name}>
    <br>Email:<br>
    <input title="Email" type="text" name="email" value=${user.email}>
    <br>Age:<br>
    <input title="Age" type="text" name="age" value=${user.age}>
    <br>
    <input type="submit" value="Send">
</form>
</body>
</html>