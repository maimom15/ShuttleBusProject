<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!-- Compiled and minified CSS -->
	 
	
	<!-- Compiled and minified JavaScript -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
	          
	<link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
	
	<spring:url value="/resources/css/admin.css" var="admincss" />
	<spring:url value="/resources/js/admin.js" var="adminjs" />
	<link href="${admincss}" rel="stylesheet" />
	<script src ="${adminjs}" type="text/javascript"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		 $('ul .tabs').tabs();
		    $('.modal').modal();
		    $(".button-collapse").sideNav();
		    $('#modal2').modal();
		    $('select').material_select();
		    $('#modal3').modal();
	});
	
	</script>
</head>
<body>
<nav class="nav-extended">
	<div class="container">
		<div class="nav-wrapper">
      <div class="row nav_row">
			<div class="col s12 m6">
				 <a href="#" class="brand-logo" id='click'>Logo</a>

			</div>
			
			<div class="col s0 l6">
				<ul id="nav-mobile" class="right hide-on-med-and-down">
        <li class="avatar">
      		<img src="https://s-media-cache-ak0.pinimg.com/736x/64/fb/c9/64fbc98e98bebd0c06dc5f9345724658.jpg" alt="" class="circle profile">
   		 </li>
   		 <li><b>Rathana12</b></li>
   		 <li> <button class="btn waves-effect waves-light logout" type="submit" name="action">Logout</button></li>
         
      </ul>
			</div>
		</div>
    </div>
    <div class="nav-content">
      <ul class="tabs tabs-transparent tabs-fixed-width">
        <li class="tab"><a href="#test1" class="active">Schedule</a></li>
        <li class="tab"><a  href="#test2">Report</a></li>
        <li class="tab"><a href="#test3">Shuttle Bus</a></li>
        <li class="tab"><a href="#test4">User</a></li>
        <li class="tab"><a href="#test5">Setting</a></li>
      </ul>
    </div>
	</div>
    
  </nav>
  <div class="container">
  <div id="test1" class="col s12">
  	<div class="row">
  		<div class="col s12">
  			<h5 class="title">Shuttle Bus Information</h5>
  		</div>
  		<div class="col s12">
  			<table class="bordered centered">
        <thead>
          <tr>
              <th>Date</th>
             
              <th>No of Student</th>
              <th>Destination</th>
              <th>Passenger Detail</th>
               <th>Schedule</th>
          </tr>
        </thead>

        <tbody id="getschedule">
          
        </tbody>
      </table>
  		</div>
  		<div id="modal1" class="modal modal-fixed-footer">
    <div class="modal-content">
      <h5 class="modal_title">User Detail on Mon, 12/june/2017</h5>
      <table>
        <thead>
          <tr>
              <th>Name</th>
              <th>Batch</th>
              <th>Role</th>
              <th>Email</th>
              <th>Phone</th>
          </tr>
        </thead>

        <tbody id="detail_pass">
          
        </tbody>
      </table>
    </div>
    <div class="modal-footer">
      <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat">Agree</a>
    </div>
  	</div>
  		
  	<div id="modal2" class="modal modal-fixed-footer">
    <div class="modal-content wrap_modal">
    <div class="">
    	<div class="col s6"> <h6><b>Date:</b> <span>Fri, 12/june/2017</span></h6></div>
    	<div class="col s6"><h6><b>Destination: </b><span class="modal_destination">Kirirom to Phnom Penh</span></h6></div>
    	<div class="col s12 border">
    		<div class="row">
    			<table class="schedule_table">
    				<tr>
    					<td colspan="1">Bus ID: </td>
    					<td colspan="4">
    						<div class="input-field col s7">
							    <select>
							      <option value="" disabled selected>Bus ID</option>
							      <option value="1">B01</option>
							      <option value="2">B02</option>
							      <option value="3">B03</option>
							    </select>
							   
							  </div>
    					</td>
    					<td colspan="1"><div class="right">Total Seat: </div></td>
    					<td colspan="4">
    					<div class="input-field col s7">
											  
				          <input placeholder="Total Seat" id="Total" type="text" class="validate">
				          
				        </div>
							  
    					</td>
    				</tr>
    				<tr>
    					<td colspan="2">Driver Name: </td>
    					<td>
    					<div class="input-field col s7">
											  
				          <input placeholder="Driver Name" id="Driver Name" type="text" class="validate">
				          
				        </div>
    					</td>
    				</tr>
    			</table>
    			
    		</div>
    	</div>
    	
    	<table class="schedule_table">
    		<tr>
    			<td>Customer: </td>
    			<td>
        				<div class="input-field col s8">
          					<input placeholder="Customer" id="Customer" type="text" class="validate">
        				</div>
    			</td>
    			<td>
    				Adult:
    			</td>
    			<td>
    				<div class="input-field col s5">
          					<input placeholder="Adult" id="Adult" type="text" class="validate">
        				</div>
    			</td>
    			<td>
    				Child:
    			</td>
    			<td>
    				<div class="input-field col s5">
          					<input placeholder="Child" id="Child" type="text" class="validate">
        				</div>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				Stuff:
    			</td>
    			<td>
    				<div class="input-field col s8">
          					<input placeholder="Stuff" id="first_name" type="text" class="validate">
        				</div>
    			</td>
    		</tr>
    	</table>
    
    </div>
    
     
  
    </div>
    <div class="modal-footer">
      <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Set</a>
    </div>
  </div>	
   
  </div>
  
  </div>
  <div id="test2" class="col s12">
  	<div class="row">
  	<div class="col s12">
  			<h5 class="title">Shuttle Bus and Passenger Report</h5>
  	</div>
  	<div class="col s12">
  		<div class=" row report_date">
  		<table>
  <tr>
  	<td>
  		<div class="col s4">YEAR: </div>
  	</td>
  	<td>
	  	<div class=" input-field col s8">
	  		<select>
			      <option value="" disabled selected>Year</option>
			      <option value="1">2017</option>
			      <option value="2">2016</option>
			      <option value="3">2015</option>
	    	</select>
	  	</div>
  	</td>
  	<td>
  		<div class="col s4">MONTH: </div>
  	</td>
  	<td>
	  	<div class=" input-field col s10">
	  		<select>
			      <option value="" disabled selected>Month</option>
			      <option value="1">January</option>
			      <option value="2">February</option>
			      <option value="3">March</option>
			       <option value="4">April</option>
			      <option value="5">May</option>
			      <option value="6">June</option>
			       <option value="7">July</option>
			      <option value="8">August</option>
			      <option value="9">September</option>
			       <option value="10">October</option>
			      <option value="11">November	</option>
			      <option value="12">December</option>
	    	</select>
	  	</div>
  	</td>
  	<td>
  		<div class="col s4">WEEK: </div>
  	</td>
  	<td>
	  	<div class=" input-field col s8">
	  		<select>
			      <option value="" disabled selected>Week</option>
			      <option value="1">Week 1</option>
			      <option value="2">Week 2</option>
			      <option value="3">Week 3</option>
			      <option value="3">Week 4</option>
	    	</select>
	  	</div>
  	</td>
  	<td>
  		<div class="col s4"><button class="btn waves-effect waves-light">Report</button></div>
  	</td>
  	
  </tr>

  </table>
  			
 </div>
  	

  	</div>
  		
  		<div class="col s12">
  			<table class="centered bordered">
        <thead>
          <tr>
              <th>Name</th>
              <th>Item Name</th>
              <th>Item Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Alvin</td>
            <td>Eclair</td>
            <td>$0.87</td>
          </tr>
          <tr>
            <td>Alan</td>
            <td>Jellybean</td>
            <td>$3.76</td>
          </tr>
          <tr>
            <td>Jonathan</td>
            <td>Lollipop</td>
            <td>$7.00</td>
          </tr>
        </tbody>
      </table>
  		</div>
  	</div>
  </div>
  <div id="test3" class="col s12">
  	<div class="row">
  	<div class="col s12">
  			<h5 class="title">List of Shuttle Bus</h5>
  	</div>
  		<div class="col s12">
  			<table class="centered bordered">
        <thead>
          <tr>
              <th>Bus ID</th>
              <th>Number of Seats</th>
              <th>Bus Modal</th>
               <th>Image</th>
              <th>Plate Number</th>
              <th>Option</th>
          </tr>
        </thead>

        <tbody id="schedule">
          <tr>
            <td>B 01</td>
            <td>24</td>
            <td>01</td>
            <td>Student</td>
            <td>5-A34L</td>
            <td><a href="#">Edit</a> / <a href="#">Delete</a></td>
          </tr>
          
        </tbody>
      </table>
  		</div>
  		<div class="col s12">
  		<div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
          <a class="btn-floating waves-effect waves-light btn-large" href="#modal3">
            <i class="material-icons">add</i>
          </a>
        </div>
  			
  		</div>
  		<div class="col s12">
  		

  <!-- Modal Structure -->
  <div id="modal3" class="modal modal-fixed-footer modal_new_bus">
  <div class="row">
    <div class="modal-content">
    	
    		<div class="col s12"><h5 class="title_new_bus">New Shuttle Bus</h5></div>
    		<div class="col s12">
    			<table>
    				<tr>
    					<td>Bus ID: </td>
    					<td>
    						  <div class="input-field col s10">
					          <input placeholder="Placeholder" id="first_name" type="text" class="validate">
					          
					        </div>
    					</td>
    					<td>Bus Model: </td>
    					<td>
    						 <div class="input-field col 10">
					          <input placeholder="Placeholder" id="first_name" type="text" class="validate">
					          
					        </div>
    					</td>
    				</tr>
    				<tr>
    					<td>Plate Number: </td>
    					<td>
    						 
							 <div class="input-field col s8">
					          <input placeholder="Placeholder" id="first_name" type="text" class="validate">
					          
					        </div>
    					</td>
    					<td>Bus Image: </td>
    					<td>
    						<a href="file:///C:\">&nbsp &nbsp &nbsp &nbsp<i class="material-icons">directions_car</i></a>
    					</td>
    				</tr>
    				<tr>
    					<td>Total No of Seats: </td>
    					<td>
    						<div class="input-field col s8">
					          <input placeholder="Placeholder" id="first_name" type="text" class="validate">
					          
					        </div>
    					</td>
    					
    				</tr>
    			</table>
    		</div>

    	</div>
      
      
    </div>
    <div class="modal-footer">
      <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Agree</a>
    </div>
  </div>

  		</div>
  	</div>
  </div>
  <div id="test4" class="col s12">
  	<div class="row">
  	<div class="col s12">
  			<h5 class="title">List of User</h5>
  	</div>
  		<div class="col s12">
  			<table class="centered bordered">
        <thead>
          <tr>
              <th>No</th>
              <th>User ID</th>
              <th>Name</th>
               <th>Password</th>
              <th>Batch</th>
              <th>Email</th>
              <th>Gender</th>
              <th>Role</th>
              <th>Phone</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>1</td>
            <td>KITSE1525</td>
            <td>Rathana</td>
            <td>12345678</td>
            <td>2</td>
            <td>varathana15@kit.edu.kh</td>
            <td>Male</td>
            <td>Student</td>
            <td>096448524</td>
          </tr>
          <tr>
            <td>2</td>
            <td>KITSE1525</td>
            <td>Rathana</td>
            <td>12345678</td>
            <td>2</td>
            <td>varathana15@kit.edu.kh</td>
            <td>Male</td>
            <td>Student</td>
            <td>096448524</td>
          </tr>
          <tr>
            <td>3</td>
            <td>KITSE1525</td>
            <td>Rathana</td>
            <td>12345678</td>
            <td>2</td>
            <td>varathana15@kit.edu.kh</td>
            <td>Male</td>
            <td>Student</td>
            <td>096448524</td>
          </tr>
        </tbody>
      </table>
  		</div>
  		<div class="col s12">
  		<div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
          <a class="btn-floating waves-effect waves-light btn-large" href="#modal4">
            <i class="material-icons">add</i>
          </a>
        </div>
  			
  		</div>
  		<div class="col s12">
  		

  <!-- Modal Structure -->
  <div id="modal4" class="modal modal-fixed-footer ">
  <div class="row">
    <div class="modal-content">
    	
    		<div class="col s12"><h5 class="title_new_bus">Add New User</h5></div>
    		<div class="col s12">
    			<table>
    				<tr>
    					<td>User ID: </td>
    				
    						 <td>
    						 
							 <div class="input-field col s10">
					          <input placeholder="Placeholder" id="first_name" type="text" class="validate">
					          
					        </div>
    					</td>
    					</td>
    					<td>Bus Model: </td>
    					<td>
    						<div class="input-field col s10">
							    <select>
							      <option value="" disabled selected>Batch</option>
							      <option value="1">Batch1</option>
							      <option value="2">Batch2</option>
							      <option value="3">Batch3</option>
							      
							    </select>
							 </div>
    					</td>
    				</tr>
    				<tr>
    					<td>Name: </td>
    					<td>
    						 
							 <div class="input-field col s10">
					          <input placeholder="Placeholder" id="first_name" type="text" class="validate">
					          
					        </div>
    					</td>
    					<td>Bus Image: </td>
    					<td>
    						<div class="input-field col s10">
							    <select>
							      <option value="" disabled selected>Gender</option>
							      <option value="male">Male</option>
							      <option value="female">Female</option>
							     
							      
							    </select>
							 </div>
    					</td>
    				</tr>
    				<tr>
    					<td>Password: </td>
    					<td>
    						 
							 <div class="input-field col s10">
					          <input placeholder="Placeholder" id="first_name" type="password" class="validate">
					          
					        </div>
    					</td>
    					<td>Role: </td>
    					<td>
    						<div class="input-field col s10">
							    <select>
							      <option value="" disabled selected>Role</option>
							      <option value="male">Student</option>
							      <option value="female">Stuff</option>
							      
							     
							    </select>
							 </div>
    					</td>
    				</tr>
    				<tr>
    					<td>Email: </td>
    					<td>
    						 
							 <div class="input-field col s10">
					          <input placeholder="Placeholder" id="first_name" type="password" class="validate">
					          
					        </div>
    					</td>
    					<td>phone Number: </td>
    					<td>
    						<div class="input-field col s10">
					          <input placeholder="Placeholder" id="first_name" type="password" class="validate">
					          
					        </div>
    					</td>
    				</tr>
    			</table>
    		</div>

    	</div>
      
      
    </div>
    <div class="modal-footer">
      <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Agree</a>
    </div>
  </div>

  		</div>
  </div>
  <div id="test5" class="col s12">Test 4</div>
  </div>
</div>
<footer class="page-footer">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Footer Content</h5>
                <p class="grey-text text-lighten-4">You can use rows and columns here to organize your footer content.</p>
              </div>
              <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Links</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 1</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 2</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 3</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            © 2014 Copyright Text
            <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
            </div>
          </div>
        </footer>        
</body>
<script type="text/javascript">
$(document).ready(function(){
	
	
	var row={"phnom_penh":[],"Kirirom":[]};
	
	var student_k=0;
	var student_p=0;
	var staff;
	var customer;
	var key;
	
	var full=[[],[],[],[]];
	var generneted={"date":[],"destination":[],"data":[]};
		console.log("click");
		
		 $.ajax({
			 	async:false,
			 	cache:false,
				type : "GET",
				contentType : "application/json",
				url : "schedule",
				
				
				timeout : 100000,
				success : function(data) {
					var p=0;
					var k=0;
					console.log(data);
					for(var i=0;i<data.length;i++){
						key=Object.keys(data[i])[0];
						
						for(var j=0;j<data[i][key].length;j++){
							
						if(data[i][key][j]['destination']=="phnom penh"){
							if(data[i][key][j]['role']=="student"){
								student_p++;
								
							}
						
							row["phnom_penh"][p]={"full_name":data[i][key][j]['full_name']
							,"email":data[i][key][j]['email']
							,"phone":data[i][key][j]['phone']
							,"role":data[i][key][j]['role']
							,"batch":data[i][key][j]['batch']}
							
							p++;
							console.log(p);
						}
						
						else if(data[i][key][j]['destination']=="Kirirom"){
							
							if(data[i][key][j]['role']=="student"){
								student_k++;
								
								
							}
							
							console.log(k);
							row["Kirirom"][k]={"full_name":data[i][key][j]['full_name']
							,"email":data[i][key][j]['email']
							,"phone":data[i][key][j]['phone']
							,"role":data[i][key][j]['role']
							,"batch":data[i][key][j]['batch']}
							
							k++;
							
						}
						
						}
						if(k){
							full[i].push({"date":key,"destination":"Kirirom","student":student_k,"pass":row["Kirirom"]});
							k=0;
							student_k=0;
							row["Kirirom"]=[];
						}
						if(p){
							
							full[i].push({"date":key,"destination":"Phnom Penh","student":student_p,"pass":row["phnom_penh"]});
							p=0
							student_p=0;
							row["phnom_penh"]=[];
						}
						
					}
					
					console.log(full);
					var tr='<tr>';
					var td ='';
					for(var k=0;k<full.length;k++){
						for(var l=0;l<full[k].length;l++){
							
							td = "<td>" + full[k][l]["date"] + "</td>" 
							+ "<td>" + full[k][l]["student"] + "</td>"
							+ "<td>" + full[k][l]["destination"] + "</td>"
							+ '<td class="detail" value="'+full[k][l]["date"]+'->' +full[k][l]["destination"]+ '"> <a class="modal-trigger" href="#modal1">Detail</a></td>'
							+ '<td class="set_schedule"><a class="modal-trigger" href="#modal2">Set</a></td>';
							tr = tr+td +'</tr>';
						}
						
					}
					
					
					document.getElementById('getschedule').innerHTML = tr;
				},
				error : function(e) {
					console.log("ERROR: ", e);
					
				},
				done : function(e) {
					console.log("DONE");
				}
			});
		 $(".detail").click(function() {
		
			var tr ='<tr>';
			var td ='';
			var date1;
			var date2;
			var arr = $(this).attr('value').split('->');
			
			
			date1=arr[0].replace(/\s+$/, '');
			for(var i=0;i<full.length;i++){
				
				for(var j=0;j<full[i].length;j++){
					
					
				
					
					if(date1==full[i][j]["date"]&&arr[1]==full[i][j]["destination"]){
						
						for(var d=0;d<full[i][j]["pass"].length;d++){
							td ='<td>' + full[i][j]["pass"][d]["full_name"] + '</td>'
							+ '<td>' + full[i][j]["pass"][d]["batch"] + '</td>'
							+ '<td>' + full[i][j]["pass"][d]["role"] + '</td>'
							+ '<td>' + full[i][j]["pass"][d]["email"] + '</td>'
							+ '<td>' + full[i][j]["pass"][d]["phone"] + '</td>'
							
							tr = tr + td + '</tr>';
							
						}
						
					}
						
					
				}
			}
			
			document.getElementById('detail_pass').innerHTML = tr;
			
		 });
	
	
});


</script>
</html>