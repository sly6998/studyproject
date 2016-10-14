/**
 회원가입 JS
 */

//우편번호 검색
 function execDaumPost() {
  new daum.Postcode(
    {
     oncomplete : function(data) {
      var fullAddr = ''; 
      var extraAddr = ''; 

      if (data.userSelectedType === 'R') { 
       fullAddr = data.roadAddress;

      } else { 
       fullAddr = data.jibunAddress;
      }

      if (data.userSelectedType === 'R') {
       if (data.bname !== '') {
        extraAddr += data.bname;
       }
       if (data.buildingName !== '') {
        extraAddr += (extraAddr !== '' ? ', '
          + data.buildingName : data.buildingName);
       }
       fullAddr += (extraAddr !== '' ? ' (' + extraAddr
         + ')' : '');
      }

      document.getElementById('MEMBER_ADDR_ZIP').value = data.zonecode; 
      document.getElementById('MEMBER_ADDR_1').value = fullAddr;
      document.getElementById('MEMBER_ADDR_2').focus();
     }
    }).open();
 }

 
 //유효성 검사
 function valchk(element){
	 
	 var name_re = /^[가-힣]{2,4}|[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/;
     /*
		한글이름 2~4글자,
		영문이름은 Fistname Lastname 을 사용하므로
		2~10글자 입력 후 한칸 띄고 2~10글자를 입력 받는다
		(영문 2~10글자 (공백) 영문 2~10글자 형식)
	 */
	 var tel_re = /^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/;
	 var email_re =  /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	 var pwd_re = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
	 /* 특수문자 / 문자 / 숫자 포함 형태의 8~15자리 이내의 암호 정규식 */
	 
	 var el_id = element.id;//Element id
	 var el_v = element.value;//Element value
	 
	 if(el_id == 'MEMBER_NAME'){
		 if(el_v == '' || !name_re.test(el_v)){
			 $('#name_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#name_cl').collapse('hide');
		 element.style.borderColor="green";
	 }else if(el_id == 'MEMBER_EMAIL'){
		 if(el_v == '' || !email_re.test(el_v)){
			 $('#email_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#email_cl').collapse('hide');
		 element.style.borderColor="green";
	 }else if(el_id == 'MEMBER_PWD'){
		 if(el_v == '' || !pwd_re.test(el_v)){
			 $('#pwd_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#pwd_cl').collapse('hide');
		 element.style.borderColor="green";
	 }else if(el_id == 'MEMBER_PWD2'){
		 if(el_v != document.getElementById('MEMBER_PWD').value){
			 $('#pwd2_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#pwd2_cl').collapse('hide');
		 element.style.borderColor="green";
	 }else if(el_id == 'MEMBER_TEL'){
		 if(el_v == '' || !tel_re.test(el_v)){
			 $('#tel_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#tel_cl').collapse('hide');
		 element.style.borderColor="green";
	 }else if(el_id == 'MEMBER_ADDR_ZIP'){
		 if(el_v == ''){
			 $('#zip_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#zip_cl').collapse('hide');
		 element.style.borderColor="green";
	 }else if(el_id == 'MEMBER_ADDR_1'){
		 if(el_v == ''){
			 $('#addr1_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#addr1_cl').collapse('hide');
		 element.style.borderColor="green";
	 }else if(el_id == 'MEMBER_ADDR_2'){
		 if(el_v == ''){
			 $('#addr2_cl').collapse('show');
			 element.style.borderBottomColor='red';
			 return;
		 }
		 $('#addr2_cl').collapse('hide');
		 element.style.borderColor="green";
	 }
 }
 
 //회원가입 버튼
 function join(){
 
	if(document.getElementById('MEMBER_NAME').value==''){
		alert('이름을 입력하여 주세요.');
	}else if(document.getElementById('MEMBER_EMAIL').value==''){
		alert('이메일을 입력하여 주세요.');
	}else if(document.getElementById('email_isChk').value == 2){
		alert('이메일을 중복 체크하여 주세요.');
	}else if(document.getElementById('MEMBER_PWD').value==''||document.getElementById('MEMBER_PWD2').value==null){
		alert('비밀번호를 입력하여 주세요.');
	}else if(document.getElementById('MEMBER_ADDR_ZIP').value==''||document.getElementById('MEMBER_ADDR_1').value==''||document.getElementById('MEMBER_ADDR_2').value==''){
		alert('주소를 입력하여 주세요.');
	}else if(document.getElementById('MEMBER_TEL').value==''){
		alert('전화번호를 입력하여 주세요.');
	}else if($(':input[name=MEMBER_GENDER]:radio:checked').val()!='남자'&&$(':input[name=MEMBER_GENDER]:radio:checked').val()!='여자'){
		alert('성별을 선택하여 주세요.');
	}else if(document.getElementById('MEMBER_BIRTH').value==''||document.getElementById('MEMBER_BIRTH').value==null){
		alert('생년월일을 선택하여 주세요.');
	}else{
		document.getElementById('joinform').submit();
	}
 }
 
 //이메일 중복체크
 function isChk_email(){
	 var MEMBER_EMAIL = document.getElementById('MEMBER_EMAIL').value;                
     if(MEMBER_EMAIL == ""){
      alert("중복체크 할 이메일을 입력하여 주세요.");   
      document.getElementById('MEMBER_EMAIL').focus();
     }else{
    	 window.open("overlapEmail.html?MEMBER_EMAIL="+MEMBER_EMAIL,"","width=400 height=150");
     }
 }
