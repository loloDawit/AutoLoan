function calculateMonthlhyPayment() {
    var loan = $('#amount').val(),
        month = $('#months').val(),
        int = $('#interest').val(),
        years = $('#years').val(),
        down = $('#down').val(),
        amount = parseInt(loan),
        months = parseInt(month),
        down = parseInt(down),
        annInterest = parseFloat(int),
        monInt = annInterest / 1200,
        calculation = ((monInt + (monInt / (Math.pow((1 + monInt), months) -1))) * (amount - (down || 0))).toFixed(2);
  
    return calculation;
    
}
function showMonthlyPayment(){
    var mPayment = document.getElementById("output");
    return mPayment.innerHTML = "$"+calculateMonthlhyPayment(); ;  
}
function showAmortization(){
    //window.open();
    var balance = parseFloat($('#amount').val());
    var interestRate = parseFloat(document.getElementById("interest").value/100.0);
    var terms = parseInt($('#years').val());
    

    var div = document.getElementById("Result");
    div.innerHTML = "";

    var checkAmount = validateInputs(balance); 
    var checkInterset = validateInputs(interestRate);
    var checkTerms = validateInputs(terms); 

    if(checkAmount && checkInterset && checkTerms){
        div.innerHTML += getAmortization(balance,interestRate,terms); 
    }else{
        div.innerHTML += "Please check input."; 
    }
}
function validateInputs(value){
    if((value == null) || (value =="")){
        return false; 
    }else{
        return true; 
    }

}

function getAmortization(balance,interestRate,terms){
    var downP = ($('#down').val()); 
    downP = parseInt(downP); 
    if(downP){
        balance = balance - downP; 
        alert("With a downpayment of "+ downP + " your new balance will be " + balance); 
    }
    
    console.log(balance); 
    console.log(downP); 

    var paymentTerm = terms*12; 
    
    var Result = "Loan amount: $"+ balance.toFixed(2) + "<br />"+
    "Intereset rate: " + (interestRate*100).toFixed(2) + "%<br />"+
    "Number of months: " + paymentTerm+ "<br />"+
    "Monthly payment: $" + calculateMonthlhyPayment() + "<br />"+
    "Interst per Year: "+ calculateInterstPaid(calculateMonthlhyPayment())+"<br />"+
    "Total paid: $"+ (calculateMonthlhyPayment()*terms*12).toFixed(2) + "<br /><br />";
    Result += "<table border='1'><tr><th>No#</th><th>Amount</th>" + 
    "<th>Interest</th><th>Principal</th><th>Balance</th>";

    // amortization calculation
    for(var count = 0; count < paymentTerm; count++){
        var interest = 0; 
        var mPrincipal = 0; 
        var mRate = interestRate/12;
        var mPayment = calculateMonthlhyPayment(); 

        Result += "<tr align=center>";
        Result += "<td >" + (count + 1) + "</td>";    // show each month 
         
        if(balance<mPayment){
            mPayment = (balance).toFixed(2);
        } 
        Result += "<td >" + mPayment + "</td>"; 
        interest = balance * mRate;
        Result += "<td >" + interest.toFixed(2)+ "</td>";
        mPrincipal = calculateMonthlhyPayment() - interest.toFixed(2);
        Result += "<td >" + mPrincipal.toFixed(2)+ "</td>";
         // update the balance 
        balance = balance - mPrincipal;
        Result += "<td >" + balance.toFixed(2) + "</td>"; 
       
        Result += "</tr>"

        
       
        
       
    }


    return Result;
}
function calculateInterstPaid(mPayment){
    return mPayment*12; 

}

// after taking the month input 
// convert it to years 
// method used jQuery keyup() : event listens to keyboard 
$(function(){
	var month = $(this).val(),
      doneTypingInterval = 500,
      months = parseInt(month),
      typingTimer;

  $('#months').keyup(function(){
      month = $(this).val();
      months = parseInt(month);
  
      clearTimeout(typingTimer);
      if (month) {
          typingTimer = setTimeout(doneTyping, doneTypingInterval);
      }
  });

  function doneTyping () {
    $('#years').val(months/12);  
  }
})

$(function(){
	var month = $(this).val(),
      doneTypingInterval = 500,
      months = parseInt(month),
      typingTimer;

  $('#months').keyup(function(){
      month = $(this).val();
      months = parseInt(month);
  
      clearTimeout(typingTimer);
      if (month) {
          typingTimer = setTimeout(doneTyping, doneTypingInterval);
      }
  });

  function doneTyping () {
    $('#years').val(months/12);  
  }
})

$(function(){
	var year = $(this).val(),
      doneTypingInterval = 500,
      years = parseInt(year),
      typingTimer;

  $('#years').keyup(function(){
      year = $(this).val();
      myears = parseInt(year);
  
      clearTimeout(typingTimer);
      if (year) {
          typingTimer = setTimeout(doneTyping, doneTypingInterval);
      }
  });

  function doneTyping () {
    $('#months').val(year * 12);  
  }
})


