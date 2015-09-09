/**
 * 
 */
function submitForm(thisObj, thisEvent) {
//   var ecoStatus = $('input[name=status]:checked').val(); // status is a radio button
   var username= $('#username').val();                      // email is an input field
   var password= $('#password').val();
   /*var exportFormat2D= $('#export_2d').val();             // export_2d is a select element
   var exportFormat3D= $('#export_3d').val();             // export_3d is a select element
   var exportSupplier= $('#supplier').val();              // supplier is an input field
   var fromDrawingNumber= $('#old_number').val();         // old_number is an input field
   var partNumbers= $('#part_numbers').val();             // part_numbers is a textarea
   var toDrawingNumber= $('#new_number').val();           // new_number is an input field
*/
   var jsonDataObject = new Object();
   jsonDataObject.username = username;
   jsonDataObject.password = password;
 /*  jsonDataObject.exportFormat2D = exportFormat2D;
   jsonDataObject.exportFormat3D = exportFormat3D;
   jsonDataObject.exportSupplier = exportSupplier;
   jsonDataObject.fromDrawingNumber = fromDrawingNumber;
   jsonDataObject.partNumbers = partNumbers;
   jsonDataObject.toDrawingNumber = toDrawingNumber;
   */

   // turn the jsonData object into a string so it can be passed to the servlet
   var jsonData = JSON.stringify(jsonDataObject);

   $.getJSON("LoginServletUser", {action:"export",json:jsonData}, function(data) {
      alert(data.message);
      $('#return_message').html(data.message);
   });
 
   return false;  // prevents the page from refreshing before JSON is read from server response
}