<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/reset.css" type="text/css" media="screen">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css" media="screen">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/grid.css" type="text/css" media="screen">   
    <script src="<%=request.getContextPath()%>/js/jquery-1.6.2.min.js" type="text/javascript"></script>     
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
                                                	<h3 class="p2">상품목록(list)</h3>
                                                    <form id="contact-form" method="post" enctype="multipart/form-data">                    


<table width=900 align="center">
	<tr>
		<!-- 첫번재 소파 이미지  -->
		<td width="300" style="border:1px solid #ddd;" align=center>
			<a href="product_detail.jsp">
			<img src="../images/sofa1.jpg" width="250" height="200">
			</a>
		</td>
		
		<!-- 두번째 소파 이미지 -->
		<td width="300" style="border:1px solid #ddd;"  align=center>
			<a href="">
			<img src="../images/sofa2.jpg" width="250" height="200" >
			</a>
		</td>
		<td width="300" style="border:1px solid #ddd;" >1</td>
	
	</tr>
	
	<tr>
		<!-- 첫번재 소파 이름, 가격 -->
		<td style="border:1px solid #ddd;" align="center">
			Wendelbo Edge sofa (웬델보 엣지 소파)
			<br/>
			300,000,000원
		</td>
		
		<!-- 첫번재 소파 이름, 가격 -->
		<td style="border:1px solid #ddd;" align=center>
			엘리체 리클라이너 가죽 소파
			<br/>
			500,000,000원
			
		</td>
		<td style="border:1px solid #ddd;" >1</td>
	</tr>
	
</table>

                                                        				
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
                                <dt class="indent-bot">8901 Marmora Road,<br>Glasgow, D04 89GR.</dt>
                                <dd><span>Freephone:</span>  +1 800 559 6580</dd>
                                <dd><span>Telephone:</span>  +1 959 603 6035</dd>
                                <dd><span>FAX:</span>  +1 504 889 9898</dd>
                                <dd><strong>E-mail:</strong> <a href="#">mail@demolink.org</a></dd>
                            </dl>
                        </article>
                        <article class="grid_9">
                        	<h3 class="prev-indent-bot">Miscellaneous Info</h3>
                            <strong>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi</strong> sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus.
                        </article>
                    </div>
                </div>
            </div>
        </div>
    </section>
    
	<%@ include file="../page/footer.jsp"%>
</body>
</html>