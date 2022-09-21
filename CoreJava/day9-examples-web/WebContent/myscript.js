/**
 * 
 */
// by default javascript function returns true
function validateForm() {
	// access the un & pw of the form named login
	let user = document.login.un; // it will access <input name = "un">
	let pass = document.login.pw; // it will access <input name = "pw">
	
	// In Javascript you can create string in ' or "
	if(user.value.length == 0) {
		alert('Username is mandatory'); // warning dialog box
		return false;
	}
	if(pass.value.length == 0) {
		alert('Password is mandatory');
		return false;
	}
	return true; // returns true only when both the 'if' is false
}