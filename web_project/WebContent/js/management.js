/* 회원관리 페이지 js */
function submitSrchForm() {
	document.srchForm.srchKey.value = document.srchForm.srchKey.value
			.trim();
	document.srchForm.submit();
}
function resetSrchForm() {
	document.srchForm.srchFlds[0].selected = true;
	document.srchForm.srchKey.value = "";
}