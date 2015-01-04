<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script type="text/javascript">
	function searchResult(reqURL) {
		selectCity = $("#selectedCity").val();
		selectClass = $("#selectClass").val();
		checkInDate = $("#checkInDate").val();
		checkOutDate = $("#checkOutDate").val();
alert(reqURL);
		reqURL = reqURL.substring(0,reqURL.indexOf("WEB-INF"));
		alert(reqURL);

		if(checkInDate==""){
			checkInDate="NONE"
		}else{
			checkInDate = checkInDate.replace(/\//g, "%2f");
		}
		if(checkOutDate==""){
			checkOutDate="NONE"
		}else{
			checkOutDate = checkOutDate.replace(/\//g, "%2f");
		}
		$("#resultId").load(reqURL+"findHotels?city=" + selectCity + "&star="
						+ selectClass + "&checkInDate="
						+ checkInDate + "&checkOutDate="
						+ checkOutDate);
	}
</script>
</head>
<body>
	<table>
		<tr>
			<td>City</td>
			<td><select id="selectedCity" name="selectedCity">
					<c:forEach var="city" items="${listOfCity}">
						<option value="${city}">
							<c:out value="${city}" />
						</option>
					</c:forEach>
			</select></td>
			<td>Hotel Star</td>
			<td><select id="selectClass" name="selectClass">
					<option value="0">None</option>
					<c:forEach var="star" items="${listOfClass}">
						<option value="${star}">
							<c:out value="${star}" />
							star and above
						</option>
					</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td><p>Check in Date:</p></td>
			<td><input type="text" id="checkInDate"></td>
		</tr>
		<tr>
			<td><p>Check out Date:</p></td>
			<td><input type="text" id="checkOutDate"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="button" value="Search"
				onclick="searchResult('<%=request.getRequestURL().toString()%>');" /></td>
		</tr>
	</table>
	<div id="resultId"></div>
	<script type="text/javascript">
		$(function() {
			$("#checkInDate").datepicker();
			$("#checkOutDate").datepicker();
		});
	</script>
</body>
</html>