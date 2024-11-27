<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="pack1.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Purchase</title>
<style>

body {
			/*background-color:greenyellow;*/
			background-image: url("107033-light-blue-abstract.jpg");
			display: flex;
			justify-content: center;
			align-items: center;
			height: 100vh;

		}

		div {
			border: 1px solid white;
			padding: 15px;
			border-radius: 10px;
			background-color: rgba(0, 0, 0, 0.5);
			box-shadow: 5px 5px 15px black;
			width: 500px;
			height: 450px;
			text-align: center;
			color: white;
			font-size: 20px;

		}
		input[type="text"]{
		margin:20px
		}
		input[type="submit"]{
		padding:8px;
		}
		input[type="submit"]:hover{
		background-color:blue;
		color:white;
		}



</style>
<script type="text/javascript">
    <% 
    ProductBean pb = (ProductBean) request.getAttribute("buy"); 
    if (pb != null) { 
    %>
        // Initialize available quantity in JavaScript from server-side value
        var initialQty = <%= pb.getPqty() %>;
    <% } else { %>
        var initialQty = 0;
        alert("Product details are not available.");
    <% } %>

    function updatePriceAndQuantity() {
        // Get the requested quantity and price values
        var qty = parseInt(document.getElementById('reqNo').value);
        var price = parseFloat(document.getElementById('price').value);

        // Calculate the total price
        var totalPrice = qty * price;

        // Update the total price input field
        document.getElementById('totalPrice').value = totalPrice.toFixed(2);

        // Calculate and update the remaining available quantity
        var remainingQty = initialQty - qty;
        document.getElementById('availableQty').value = remainingQty;
    }
</script>
</head>
<body><div>
<%
if (pb != null) {
    out.println("<center><form action='confirm' method='post'>" +
                   "Pcode : <input type='text' size='35' name='pcode' readonly value='" + pb.getPcode() + "'><br>" +
                   "Pname : <input type='text' size='35' name='pname'  readonly value='" + pb.getPname() + "'><br>" +
                   "Pcompany : <input type='text' size='35' name='pcompany' readonly value='" + pb.getPcompany() + "'><br>" +
                   "Price: <input type='text' id='price' size='35' name='pprice' readonly value='" + pb.getPprice() + "'><br>" +
                   "Available Pquantity : <input type='text' name='pqty' size='35' id='availableQty' readonly value='" + pb.getPqty() + "'><br>" +
                   "Req No : <input type='number' id='reqNo'size='35' name='req' min='1' max='" + pb.getPqty() + "' value='0' oninput='updatePriceAndQuantity()'><br>" +
                   "Total Price: <input type='text' id='totalPrice' size='35' name='price' readonly value='" + pb.getPprice() + "'><br>" +
                   "<input type='submit' value='Confirm'>" +
               "</form></center>");
} else {
    out.println("<center><h1>Product details are not available.</h1></center>");
}
%></div>
</body>
</html>
