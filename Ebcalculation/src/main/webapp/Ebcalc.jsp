<!DOCTYPE html>
<html>
<head>
  <title>TNEB Unit Calculation</title>
  <script>
    function calculateUnits() {
      var previousReading = parseFloat(document.getElementById("previousReading").value);
      var currentReading = parseFloat(document.getElementById("currentReading").value);
      
      var unitsConsumed = currentReading - previousReading;
      var cost = unitsConsumed * 7.50; // Assuming cost per unit is 7.50 rupees
      
      document.getElementById("unitsResult").innerHTML = "Units Consumed: " + unitsConsumed;
      document.getElementById("costResult").innerHTML = "Cost: " + cost + " INR";
    }
  </script>
</head>
<body>
  <h1>TNEB Unit Calculation</h1>
  
  <label for="previousReading">Previous Reading:</label>
  <input type="number" id="previousReading" placeholder="Enter previous reading">
  <br><br>
  
  <label for="currentReading">Current Reading:</label>
  <input type="number" id="currentReading" placeholder="Enter current reading">
  <br><br>
  
  <button onclick="calculateUnits()">Calculate Units</button>
  <br><br>
  
  <p id="unitsResult"></p>
  <p id="costResult"></p>
</body>
</html>