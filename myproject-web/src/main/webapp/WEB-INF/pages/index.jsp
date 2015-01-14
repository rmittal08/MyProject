<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"
	type="text/javascript"></script>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css" />
<style type="text/css">
.body {
	padding: 0;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 11px;
	margin: 0px auto auto auto;
	color: #000;
}

p {
	padding: 2px;
	margin: 0px;
}

.product_title {
	color: #ff8a00;
	padding: 5px 0 5px 0;
	font-weight: bold;
}

.product_title a {
	text-decoration: none;
	color: #ff8a00;
	padding: 5px 0 5px 0;
	font-weight: bold;
}

.product_title a:hover {
	color: #064E5A;
}

.product_img {
	padding: 5px 0 5px 0;
	z-index: -1;
}

.prod_price {
	padding: 5px 0 5px 0;
}

span.reduce {
	color: #666666;
	text-decoration: line-through;
}

span.price {
	color: #ff8a00;
}

/*center content--------------------------*/
.center_content {
	width: 600px;
	float: left;
	padding: 5px 10px 5px 15px;
}

.center_title_bar {
	width: 575px;
	height: 31px;
	float: left;
	padding: 0 0 0 10px;
	margin: 0 0 0 5px;
	line-height: 31px;
	font-size: 12px;
	color: #159DCC;
	font-weight: bold;
	background: no-repeat center;
}

/*---------prod_box----------*/
.prod_box {
	width: 173px;
	height: auto;
	float: left;
	padding: 10px 10px 10px 11px;
}

.center_prod_box {
	width: 173px;
	height: auto;
	float: left;
	text-align: center;
	padding: 0px;
	margin: 0px;
	border: 1px #F0F4F5 solid;
}

.prod_details_tab {
	width: 173px;
	height: 31px;
	float: left;
	margin: 3px 0 0 0;
}

img.left_bt {
	float: left;
	padding: 6px 0 0 6px;
}

a.prod_details {
	width: 75px;
	height: 24px;
	display: block;
	float: right;
	background: no-repeat center;
	margin: 2px 5px 0 0;
	text-align: center;
	line-height: 24px;
	text-decoration: none;
	color: #159dcc;
}

a.prod_buy {
	width: 75px;
	height: 24px;
	display: block;
	float: left;
	background: no-repeat center;
	margin: 2px 0 0 5px;
	text-align: center;
	line-height: 24px;
	text-decoration: none;
	color: #006600;
}

.hidden {
	display: none;
}

.option-container {
	 z-index: 1000;
	 width : 800px;
	 height : 200px;
	 background-color: white solid;
}

</style>
</head>
<body>

	<div class="center_content">

		<div class="center_title_bar">Recommended Hotels</div>
		<c:forEach var="s" items="${listOfHotel}">
			<div class="prod_box">
				<div class="center_prod_box" style="z-index:-1">
					<div class="product_title">
						<a href="${s.dealDeepLink}" alt="${s.similarDeepLink}" target="_blank"><c:out value="${s.name}" /></a>
					</div>
					<div class="product_img">
						<a href="${s.dealDeepLink}" alt="${s.similarDeepLink}" target="_blank"><img src="${s.imageUrl}" alt="" border="0" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">${s.originalPricePerNight}
							${s.currency}</span> <span class="price">${s.pricePerNight}
							${s.currency}</span>
					</div>
				</div>
				<div class="prod_details_tab" >
					${s.percentSavings} % Saving <a href="${s.dealDeepLink}" alt="${s.similarDeepLink}" target="_blank"
						class="prod_details">Details</a>
					<div class="option-container hidden" >
						<table>
						<tr>
						<td width="200px;">Description : </td>
						<td>${s.description}</td>
						</tr>
						<tr>
						<td>Address : </td>
						<td>${s.streetAddress} ${s.city} ${s.province} ${s.country}, ${s.latitude} ${s.latitude}</td>
						</tr>
						<tr>
						<td>Guest Rating : </td>
						<td>${s.guestRating}</td>
						</tr>
						<tr>
						<td>Base Rate : </td>
						<td>${s.baseRate} ${s.currency}</td>
						</tr>
						<tr>
						<td>Original Base Rate : </td>
						<td>${s.originalBaseRate} ${s.currency}</td>
						</tr>
						</table>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	<script type="text/javascript">
		$(document).delegate('.prod_details', 'mouseenter', function() {
			$('.option-container').addClass('hidden');
			$(this).next('.option-container').removeClass('hidden').addStyle("z-index:1000");
		});

		$(document).delegate('.option-container', 'mouseleave', function() {
			$(this).addClass('hidden');
		});
	</script>
</body>
</html>