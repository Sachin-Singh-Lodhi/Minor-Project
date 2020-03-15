/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var e1,f1,t1,s1,e2,f2,t2,s2,e3,f3,t3,s3,year,sem,course,date,fname,syllabus,topics;
var technical,communication,teaching_aids,pace,motivation,practical,training,clarity,progress,willingness;
var excellent, good, very_good, poor, fair, very_poor;
  function postToDB() {
    e1 = $("#e1").val();e2 = $("#e2").val();e3 = $("#e3").val();
    f1 = $("#f1").val();f2 = $("#f2").val();f3 = $("#f3").val();
    t1 = $("#t1").val();t2 = $("#t2").val();t3 = $("#t3").val();
    s1 = $("#s1").val();s2 = $("#s2").val();s3 = $("#s3").val();
    year = $("#year").val();
    sem = $("#sem option:selected").text();
    course = $("#course option:selected").text();
    date = $("#date option:selected").text();
    fname = $("#fname option:selected").text();
    syllabus = $("#syllabus option:selected").text();
    topics = $("#topics option:selected").text();
    technical = $("#technical option:selected").text();
    communication = $("#communication option:selected").text();
    teaching_aids = $("#teaching_aids option:selected").text();
    pace = $("#pace option:selected").text();
    motivation = $("#motivation option:selected").text();
    practical = $("#practical option:selected").text();
    training = $("#training option:selected").text();
    clarity = $("#clarity option:selected").text();
    progress = $("#progress option:selected").text();
    willingness = $("#willingness option:selected").text();
    
    
    if (syllabus === "Excellent") excellent++;
    else if (syllabus === "Very good") very_good++;
    else if (syllabus === "Good") good++;
    else if (syllabus === "Fair") fair++;
    else if (syllabus === "Poor") poor++;
    else very_poor++;
    if (topics === "Excellent") excellent++;
    else if (topics === "Very good") very_good++;
    else if (topics === "Good") good++;
    else if (topics === "Fair") fair++;
    else if (topics === "Poor") poor++;
    else very_poor++;
    if (technical === "Excellent") excellent++;
    else if (technical === "Very good") very_good++;
    else if (technical === "Good") good++;
    else if (technical === "Fair") fair++;
    else if (technical === "Poor") poor++;
    else very_poor++;
    if (communication === "Excellent") excellent++;
    else if (communication === "Very good") very_good++;
    else if (communication === "Good") good++;
    else if (communication === "Fair") fair++;
    else if (communication === "Poor") poor++;
    else very_poor++;
    if (teaching_aids === "Excellent") excellent++;
    else if (teaching_aids === "Very good") very_good++;
    else if (teaching_aids === "Good") good++;
    else if (teaching_aids === "Fair") fair++;
    else if (teaching_aids === "Poor") poor++;
    else very_poor++;
    if (pace === "Excellent") excellent++;
    else if (pace === "Very good") very_good++;
    else if (pace === "Good") good++;
    else if (pace === "Fair") fair++;
    else if (pace === "Poor") poor++;
    else very_poor++;
    if (motivation === "Excellent") excellent++;
    else if (motivation === "Very good") very_good++;
    else if (motivation === "Good") good++;
    else if (motivation === "Fair") fair++;
    else if (motivation === "Poor") poor++;
    else very_poor++;
    if (practical === "Excellent") excellent++;
    else if (practical === "Very good") very_good++;
    else if (practical === "Good") good++;
    else if (practical === "Fair") fair++;
    else if (practical === "Poor") poor++;
    else very_poor++;
    if (training === "Excellent") excellent++;
    else if (training === "Very good") very_good++;
    else if (training === "Good") good++;
    else if (training === "Fair") fair++;
    else if (training === "Poor") poor++;
    else very_poor++;
    if (clarity === "Excellent") excellent++;
    else if (clarity === "Very good") very_good++;
    else if (clarity === "Good") good++;
    else if (clarity === "Fair") fair++;
    else if (clarity === "Poor") poor++;
    else very_poor++;
    if (progress === "Excellent") excellent++;
    else if (progress === "Very good") very_good++;
    else if (progress === "Good") good++;
    else if (progress === "Fair") fair++;
    else if (progress === "Poor") poor++;
    else very_poor++;
    if (willingness === "Excellent") excellent++;
    else if (willingness === "Very good") very_good++;
    else if (willingness === "Good") good++;
    else if (willingness === "Fair") fair++;
    else if (willingness === "Poor") poor++;
    else very_poor++;
    
    
    if(validate()===false){
        swal("Access Denied","Please Enter UserID/Password !","error");
        return;
      }
      
      var data={
          e1:e1,f1:f1,t1:t1,
          s1:s1,e2:e2,f2:f2,
          t2:t2,s2:s2,e3:e3,
          f3:f3,t3:t3,s3:s3,
          year:year,
          sem:sem,course:course,
          date:date,fname:fname,
          excellent: excellent, very_good: very_good,
          good : good, poor: poor, fair: fair, very_poor:very_poor
      };
      $.post("FeedBackControllerServlet",data,processResponse);
}


function processResponse(responseText){
      
      responseText = responseText.trim();
      if(responseText==="error")
      {  swal("Access Denied !","Please Enter  valid UserID/Password !","error");}
      
      else if(responseText.indexOf("jsessionid")!==-1){
            swal("Success !","Login Accepted !","success");
            setTimeout(function(){
                window.location=responseText;
               },3000);
        }
 else {
    swal("Access Denied"," Some Problem Occurred! Please Try in a while.","error");}
  }
  
  function validate(){
    return true;
  }


