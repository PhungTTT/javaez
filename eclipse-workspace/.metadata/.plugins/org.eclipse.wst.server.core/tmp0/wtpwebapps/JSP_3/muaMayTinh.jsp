<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js"
	integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk"
	crossorigin="anonymous"></script>

<body>
	<h1>Chọn hình máy tính:</h1>
	<hr>
	<form>
		<h2>Processor</h2>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="processor"
				id="corei5" value="Core I5"> <label class="form-check-label"
				for="corei5"> Core I5</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="processor"
				id="corei7" value="Core I7"> <label
				class="form-check-label" for="corei7"> Core I7</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="processor"
				id="corei9" value="Core I9"> <label
				class="form-check-label" for="corei9"> Core I9</label>
		</div>
		<!--  -->
		<h2>RAM</h2>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="ram"
				id="ram8gb" value="ram8gb"> <label class="form-check-label"
				for="ram8gb"> Ram 8GB</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="ram"
				id="ram16gb" value="ram8gb"> <label class="form-check-label"
				for="ram16gb"> Ram 16GB</label>
		</div>
		<!--  -->
		<h2>Monitor</h2>
		<div class="form-check">
			<input class="form-check-input" type="checkbox"
				id="flexCheck" value="ram8gb"> <label class="form-check-label"
				for="flexCheck"> Disabled check checkbox</label>
		</div>
	</form> 
</body>
</html>