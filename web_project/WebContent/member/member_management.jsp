<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../css/reset.css" type="text/css" media="screen">
    <link rel="stylesheet" href="../css/style.css" type="text/css" media="screen">
    <link rel="stylesheet" href="../css/grid.css" type="text/css" media="screen">   
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
	<%@ include file="../page/header.jsp" %>
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
                                                	<h3 class="p2">회원관리 (관리자용)</h3>
        
        
        <table width="870">
		
		
		<!-- 임시로 넣은 회원검색기능... 지워도 됨 -->
		<tr >
		<td valign="middle" style="font-family:Tahoma;font-size:10pt; border:0px solid #000; " align="right" colspan="4" >
				<input type="radio" name="member_search" value="member_search_name" style="width:15px; " >이름 &nbsp;&nbsp;
				<input type="radio" name="member_search" value="member_search_email" style="width:15px; ">이메일(ID) &nbsp;&nbsp;
		
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
		<!-- ---------------------------------------  -->	
	
	
	
	
	<tr>
	<td style="border:0px solid #000;" colspan="5" height="20px"> </td>
	</tr>
	<tr align="center" style="border:1px solid #ddd; background-color:#EFEFEF ">
		<td style="font-size:12pt;  border:1px solid #ddd; font-weight:bold; width:80px; "  height="26">
			<div align="center"> 번호 </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="400"  height="26">
			<div align="center"> 아이디(ID) </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="190"  height="26">
			<div align="center"> 이름 </div>
		</td>
		
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="100" height="26">
			<div align="center">수정 </div>
		</td>
		<td style="font-size:12pt; font-weight:bold; border:1px solid #ddd;" width="100" height="26">
			<div align="center"> 탈퇴 </div>
		</td>
	</tr>
	

	
	<tr align="center" valign="middle"  style="border:1px solid #ddd;"
		onmouseover="this.style.backgroundColor='#F8F8F8'">
		<td height="23" style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			10
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center">
			
			<a href="" style='text-decoration: none;'>아이디2</a>
			</div>
		</td>
		
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<div align="center"> gogo1212</div>
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<a href=""  style='text-decoration: none;'>[수정] </a>
		</td>
		<td style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			<a href="" style='text-decoration: none;'>[탈퇴] </a>
		</td>
	</tr>
	
	<tr align="center" height="20">
		
		
		<td colspan="5" style="font-family:Tahoma;font-size:10pt; border:0px solid #000;">
			
			<a href=""  style='text-decoration: none;'>[이전] </a> &nbsp;&nbsp;
			
			
			<a href="" style='text-decoration: none;'>[1] </a>&nbsp;&nbsp;
			
			<a href="" style='text-decoration: none;'>[다음] </a>
			
			
		</td>
		
	</tr>
	
	
		
	
	</table>
                                                	
                                                    
                                                
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
                                <dd><strong>E-mail:</strong> <a href="../#">mail@demolink.org</a></dd>
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
    
<%@ include file="../page/footer.jsp" %>
</body>
</html>
