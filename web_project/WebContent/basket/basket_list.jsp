<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/reset.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="../css/style.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="../css/grid.css" type="text/css"
	media="screen">
<script src="../js/jquery-1.6.2.min.js" type="text/javascript"></script>
<!--[if lt IE 7]>
        <div style=' clear: both; text-align:center; position: relative;'>
            <a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0"  alt="" /></a>
        </div>
	<![endif]-->
<!--[if lt IE 9]>
   		<script type="text/javascript" src="js/html5.js"></script>
        <link rel="stylesheet" href="css/ie.css" type="text/css" media="screen">
	<![endif]-->
</head>
<body id="page5">
	<%@ include file="../page/header.jsp"%>
	<div>
		<section id="content">
			<div class="bg-top">
				<div class="bg-top-2">
					<div class="bg">
						<div class="bg-top-shadow">
							<div class="main">
								<div class="box">
									<div class="padding">
										<div class="container_12">
											<div class="wrapper">
												<div class="grid_12">
													<div class="indent-left">
														<h3 class="p2">주문내역 조회</h3>

<form id="contact-form" method="post" enctype="multipart/form-data">                    
     <fieldset>
     	<label>
     		<span class="text-form">주문자(ID) :</span>
     		sky0809<% %>
     	</label>
     
     	<label>
     		<span class="text-form">주문자(이름) :</span>
     		김순자<% %>
     	</label>
     	
     	
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
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" >
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
              
     	
     	
     	
     
     </fieldset>						
     </form>
                
	
	
	
														

													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="bg-bot">
				<div class="main">
					<div class="container_12">
						<div class="wrapper">
							<article class="grid_3">
								<h3 class="prev-indent-bot">Our Address</h3>
								<dl>
									<dt class="indent-bot">
										8901 Marmora Road,<br>Glasgow, D04 89GR.
									</dt>
									<dd>
										<span>Freephone:</span> +1 800 559 6580
									</dd>
									<dd>
										<span>Telephone:</span> +1 959 603 6035
									</dd>
									<dd>
										<span>FAX:</span> +1 504 889 9898
									</dd>
									<dd>
										<strong>E-mail:</strong> <a href="../#">mail@demolink.org</a>
									</dd>
								</dl>
							</article>
							<article class="grid_9">
								<h3 class="prev-indent-bot">Miscellaneous Info</h3>
								<strong>At vero eos et accusamus et iusto odio
									dignissimos ducimus qui blanditiis praesentium voluptatum
									deleniti atque corrupti quos dolores et quas molestias
									excepturi</strong> sint occaecati cupiditate non provident, similique
								sunt in culpa qui officia deserunt mollitia animi, id est
								laborum et dolorum fuga. Et harum quidem rerum facilis est et
								expedita distinctio. Nam libero tempore, cum soluta nobis est
								eligendi optio cumque nihil impedit quo minus id quod maxime
								placeat facere possimus, omnis voluptas assumenda est, omnis
								dolor repellendus. Temporibus autem quibusdam et aut officiis
								debitis aut rerum necessitatibus saepe eveniet ut et voluptates
								repudiandae sint et molestiae non recusandae. Itaque earum rerum
								hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus.
							</article>
						</div>
					</div>
				</div>
			</div>
		</section>

	</div>
	<%@ include file="../page/footer.jsp"%>
</body>
</html>
