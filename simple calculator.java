window.calculate = function (){
      var x = document.getElementsByName('x')[0].value;
      var y = document.getElementsByName('y')[0].value;
      var total;
      var selected_index = document.getElementById('choose_operator').selectedIndex;
      var selected_operator = document.getElementById('choose_operator').options[selected_index].value;
      
      
      if (selected_operator == '+'){
        total = parseFloat(x) + parseFloat(y);
      }
      else if (selected_operator == '-'){
        total = parseFloat(x) - parseFloat(y);
      }
      else if(selected_operator == '*'){
       total = parseFloat(x) * parseFloat(y); 
      }
      else{
        total = parseFloat(x) / parseFloat(y)
      }
     
      document.getElementsByName('total')[0].value = total;
    }
    calculate()