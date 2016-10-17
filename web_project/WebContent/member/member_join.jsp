<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<style>
 .borderColor{
 	border-top: 0px;
 	border-left: 0px;
 	border-right: 0px;
 	border-bottom: 1px solid gray;
 }
</style>
<div class="modal-header">
	<h4 class="modal-title" align="left">Member Join</h4>
</div>
<div class="modal-body" align="center">
	<form name="joinform" id="joinform" method="post" action="./MemberJoinAction.html">
		<input type="hidden" id="id_isChk" name="id_isChk"value="1"/>
		<table>
			<tr>
				<td align="right" valign="middle">이름&nbsp;&nbsp;&nbsp;</td>
				<td>
					<input name="MEMBER_NAME" id="MEMBER_NAME" class="borderColor" type="text" onblur="valchk(this)"/><p/>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="name_cl" align="center"><font color="red">한글 2~4 글자 / 영문 first last </font></span>
				</td>
			</tr>

			<tr>
				<td align="right" valign="middle">아이디&nbsp;&nbsp;&nbsp;</td>
				<td>
					<input name="MEMBER_ID" id="MEMBER_ID" class="borderColor"  type="text" onblur="valchk(this)">&nbsp;&nbsp;&nbsp;
					<button type="button" id="overlap_id" onclick="isChk_id()">중복체크</button>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="id_cl" align="center"><font color="red">아이디 형식이 올바르지 않습니다.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">비밀번호&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_PWD" id="MEMBER_PWD" class="borderColor"  type="password" onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="pwd_cl" align="center"><font color="red">특수문자/문자/숫자 포함하여 8~15자리 이내의 비밀번호</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">비밀번호확인&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_PWD2" id="MEMBER_PWD2" class="borderColor" type="password" onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="pwd2_cl" align="center"><font color="red">비밀번호가 일치하지 않습니다.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">우편번호&nbsp;&nbsp;&nbsp;</td>
				<td>
					<input name="MEMBER_ADDR_ZIP" id="MEMBER_ADDR_ZIP" class="borderColor" type="text"  onblur="valchk(this)" placeholder="검색버튼을 이용하여 주세요.">&nbsp;&nbsp;&nbsp;
					<input type="button" value="검색" onclick="execDaumPost()">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="zip_cl" align="center"><font color="red">우편번호를 입력하여 주세요.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">주소&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_ADDR_1" id="MEMBER_ADDR_1" class="borderColor"  type="text"  onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="addr1_cl" align="center"><font color="red">주소를 입력하여 주세요.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">상세주소&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_ADDR_2" id="MEMBER_ADDR_2" class="borderColor"  type="text"  onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="addr2_cl" align="center"><font color="red">상세주소를 입력하여 주세요.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">전화번호&nbsp;&nbsp;&nbsp;</td>
				<td><input name="MEMBER_TEL" id="MEMBER_TEL" class="borderColor" type="text"  onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="tel_cl" align="center"><font color="red">전화번호 형식이 올바르지 않습니다.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">성별&nbsp;&nbsp;&nbsp;</td>
				<td>
					남자&nbsp;<input name="MEMBER_GENDER" type="radio" value="남자">&nbsp;&nbsp;&nbsp;
					여자&nbsp;<input name="MEMBER_GENDER" type="radio" value="여자"><p/>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="gender_cl" align="center"><font color="red">성별을 선택하여 주세요.</font></span>
				</td>
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
						</select>년 
						
						<select size="1" name="MEMBER_MONTH">
							<option value="">월</option>
							<%
								for (int i = 1; i <= 12; i++) {
							%>
							<option value="<%=i%>"><%=i%></option>
							<%
								}
							%>
						</select>월 
						
						<select size="1" name="MEMBER_DAY">
							<option value="">일</option>
							<%
								for (int i = 1; i <= 31; i++) {
							%>
							<option value="<%=i%>"><%=i%></option>
							<%
								}
							%>
							
						</select>일
				<p/>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="birth_cl" align="center"><font color="red">생년월일을 선택하여 주세요.</font></span>
				</td>
			</tr>

			<tr>
				<td colspan="3" align="center" valign="middle">
					<input type="button" value="회원가입" class="btn btn-default" onclick="join()"/>
				</td>
			</tr>
		</table>
	</form>
