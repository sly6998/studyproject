<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/member_form.css">
<style>
.borderColor {
	border-top: 0px;
	border-left: 0px;
	border-right: 0px;
	border-bottom: 1px solid gray;
}
</style>
 
<div class="text-center" style="padding:50px 0">
	<div class="member_logo">register</div>
	<!-- Main Form -->
	<div class="login-form-1">
		<form id="joinform" name="joinform" class="text-left" method="post" action="./MemberJoinAction.html">
			<input type="hidden" id="id_isChk" name="id_isChk" value="1" />
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group-1">
						<input type="text" class="form-control-1" id="MEMBER_ID" name="MEMBER_ID" placeholder="user ID" size="20px">
						<button type="button" id="overlap_id" onclick="isChk_id()">중복체크</button>
					</div>
					<div class="form-group-1">
						<input type="text" class="form-control-1" id="MEMBER_NAME" name="MEMBER_NAME" placeholder="username">
					</div>
					<div class="form-group-1">
						<input type="password" class="form-control-1" id="MEMBER_PWD" name="MEMBER_PWD" placeholder="password">
					</div>
					<div class="form-group-1">
						<input type="password" class="form-control-1" id="MEMBER_PWD2" name="MEMBER_PWD2" placeholder="confirm password">
					</div>
					
					<div class="form-group-1">
						<input type="text" class="form-control-1" id="MEMBER_TEL" name="MEMBER_TEL" placeholder="Phone Number">
					</div>
					<div class="form-group login-group-checkbox">
						<input type="radio" class="" name="MEMBER_GENDER" id="male">
						<label for="male">male</label>
						
						<input type="radio" class="" name="MEMBER_GENDER" id="female">
						<label for="female">female</label>
					</div>
					<div class="form-group-1">
						<input type="text" class="form-control-1" id="MEMBER_ADDR_ZIP" name="MEMBER_ADDR_ZIP" placeholder="Zip Code">
						<input type="button" value="Search" onclick="execDaumPost()"></td>
					</div>
					<div class="form-group-1">
						<input type="text" class="form-control-1" id="MEMBER_ADDR_1" name="MEMBER_ADDR_1" placeholder="Address">
					</div>
					<div class="form-group-1">
						<input type="text" class="form-control-1" id="MEMBER_ADDR_2" name="MEMBER_ADDR_2" placeholder="Detail Address">
					</div>
              		<label style="margin-top:6px">Birth Day</label>
              		<div class="form-group-1">
                		<select size="1" name="MEMBER_YEAR" >
							<option value="">Year</option>
							<%for (int i = 2010; i >= 1930; i--) {%>
							<option value="<%=i%>"><%=i%></option>
							<%}%>
						</select>&nbsp;&nbsp;
						<select size="1" name="MEMBER_MONTH">
							<option value="">Month</option>
							<%for (int i = 1; i <= 12; i++) {%>
							<option value="<%=i%>"><%=i%></option>
							<%}%>
						</select>&nbsp;&nbsp;
						<select size="1" name="MEMBER_DAY">
						<option value="">Date</option>
						<%for (int i = 1; i <= 31; i++) {%>
						<option value="<%=i%>"><%=i%></option>
						<%}%>
						</select>
            		</div>
				</div>
				<button type="submit"></button>
			</div>
		</form>
		<div class="etc-login-form">
			<p>already have an account? <a href="#">login here</a></p>
		</div>
	</div>
</div>
<%-- <div class="modal-header">
	<h4 class="modal-title" align="left">Member Join</h4>
</div>
<div class="modal-body" align="center">
	<form name="joinform" id="joinform" method="post"
		action="./MemberJoinAction.html">
		<input type="hidden" id="id_isChk" name="id_isChk" value="1" />
		<table>
			<tr>
				<td align="right" valign="middle">이름&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_NAME" id="MEMBER_NAME"
					class="borderColor" type="text" onfocus="infocus(this)"
					onblur="valchk(this)" />
				<p /></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="name_cl"
					align="center"><font color="red">한글 2~4 글자 / 영문 first
							last </font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">아이디&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_ID" id="MEMBER_ID" class="borderColor"
					type="text" onfocus="infocus(this)" onblur="valchk(this)">&nbsp;&nbsp;&nbsp;
					<button type="button" id="overlap_id" onclick="isChk_id()">중복체크</button>
				</td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="id_cl"
					align="center"><font color="red">아이디 형식이 올바르지 않습니다.</font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">비밀번호&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_PWD" id="MEMBER_PWD"
					class="borderColor" type="password" onfocus="infocus(this)"
					onblur="valchk(this)">
				<p /></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="pwd_cl"
					align="center"><font color="red">특수문자/문자/숫자 포함하여
							8~15자리 이내의 비밀번호</font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">비밀번호확인&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_PWD2" id="MEMBER_PWD2"
					class="borderColor" type="password" onfocus="infocus(this)"
					onblur="valchk(this)">
				<p /></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="pwd2_cl"
					align="center"><font color="red">비밀번호가 일치하지 않습니다.</font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">우편번호&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_ADDR_ZIP" id="MEMBER_ADDR_ZIP"
					class="borderColor" type="text" onfocus="infocus(this)"
					onblur="valchk(this)" placeholder="검색버튼을 이용하여 주세요.">&nbsp;&nbsp;&nbsp;
					<input type="button" value="검색" onclick="execDaumPost()"></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="zip_cl"
					align="center"><font color="red">우편번호를 입력하여 주세요.</font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">주소&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_ADDR_1" id="MEMBER_ADDR_1"
					class="borderColor" type="text" onfocus="infocus(this)"
					onblur="valchk(this)">
				<p /></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="addr1_cl"
					align="center"><font color="red">주소를 입력하여 주세요.</font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">상세주소&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_ADDR_2" id="MEMBER_ADDR_2"
					class="borderColor" type="text" onfocus="infocus(this)"
					onblur="valchk(this)">
				<p /></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="addr2_cl"
					align="center"><font color="red">상세주소를 입력하여 주세요.</font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">전화번호&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_TEL" id="MEMBER_TEL"
					class="borderColor" type="text" onfocus="infocus(this)"
					onblur="valchk(this)">
				<p /></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="tel_cl"
					align="center"><font color="red">전화번호 형식이 올바르지 않습니다.</font></span>
				</td>
			</tr>

			<tr>
				<td align="right" valign="middle">성별&nbsp;&nbsp;&nbsp;</td>
				<td>남자&nbsp;<input name="MEMBER_GENDER" type="radio" value="남자">&nbsp;&nbsp;&nbsp;
					여자&nbsp;<input name="MEMBER_GENDER" type="radio" value="여자">
				<p />
				</td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="gender_cl"
					align="center"><font color="red">성별을 선택하여 주세요.</font></span></td>
			</tr>

			<tr>
				<td align="right" valign="middle">생년월일&nbsp;&nbsp;&nbsp;</td>
				<td>
				
				<select size="1" name="MEMBER_YEAR">
						<option value="">년도</option>
						<%
							for (int i = 2010; i >= 1930; i--) {
						%>
						<option value="<%=i%>"><%=i%></option>
						<%
							}
						%>
				</select>년 <select size="1" name="MEMBER_MONTH">
						<option value="">월</option>
						<%
							for (int i = 1; i <= 12; i++) {
						%>
						<option value="<%=i%>"><%=i%></option>
						<%
							}
						%>
				</select>월 <select size="1" name="MEMBER_DAY">
						<option value="">일</option>
						<%
							for (int i = 1; i <= 31; i++) {
						%>
						<option value="<%=i%>"><%=i%></option>
						<%
							}
						%>

				</select>일
					<p /></td>
			</tr>
			<tr>
				<td colspan="3"><span class="collapse" id="birth_cl"
					align="center"><font color="red">생년월일을 선택하여 주세요.</font></span></td>
			</tr>

			<tr>
				<td colspan="3" align="center" valign="middle"><input
					type="button" value="회원가입" class="btn btn-default" onclick="join()" />
				</td>
			</tr>
		</table>
	</form>
</div>
 --%>