<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">
<script>
	function emailchk() {

		var email = document.loginform.MEMBER_EMAIL.value;
		var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

		if (email == '' || !re.test(email)) {
			alert("올바른 이메일 주소를 입력하세요");
		}
	}
</script>
</head>
<body>
	<h3>로그인페이지</h3>
	<form name="loginform">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="MEMBER_EMAIL" placeholder="Email"
					onblur="emailchk()" /></td>
			</tr>

			<tr>
				<td>비밀번호 :</td>
				<td><input type="password" name="MEMBER_PWD" /></td>
			</tr>

			<tr>
				<td colspan="2" align=center><input type="submit" value="로그인">
					<input type="reset" value="다시쓰기"> <a href=""> 회원가입 </a></td>
			</tr>
		</table>
	</form>
	
	
	
	<div ng-controller="DemoCtrl as ctrl" layout="column" ng-cloak>
  <md-content class="md-padding">
    <form ng-submit="$event.preventDefault()" name="searchForm">
      <p>The following example demonstrates floating labels being used as a normal form element.</p>
      <div layout-gt-sm="row">
        <md-input-container flex>
          <label>Name</label>
          <input type="text"/>
        </md-input-container>
        <md-autocomplete flex required
            md-input-name="autocompleteField"
            md-input-minlength="2"
            md-input-maxlength="18"
            md-no-cache="ctrl.noCache"
            md-selected-item="ctrl.selectedItem"
            md-search-text="ctrl.searchText"
            md-items="item in ctrl.querySearch(ctrl.searchText)"
            md-item-text="item.display"
            md-floating-label="Favorite state">
          <md-item-template>
            <span md-highlight-text="ctrl.searchText">{{item.display}}</span>
          </md-item-template>
          <div ng-messages="searchForm.autocompleteField.$error" ng-if="searchForm.autocompleteField.$touched">
            <div ng-message="required">You <b>must</b> have a favorite state.</div>
            <div ng-message="minlength">Your entry is not long enough.</div>
            <div ng-message="maxlength">Your entry is too long.</div>
          </div>
        </md-autocomplete>
      </div>
    </form>
  </md-content>
</div>
	
	
</body>
</html>
