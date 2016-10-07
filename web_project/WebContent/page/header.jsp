<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>

<header>
    	<div class="row-1">
        	<div class="main">
            	<div class="container_12">
                	<div class="grid_12">
                    	<nav>
                            <ul class="menu">
                                <li><a class="active" href="<%=request.getContextPath()%>/mainpage.html">홈페이지 소개</a></li>
                                <li><a href="<%=request.getContextPath()%>/noti_list.html">공지사항</a></li>
                                <li><a href="<%=request.getContextPath()%>/catalogue.html">카탈로그</a></li>
                                <li><a href="<%=request.getContextPath()%>/product_list.html">제품</a></li>
                                <li><a href="<%=request.getContextPath()%>/review_list.html">고객 후기</a></li>
                                <li><a href="<%=request.getContextPath()%>/qna_list.html">질문게시판</a></li>
                                <li><a href="<%=request.getContextPath()%>/advice_request.html">상담신청</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        
       
        <div class="row-2">
        	<div class="main">
            	<div class="container_12">
                	<div class="grid_9">
                    	<h1>
                            <a class="logo" href="<%=request.getContextPath()%>/mainpage.html">Int<strong>e</strong>rior
                            	<span>Design</span>
                            </a>
                        </h1>
                    </div>
                    <div class="grid_3">
                    	<form id="search-form" method="post" enctype="multipart/form-data">
                            <fieldset>	
                                <div class="search-field">
                                    <input name="search" type="text" />
                                    <a class="search-button" href="#" onClick="document.getElementById('search-form').submit()"><span>search</span></a>	
                                </div>						
                            </fieldset>
                        </form>
                     </div>
                     <div class="clear"></div>
                </div>
            </div>
        </div>    	
    </header>
</div>