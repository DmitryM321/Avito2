<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h4>Подробная информация о товаре</h4>
<b>Название товара: </b>${product.title}<br>
<b>Цена товара: </b>${product.price}<br>
<b>Город: </b>${product.city}<br>
<b>Автор: </b>${product.price}<br> 
  
<hr> 
<from action="/product/delete/$#{product.id}" method="post"> 
    <input type="submit" value="Удалить товар"/>
</from>
</body>
</html>