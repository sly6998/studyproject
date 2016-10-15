/**
  공지사항 js 
 */


function noti_write_chek(){
   
   var subject = document.noti_write_form.NOTI_SUBJECT.value;
   var content = document.noti_write_form.NOTI_CONTENT.value;
   
   if(subject == null || subject == ''){
      alert('제목을 입력하여 주세요.');
      return;
      
   }else if(content == null || content ==''){
      alert('내용을 입력하여 주세요.');
      return;
   }
   document.noti_write_form.submit();
}