<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">



</head>
<body >
<h3 >주문내역 조회</h3>

<h4> 주문자(ID) : sky0809</h4> 

<h4> 주문자(이름) : 김순자 </h4> 
<table width="870">
	
	<!-- 항목 (번호/제목 / 글쓴이 / 날짜 / 조회수 ) -->
	<tr align="center" style="border:1px solid #ddd; background-color:#EFEFEF ">
		<td style="font-size:12pt;  border:1px solid #ddd; font-weight:bold;" width="80"  >
			<div align="center"> [주문일자] </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" colspan="2" width="200">
			<div align="center"> [상품정보] </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" colspan="2"  >
			<div align="center"> [상품금액 및 수량] </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="100">
			<div align="center"> [총 금액] </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="100">
			<div align="center"> [주문상태] </div>
		</td>
		
	</tr>
	

	<!-- 내용  -->
	<tr valign="middle"  style="border:1px solid #ddd; height:100px "
		onmouseover="this.style.backgroundColor='#F8F8F8'">
		<td  style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			2016.10.13
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #ddd;" width=160>
			
			<a href="basket_detail.jsp">
			<img src="../images/sofa1.jpg" width="150" height="100">
			</a>
			
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #ddd" width=290>
			다이애나 리클라이너 가죽 소파(3B_2)
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;" width=100>
			50,000
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;" width=50>
			 5
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;" >
			150,000
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;">
			배송 준비
		</td>
		
	</tr>
	
	<tr valign="middle"  style="border:1px solid #ddd; height:100px "
		onmouseover="this.style.backgroundColor='#F8F8F8'">
		<td  style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			2016.10.13
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #ddd;" width=160>
			
			
			<img src="../images/sofa1.jpg" width="150" height="100">
			
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #ddd" width=290>
			다이애나 리클라이너 가죽 소파(3B_2)
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;" width=100>
			50,000
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;" width=50>
			 5
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;" >
			150,000
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:1px solid #ddd;">
			배송 준비
		</td>
		
	</tr>
	
	
	<!-- [이전] / [1] [2] [3] / [다음] -->
	<tr align="center" height="20">
		<td colspan="3" style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			
			<a href=""  style='text-decoration: none;'>[이전] </a> &nbsp;&nbsp;
			
			<a href="" style='text-decoration: none;'>[1] </a>&nbsp;&nbsp;
			
			<a href="" style='text-decoration: none;'>[다음] </a>
		</td>
		
		<td colspan="2" align="right">
		<a href=""> 글쓰기(관리자용)</a>
		</td>
	</tr>
	
	
	</table>
              
     

</body>
</html>
