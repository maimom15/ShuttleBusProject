<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <title>Student</title>

  <!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
  <link rel="stylesheet" href="https://unpkg.com/flatpickr/dist/flatpickr.min.css">
    </head>
  <style type="text/css">
  	.pickmeup .pmu-instance nav {
  		height: 25px!important;
  		background-color: black;
  	}
  	input[type=text]:not(.browser-default){
  		    border-bottom: 0px solid #9e9e9e!important;
  	}
  	.input-field{
  		height: 39px;
  		margin-top: -3px;
  		margin-bottom: -3px;
  	}
  	.bookingBtn{
  		width: 100%;
  		height: 100%;
  	}
  	.custom_input{
  		border-right: 1px solid #f8f4f4;
  	}
  	.row_book{
  		background: white;
  		padding: 0;
  		border-radius: 2px;
  	}
  	.custom_book{
  		margin: 0;
  		border-radius: 0;
  		background-color: blue; 
  	}
  	.sch_table{
  		border: 1 solid black!important;
  	} 
  	.mobile_schedule{
  		width: 100%;
  	}
  	.profile{
  		width: 60px;
  		height: 60px;
  	}
  	.dropdown-user-info{
  		height: 64px;
  	}
  	[type="radio"]:not(:checked) + label::before, [type="radio"]:not(:checked) + label::after {
  		  border: 2px solid #fffdfc;
		}
		[type="radio"]:checked + label::after, .with-gap[type="radio"]:checked + label::after {
		    background-color: White;
		}
		[type="radio"]:checked + label::after, .with-gap[type="radio"]:checked + label::before, .with-gap[type="radio"]:checked + label::after {
		    border: 2px solid #FFFFFF;
		}
	.option_label{
		color: white;
	}
  </style>

</head>
<body>
   <nav class="light-blue lighten-1" role="navigation">
    <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo">Logo</a>
      <ul class="right hide-on-med-and-down">
      	<li>
        	<a class="dropdown-icon" href="#" data-activates='request'><i class="large material-icons">dialpad</i></a>
        </li>
        <li>
        	<a href="#" class="dropdown-user-info" href="#" data-activates='user_info'><img src="https://s-media-cache-ak0.pinimg.com/736x/64/fb/c9/64fbc98e98bebd0c06dc5f9345724658.jpg" alt="" class="responsive-img circle profile"></a>
        </li>
      </ul>

      <!-- Dropdown .dropdown-icon -->
	  <ul id='request' class='dropdown-content'>
	    <li><a href="#!">Emergency Booking</a></li><li class="divider"></li>
	    <li><a href="#!">Donate Ticket</a></li><li class="divider"></li>
	  </ul>

	  <ul id='user_info' class='dropdown-content'>
	    <li><a href="#!">Name:Mai Mom</a></li><li class="divider"></li>
	    <li><a href="#!">UserID: KITSE1510</a></li><li class="divider"></li>
	    <li><a href="#!">No.Ticket:&nbsp &nbsp<span>10</span></a></li>
	    <li><a href="#!">Log Out</a></li><li class="divider"></li>
	  </ul>

	  <ul id="nav-mobile" class="side-nav">
	    <li>
	    	<div class="user-view">
		      <div class="background">
		        <img src="images/office.jpg">
		      </div>
		      <a href="#!user"><img class="responsive-img circle profile" src="images/yuna.jpg"></a>
		      <a href="#!name"><span class="white-text name">John Doe</span></a>
		      <a href="#!email"><span class="white-text email">jdandturk@gmail.com</span></a>
		    </div>
	    </li>
	    <li><a href="#!"><i class="material-icons">cloud</i>First Link With Icon</a></li>
	    <li><a href="#!">Second Link</a></li>
	    <li><div class="divider"></div></li>
	    <li><a class="subheader">Subheader</a></li>
	    <li><a class="waves-effect" href="#!">Third Link With Waves</a></li>
  	</ul>
	<br>
  	<ul id="nav-mobile" class="side-nav">
        <li>
	        <div class="user-view">
		      <div class="background">
		        <img src="https://s-media-cache-ak0.pinimg.com/736x/64/fb/c9/64fbc98e98bebd0c06dc5f9345724658.jpg">
		      </div>
		      <a href="#!user"><img class="circle" src="https://s-media-cache-ak0.pinimg.com/736x/64/fb/c9/64fbc98e98bebd0c06dc5f9345724658.jpg"></a>
		      <a href="#!name"><span class="white-text name">John Doe</span></a>
		      <a href="#!email"><span class="white-text UserID">KITSE1510</span></a>
		    </div>
	    </li>
	    <li><a href="#!">Emergency Booking</a></li>
	    <li><div class="divider"></div></li>
	    <li><a href="#!">Donate Ticket</a></li>
	    <li><div class="divider"></div></li>
	    <li><a href="#!"><i class="material-icons">settings</i>Setting</a></li>
      </ul>

      
      <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
    </div>
  </nav>
  <div class="container">
  	<br>
      <h5 class="header center orange-text"><b>vKirirom Shuttle Bus System</b></h5>
      <p class="header col s12 light center">A modern responsive front-end framework based on Material Design</p>
  </div>
  <div id="session" class="section">    
      <div class="light-blue lighten-1 hide-on-med-and-down">
      		<br><br>
      		<div class="container">
      		   <form id="SelectRadio">
				    <span>
				    	<input class="with-gap" name="option_way" type="radio" id="roundWay" value="RoundWay" checked="checked"/>
				        <label class="option_label" for="roundWay">Round Ways</label>
				    </span>
				    <span>
				    	<input class="with-gap" name="option_way" type="radio" id="oneWay" value="OneWay"/>
				        <label class="option_label" for="oneWay">One Way</label>
				    </span>	  
				</form>
				<br>
		      <div class="row row_book">
		        <div class="col s12 l3 custom_input">
			   		<div id="getSelectFrom" class="input-field s6"></div>
			   	</div>
		        <div class="col s12 l3 custom_input">
			   		<div id="getSelectTo" class="input-field s6">      
				      <select class="validate">
				        <option value="" disabled selected>To</option>
				      </select>
				    </div>
			   	</div>
			   	<div class="col s12 l3">
			   		<div class="input-field s6 flatpickr">
				   		<input type="text" placeholder="Select Date" id="check_in_date" data-input class="input flatpickr-input active"> 
					</div>
			   	</div>
			   	<div class="col s12 l3 custom_book light-blue lighten-1">
			   		<a class="btn orange lighten-1 bookingBtn" id="book_now">Book Now</a>   			
			   	</div>
		      </div>
		    </div>
		    <br><br>
      </div>
      <div class="light-white lighten-1 hide-on-large-only container">
      		<div class="row">
		        <div class="col s12">
			   		<div id="getMobileSelectFrom" class="input-field s6"></div>
				    <br>
			   	</div>
		        <div class="col s12">
			   		<div id="getMobileSelectTo" class="input-field s6">      
				      <select class="validate">
				        <option value="" disabled selected>To</option>
				      </select>
				    </div>
				    <br>
			   	</div>
			   	<div class="col s12 l3">
			   		<div class="input-field s6 flatpickr">
				   		<input type="text" placeholder="Select Date" data-input class="input flatpickr-input active"> 
					</div>
					<br>
			   	</div>
			   	<div class="col s12 l3">
			   		<a class="btn orange lighten-1 bookingBtn">Book Now</a>   			
			   	</div>
		      </div>
      </div>
  </div>
  <div class="container hide-on-med-and-down" >
   	 <h5 class="center sch">Schedule for this Week</h5><br>
      <table class="centered highlight bordered">
        <thead>
          <tr>
              <th>Date</th>
              <th>Destination</th>
              <th>Bus ID</th>
              <th>Bus Driver</th>            
              <th>Total Seats</th>
              <th>Customer</th>
              <th>Staff</th>
              <th>Student</th>
              <th>Remaining</th>
              <th>Passenger</th>
          </tr>
        </thead>

        <tbody id="getSchedule"></tbody>
      </table>
      <br><br>
    </div>
    <div class="container">
    	<!-- Modal Structure -->
	  <div id="user_detail" class="modal modal-fixed-footer">
		    <div class="modal-content">
		      <h5 class="center">List of Passengers</h5>
		      <table class="centered highlight">
		        <thead>
		          <tr>
		              <th>No.</th>
		              <th>UserID</th>
		              <th>Name</th>
		              <th>Batch</th>
		              <th>Role</th>
		              <th>Seat Number</th>
		              <th>Status</th>
		          </tr>
		        </thead>
		
		        <tbody>
		          <tr>
		          	  <td>1</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		        </tbody>
		      </table>
		    </div>
		    <div class="modal-footer">
		      <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Agree</a>
		    </div>
		  </div>
    </div>

  <footer class="page-footer light-blue lighten-1">
    <div class="container">
      <div class="row">
        <div class="col l6 s12">
          <h5 class="white-text">Company Bio</h5>
          <p class="grey-text text-lighten-4">We are a team of college students working on this project like it's our full time job. Any amount would help support and continue development on this project and is greatly appreciated.</p>
        </div>
        <div class="col l3 s12 hide-on-med-and-down">
        </div>
        <div class="col l3 s12 hide-on-med-and-down">
          <h5 class="white-text ">Connect</h5>
          <ul>
            <li><a class="white-text" href="#!">Link 1</a></li>
            <li><a class="white-text" href="#!">Link 2</a></li>
            <li><a class="white-text" href="#!">Link 3</a></li>
            <li><a class="white-text" href="#!">Link 4</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="footer-copyright">
      <div class="container">
      Made by <a class="orange-text text-lighten-3" href="http://materializecss.com">Materialize</a>
      </div>
    </div>
  </footer>



  <!--  Scripts-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js"></script> 
  <script src="https://unpkg.com/vue"></script>
  <script src="https://unpkg.com/flatpickr"></script>
  <script type="text/javascript">


	
	$(document).ready(function() {
		var date_of_travel=[];
		var checkDate=true;
		var destinationId=[];


		 $('.dropdown-icon, .dropdown-user-info').dropdown({
		      inDuration: 300,
		      outDuration: 225,
		      constrainWidth: false, // Does not change width of dropdown to that of the activator
		      hover: true, // Activate on hover
		      gutter: 0, // Spacing from edge
		      belowOrigin: true, // Displays dropdown below the button
		      alignment: 'left', // Displays dropdown with edge aligned to the left of button
		      stopPropagation: false // Stops event propagation
		    }
		  );
		 $(".button-collapse").sideNav();
   		 $('select').material_select();
          
   		 $('.modal').modal();


   		 $(".flatpickr input").flatpickr({
				mode: "range",
			    minDate: "today",
			    dateFormat: "d-m-Y"
			});



   		 var destination="";  		 
   		 $.ajax({
				type : "POST",
				contentType : "application/json",
				url : "booking_service",
				timeout : 100000,
				success : function(data) {
					destination=data;
					var select='<select id="fromDes" class="validate"><option value="" disabled selected>From</option>'
					console.log(data);
					for(i=0;i<data.length();i++){
						select +='<option value="'+data[i].id+'">'+data[i].name+'</option>';								
						};
						select+='</select>';
						document.getElementById("getSelectFrom").innerHTML = select;
						$('#formDes').material_select();
				},
				error : function(e) {
					console.log("ERROR: ", e);
				},
				done : function(e) {
					console.log("DONE");
				}
			});
   		 
   		 
   		//schedule data
   		var scheduleForm=null;
   		$.ajax({
   					type : "POST",
   					contentType : "application/json",
   					url : "booking_service",
   					timeout : 100000,
   					success : function(data) {
   						scheduleForm+='<tr><td>'+data.date_of_travel
							+'</td><td>'+data.destination
							+'</td><td>'+data.bus_id
							+'</td><td>'+data.driver
							+'</td><td>'+data.totalSeat
							+'</td><td>'+data.Custom
							+'</td><td>'+data.staff
							+'</td><td>'+data.student
							+'</td><td>'+data.remainingSeat
							+'</td><td><a href="'+schedule_id
					        +'">detail</a></td></tr>';
					    document.getElementById("getSchedule").innerHTML=scheduleForm;
   					},
   					error : function(e) {
   						console.log("ERROR: ", e);
   					},
   					done : function(e) {
   						console.log("DONE");
   					}
   				});
   		 

   		 //handle event select destinaton
   		 $('#formDes').change(function(){      
			destinationId[1] = $("#fromDes").val();
			var select='<select id="toDes" class="validate"><option value="" disabled selected>From</option>' 
			for(i==0;i<destination.length();i++){
				if(destination[i].id!=from){
					select +='<option value="'+data[i].id+'">'+data[i].name+'</option>';
				}
			}
			select+='</select>';
			document.getElementById("getSelectTo").innerHTML = select;
			$('#toDes').material_select();
		 });
		 $('#toDes').change(function(){      
			destinationId[0] = $("#toDes").val();
		 });	


		 //handle date select
		 $('#roundWay').change(function(){
		 	checkDate=true;
		 	console.log("round");
			$(".flatpickr input").flatpickr({
				mode: "range",
				minDate: "today",
				dateFormat: "d-m-Y"
			});
		 })
		 $('#oneWay').change(function(){
		 	checkDate=false;
		    $(".flatpickr input").flatpickr({
				mode: "single",
				minDate: "today",
				dateFormat: "d-m-Y"
			});
		 })
   		 $('#check_in_date').change(function(){      
			if(checkDate){
				date_of_travel = $('#check_in_date').val().split('to');
	   		 	console.log(date_of_travel);	
	   		} 		
	   		else{
	   		 	date_of_travel = $('#check_in_date').val();
	   		 	console.log(date_of_travel)	
	   		}  
			});
		 
		//Booking Select
		 $('book_now').change(function(){
			 var date_of_booking =new Date($.now());
		      console.log("Hello");
		      	if(true){
		      		submit = [];
		      		for(i=0;i<iteration;i++){
		      			submit[i]= destinationId[i];
			      		submit[i]= date_of_travel[i];
			      		submit[i]= date_of_booking;
		      		}
		      		$.ajax({
						type : "POST",
						contentType : "application/json",
						url : "booking_service",
						data : JSON.stringify(test),
						timeout : 100000,
						success : function(data) {
							document.location.href = '/ShuttleBusSystem/users/'+data;		
						},
						error : function(e) {
							console.log("ERROR: ", e);
							
						},
						done : function(e) {
							console.log("DONE");
						}
					});
		      	}		 
		 });
   	
});

 </script>

  </body>
</html>