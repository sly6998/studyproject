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
                                                	<h3 class="p2">상품보기(detail)</h3>
                                                    <form id="contact-form" method="post" enctype="multipart/form-data">                    
                                                        <fieldset>
                                                        <table>
                                                        <tr>
                                                        	<td  style='border:0px solid #000; ' width="450" >
                                                       		<img src="../images/sofa1.jpg" width="400" height="315">
                                                       		</td>
                                                        
                                                        <td style='border:0px solid #000;' width="350">
                                                          <hr >
                                                          <label><span class="text-form">상품명  : </span><h2>엄청난 엄청난 엄청난 소파</h3></label>		
                                                          <label><span class="text-form">가  격  : </span><h2>500,000,000,000원</h3></label>
                                                          <label><span class="text-form">사이즈  : </span>
                                                          <select id="" style="width:170px; height:25px">
                                                          	<option selected="selected">사이즈(선택)</option>
															<option>중</option>
															<option>대</option>
															<option>특대</option>
															<option>기타...</option>
                                                          </select>                           
                                                          </label>
                                                          <label><span class="text-form">수  량  : </span>
                                                          <select id="" style="width:170px; height:25px" >
                                                          	<option selected="selected">수량(선택)</option>
															<option>1</option>
															<option>2</option>
															<option>3</option>
															<option>4</option>
															<option>5</option>
                                                          </select>
                                                          </label>   
                                                          
                                                    
                                                          <hr >
                                                          <label style="padding:30px 0px 0px 0px">
                                                          <span class="text-form">총금액  : </span><h2>원</h3>
                                                          </label>
                                                          
                                                          
                                                          
                                                          <label style="padding:20px 0px 0px 0px">
                                                          	<a class="button" href="#" onClick="">바로구매</a>
                                                            <a class="button" href="#" onClick="">장바구니</a>
                                                            <a class="button" href="product_list.jsp" onClick="">목록으로</a>
                                                          </label>
                                                          
                                                        </td>
                                                        <td style='border:0px solid #000; '>
                                                        </td>
                                                        </tr>
                                                        
                                                        <tr height="50px">
                                                        </tr>
                                                         
                                                        <tr> 
                                                        	<td style='border:0px solid #000; background-color:#efefef;' colspan="3" height="500">
                                                        	 <h3>제품 상세내용 표시부분</h3><br/>
                                                        	 <center>
                                                        	 <img src="../images/sofa1_1.jpg">
                                                        	 <img src="../images/sofa1_2.jpg">
                                                        	 </center>
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