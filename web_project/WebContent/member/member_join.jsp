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
<input type="hidden" id="email_isChk" value="1"/>
	<form id="joinform" method="post" action="./MemberJoinAction.html">
		<table>
			<tr>
				<td align="right" valign="middle">이름&nbsp;&nbsp;&nbsp;</td>
				<td>
					<input id="MEMBER_NAME" class="borderColor" type="text" onblur="valchk(this)"/><p/>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="name_cl" align="center"><font color="red">한글 2~4 글자 / 영문 first last </font></span>
				</td>
			</tr>

			<tr>
				<td align="right" valign="middle">이메일&nbsp;&nbsp;&nbsp;</td>
				<td>
					<input id="MEMBER_EMAIL" class="borderColor"  type="text" onblur="valchk(this)">&nbsp;&nbsp;&nbsp;
					<input type="button" id="overlap_email" onclick="isChk_email()" value="중복확인"/><p/>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="email_cl" align="center"><font color="red">이메일 형식이 올바르지 않습니다.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">비밀번호&nbsp;&nbsp;&nbsp;</td>
				<td><input id="MEMBER_PWD" class="borderColor"  type="password" onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="pwd_cl" align="center"><font color="red">특수문자/문자/숫자 포함하여 8~15자리 이내의 비밀번호</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">비밀번호확인&nbsp;&nbsp;&nbsp;</td>
				<td><input id="MEMBER_PWD2" class="borderColor" type="password" onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="pwd2_cl" align="center"><font color="red">비밀번호가 일치하지 않습니다.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">우편번호&nbsp;&nbsp;&nbsp;</td>
				<td>
					<input id="MEMBER_ADDR_ZIP" class="borderColor" type="text"  onblur="valchk(this)" placeholder="검색버튼을 이용하여 주세요.">&nbsp;&nbsp;&nbsp;
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
				<td><input id="MEMBER_ADDR_1" class="borderColor"  type="text"  onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="addr1_cl" align="center"><font color="red">주소를 입력하여 주세요.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">상세주소&nbsp;&nbsp;&nbsp;</td>
				<td><input id="MEMBER_ADDR_2" class="borderColor"  type="text"  onblur="valchk(this)"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="addr2_cl" align="center"><font color="red">상세주소를 입력하여 주세요.</font></span>
				</td>
			</tr>
			
			<tr>
				<td align="right" valign="middle">전화번호&nbsp;&nbsp;&nbsp;</td>
				<td><input id="MEMBER_TEL" class="borderColor" type="text"  onblur="valchk(this)"><p/></td>
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
				<td><input class="borderColor" id="MEMBER_BIRTH" type="text"><p/></td>
			</tr>
			<tr>
				<td colspan="3">
					<span class="collapse" id="birth_cl" align="center"><font color="red">생년월일을 선택하여 주세요.</font></span>
				</td>
			</tr>

			<tr>
				<td colspan="3" align="center" valign="middle">
					<input type="button" value="회원가입" onclick="join()"/>
				</td>
			</tr>
		</table>
	</form>
</div>
<div class="modal-footer"></div>
