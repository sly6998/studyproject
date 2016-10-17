<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">

</head>
<body >
<h3 >Review</h3>

	<table width="870" >
	
	<tr>
	<!-- 임의로 넣은 검색기능 (지워도됨)  -->
	<!-- 			name="abcd"  		  -->
		<td valign="middle" style="font-family:Tahoma;font-size:10pt; border:0px solid #000; " align="right" colspan="4" >
				<input type="radio" name="abcd" value="이름" style="width:15px; " >이름 &nbsp;&nbsp;
				<input type="radio" name="abcd" value="제목" style="width:15px; ">제목 &nbsp;&nbsp;
				<input type="radio" name="abcd" value="내용" style="width:15px; ">내용 &nbsp;&nbsp;
		
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000; " valign="middle">
		<div class="grid_3" style="float:right;">
		<form id="search-form" method="post" enctype="multipart/form-data" style="padding:0px 0px 0 0px">
			<fieldset style="position:relative;">
				<div class="search-field"  style="height:25px">
				<input name="search" type="text" />
				 <a class="search-button" href="#" onClick="">
				 <span>search</span></a>
				</div>
			</fieldset>
		</form>
		</div>
		
		
		
		
		</td>
	</tr>
	<tr align="center" valign="middle">
		<td style="font-family:Tahoma;font-size:10pt;" width="8%" height="26">
			<div align="center"> 번호 </div>
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt;" width="50%" height="26">
			<div align="center"> 제목 </div>
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt;" width="14%" height="26">
			<div align="center"> 작성자 </div>
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt;" width="17%" height="26">
			<div align="center">날짜 </div>
		</td>
		<td style="font-family:Tahoma;font-size:10pt;" width="11%" height="26">
			<div align="center"> 조회수 </div>
		</td>
	</tr>
	

	
	<tr align="center" valign="middle" 
		onmouseover="this.style.backgroundColor='#F8F8F8'">
		
		<td height="23" style="font-family:Tahoma;font-size:10pt;">
			10
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt;">
			<div align="center">
			<a href="">리뷰리뷰</a>
			</div>
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt;">
			<div align="center"> gogo1212</div>
		</td>
		<td style="font-family:Tahoma;font-size:10pt;">
			<div align="center"> 10/10</div>
		</td>
		<td style="font-family:Tahoma;font-size:10pt;">
			<div align="center"> 35</div>
		</td>
	</tr>
	
	<tr align="center" valign="middle" onmouseover="this.style.backgroundColor='#F8F8F8'">
		<td height="23" style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			10
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center">
			
			<a href="">리뷰리뷰22</a>
			</div>
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center"> 리뷰리뷰22</div>
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center"> 10/10</div>
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center"> 35</div>
		</td>
	</tr>
	
	<tr align="center" height="20">
		<td>
		</td>
		
		<td colspan="3" style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			
			<a href=""  style='text-decoration: none;'>[이전] </a>
			<a href="" style='text-decoration: none;'>[1] </a>
			<a href="" style='text-decoration: none;'>[2] </a>
			<a href="" style='text-decoration: none;'>[이전] </a>
			
			
		</td>
		
		<td style="border:0px solid #000;" align="center">
			<a href="" style='text-decoration: none;' > 글쓰기</a>
		</td>
	</tr>
	
	
		
	
	</table>

</body>
</html>
