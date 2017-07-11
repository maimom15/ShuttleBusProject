<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">

  <!-- Compiled and minified JavaScript -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>


	<spring:url value="/resources/js/teacher.js" var="teacherjs" />
	<script src="${teacherjs}" type="text/javascript"></script>
	<spring:url value="/resources/css/teacher.css" var="teacher" />
	<link href="${teacher}" rel="stylesheet" />
	
	
	
	
</head>
<body>
<!--Header-->
<div class="navbar-fixed">
    <nav>
      <div class="nav-wrapper container">
        <a href="#!" class="brand-logo">Logo</a>
        <ul class="right hide-on-med-and-down">
          <li><p>No.of Ticket available: <span class="new badge" data-badge-caption="/18">4</span></p></li>
          <li><a href="#"><img src="https://s-media-cache-ak0.pinimg.com/736x/64/fb/c9/64fbc98e98bebd0c06dc5f9345724658.jpg" alt="" class="responsive-img circle"></a></li>
          <li><a class="username">Mai Mom</a></li>
          <li><a class="btn">Log out</a></li>
        </ul>
      </div>
    </nav>
  </div>
<!--body-->
<div id="BookingSession">
<div  class="container"> 
	<h4 class="center-align title"><b>vKirirom Shuttle Bus</b></h4>
	<p class="center-align title">Visit our restaurant and savour our dishes special our chef has to offer and or stay in one of our innovative rooms</p>

	  <form action="#">
	    <span>
	    	<input class="with-gap" name="option_way" type="radio" id="roundWay" value="RoundWay" checked="checked" />
	        <label for="roundWay">Round Ways</label>
	    </span>
	    <span>
	    	<input class="with-gap" name="option_way" type="radio" id="oneWay" value="OneWay"/>
	        <label for="oneWay">One Way</label>
	    </span>	  
	  </form>
 
	  <div id="Round" class="row">
	  <div>
	  	<div class="col s12 m6 l3">
	   		<div id="from_round" class="input-field s6">      
		      <select id="fromDes_round" class="validate">
		        <option value="" disabled selected>From</option>
		        <option id="selectf1" value="Kirirom">Kirirom</option>
		        <option id="selectf2" value="Phnom Penh">Phnom Penh</option>
		      </select>
		    </div>
	   	</div>
	    <div  class="col s12 m6 l3">
	    	<div id="to_round"  class="input-field s6">      
		      <select id="toDes_round" class="validate">
		        <option value="" disabled selected>To</option>
		      </select>
		    </div>
	    </div>
	    <div class="col s12 m6 l3"><input type="date" class="datepicker"></div>
		<div class="col s12 m6 l3"><input type="date" class="datepicker"></div>
	  </div>
	   	<div class="row">  		
		<a class="right btn bookRound bookNow">button</a>
	   	</div>
	  </div>
	  <div id="One" class="row">
	  	<div class="col s12 m6 l3">
	   		<div id="from_one" class="input-field s6">      
		      <select id="fromDes_one" class="validate">
		        <option value="" disabled selected>From</option>
		        <option id="selectf1" value="Kirirom">Kirirom</option>
		        <option id="selectf2" value="Phnom Penh">Phnom Penh</option>
		      </select>
		    </div>
	   	</div>
	    <div  class="col s12 m6 l3">
	    	<div id="to_one"  class="input-field s6">      
		      <select id="toDes_one" class="validate">
		        <option value="" disabled selected>To</option>
		      </select>
		    </div>
	    </div>

	    <div class="col s12 m6 l3"><input type="date" class="datepicker"></div>
		<div class="col s12 m6 l3"><a class="btn bookOne bookNow">Book Now</a></div>    
</div>
</div>
</div>
<!-- Schedule  -->
<div id="ScheduleSession">
	<div class="container" >
   	 <h5 class="center sch">Schedule for this Week</h5>
      <table class="centered highlight">
        <thead>
          <tr>
              <th>Date</th>
              <th>Bus ID</th>
              <th>Bus Driver</th>
              <th>Destination</th>
              <th>Total Seats</th>
              <th>Customer</th>
              <th>Staff</th>
              <th>Student</th>
              <th>Remaining</th>
              <th>Passenger</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Fri, 09/june/2017</td>
            <td>B001</td>
            <td>Mr.Heng</td>
            <td>Kirirom to Phnom Penh</td>
            <td>24</td>
            <td>02</td>
            <td>00</td>
            <td>02</td>
            <td>20</td>
            <td><a href="#modal1">detail</a></td>
          </tr>
          <tr>
            <td>Fri, 09/june/2017</td>
            <td>B001</td>
            <td>Mr.Heng</td>
            <td>Kirirom to Phnom Penh</td>
            <td>24</td>
            <td>02</td>
            <td>00</td>
            <td>02</td>
            <td>20</td>
            <td><a href="#modal1">detail</a></td>
          </tr>
          <tr>
            <td>Fri, 09/june/2017</td>
            <td>B001</td>
            <td>Mr.Heng</td>
            <td>Kirirom to Phnom Penh</td>
            <td>24</td>
            <td>02</td>
            <td>00</td>
            <td>02</td>
            <td>20</td>
            <td><a href="#modal1">detail</a></td>
          </tr>
        </tbody>
      </table>
      <!-- Modal Structure -->
	  <div id="modal1" class="modal modal-fixed-footer">
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
		          <tr>
		          	  <td>2</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		          <tr>
		          	  <td>3</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		          <tr>
		          	  <td>4</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		          <tr>
		          	  <td>5</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		          <tr>
		          	  <td>6</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		          <tr>
		          	  <td>7</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		          <tr>
		          	  <td>8</td>
		              <td>KITSE1410</td>
		              <td>Heng Visal</td>
		              <td>01</td>
		              <td>Student</td>
		              <td>01</td>
		              <td><a class="waves-effect waves-light btn">Cancel</a></td>
		          </tr>
		          <tr>
		          	  <td>9</td>
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
         
      <div class="row">
      <div class="col s12 emergencyRequest"> 
          <a id="emer" href="#emergencyModals">Request Emergency Booking</a></div>
      </div>
       <!-- Emergency -->
       <!-- Modal Structure -->
		<div id="emergencyModals" class="modal modal-fixed-footer">
		    <div class="modal-content">
		      <h5 class="center">Schedule for this Week</h5>
			      <table class="centered highlight">
			        <thead>
			          <tr>
			              <th>Date</th>
			              <th>Bus ID</th>
			              <th>Bus Driver</th>
			              <th>Destination</th>
			              <th>Total Seats</th>
			              <th>Remaining</th>
			              <th>Passenger</th>
			          </tr>
			        </thead>
			
			        <tbody>
			          <tr>
			            <td>Fri, 09/june/2017</td>
			            <td>B001</td>
			            <td>Mr.Heng</td>
			            <td>Kirirom to Phnom Penh</td>
			            <td>24</td>
			            <td>4</td>
			            <td><a class="btn" href="#">Book</a></td>
			          </tr>
			          <tr>
			            <td>Fri, 09/june/2017</td>
			            <td>B001</td>
			            <td>Mr.Heng</td>
			            <td>Kirirom to Phnom Penh</td>
			            <td>24</td>
			            <td>4</td>		  
			            <td><a class="btn" href="#">Book</a></td>
			          </tr>
			          <tr>
			            <td>Fri, 09/june/2017</td>
			            <td>B001</td>
			            <td>Mr.Heng</td>
			            <td>Kirirom to Phnom Penh</td>
			            <td>24</td>
			            <td>4</td>
			            <td><a class="btn" href="#">Book</a></td>
			          </tr>
			        </tbody>
			      </table>
		    </div>
		    <div class="modal-footer">
		      <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Agree</a>
		    </div>
		  </div>  
		  </div>
</div>		  
<!--footer  -->

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

</html>