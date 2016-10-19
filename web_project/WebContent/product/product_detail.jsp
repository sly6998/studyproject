<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">

</head>
<body>
	
<h3 >상품보기(detail)</h3>
<form id="" method="post" enctype="multipart/form-data">                    


<table width=800>
	<tr >
		<td  style='border:0px solid #000; ' width=300 rowspan="6" >
			<img src="../images/sofa1.jpg" width=250 height="200">
		</td>
                                                        	
		<td style='border:0px solid #000;' >
			상품명  : 
		</td>
		
		<td style='border:0px solid #000; '>
			엄청난 엄청난 엄청난 소파
		</td>
	</tr>
		
	<tr>
		<td>가  격  : </td>
		
		<td>500,000,000,000원</td>
	</tr>
	
	<tr>
		<td>	사이즈  : </td>
		
		<td>	
			<select id="" style="width:170px; height:25px">
			<option selected="selected">사이즈(선택)</option>
			<option>중</option>
			<option>대</option>
			<option>특대</option>
			</select>                           
		</td>
	</tr>
	
	<tr>
		<td>수  량  : </td>
		<td>
			<select id="" style="width:170px; height:25px" >
			<option selected="selected">수량(선택)</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
			<option>5</option>
			</select>
		</td>		
	</tr>
	
	<tr>
		<Td>총금액 : </Td>
		
		<td>원</td>
	</tr>
	
	<tr>
		<td colspan=2>
			<a href="">바로구매</a>
			<a href="">장바구니</a>
			<a href="product_list.jsp">목록으로</a>
		

		</td>
	</tr>
                                                          
	<tr height="50px">
	</tr>
                                                         
	<tr> 
		<td style='border:0px solid #000; background-color:#efefef;' colspan=3>
		 <h3>제품 상세내용 표시부분</h3><br/>
		 </td>
	</tr>
	
	<TR>
		<TD style='border:0px solid #000; background-color:#efefef;' align="center" colspan=3 >
			<img src="../images/sofa1_1.jpg">
		 	<img src="../images/sofa1_2.jpg">
		</td>
	</TR>
</table>
                                                    					
</form>
                                                
</body>
</html>