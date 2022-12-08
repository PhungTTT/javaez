<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container"">
		<form id="my_form" action="trangDatHang.jsp" method="Get">
	 	 <div class="mb-3">
		    <label for="hoVaTen" class="form-label">Họ và Tên</label>
		    <input type="text" class="form-control" id="hoVaTen" name="hoVaTen">
	  	</div>
	  	
	  	<div class="mb-3">
		    <label for="email" class="form-label">Email</label>
		    <input type="email" class="form-control" id="email" name="email">
	  	</div>
	  	
	  	<div class="mb-3">
		    <label for="soLuong" class="form-label">Số lượng mua</label>
		    <input type="text" class="form-control" id="soLuong" name="soLuong">
	  	</div>
	  	
	  	<div class="mb-3">
		    <button type="submit" class="btn btn-primary">Đặt hàng</button>
	  	</div>
		</form>
	</div>

</body>
</html>