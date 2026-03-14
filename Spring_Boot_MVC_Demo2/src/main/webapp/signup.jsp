<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Page</title>
<style>
	* {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}
	
	body {
		font-family: Arial, sans-serif;
		background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
		min-height: 100vh;
		display: flex;
		justify-content: center;
		align-items: center;
		padding: 20px;
	}
	
	.signup-container {
		background-color: white;
		padding: 40px;
		border-radius: 10px;
		box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
		width: 100%;
		max-width: 450px;
	}
	
	h1 {
		text-align: center;
		color: #333;
		margin-bottom: 30px;
		font-size: 28px;
	}
	
	.form-group {
		margin-bottom: 20px;
	}
	
	label {
		display: block;
		margin-bottom: 8px;
		color: #555;
		font-weight: bold;
	}
	
	input[type="text"],
	input[type="email"],
	input[type="password"],
	input[type="tel"] {
		width: 100%;
		padding: 12px;
		border: 1px solid #ddd;
		border-radius: 5px;
		font-size: 14px;
		transition: border-color 0.3s;
		box-sizing: border-box;
	}
	
	input[type="text"]:focus,
	input[type="email"]:focus,
	input[type="password"]:focus,
	input[type="tel"]:focus {
		outline: none;
		border-color: #667eea;
		box-shadow: 0 0 5px rgba(102, 126, 234, 0.3);
	}
	
	.form-row {
		display: grid;
		grid-template-columns: 1fr 1fr;
		gap: 15px;
	}
	
	.form-row .form-group {
		margin-bottom: 0;
	}
	
	.form-group button {
		width: 100%;
		padding: 12px;
		background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
		color: white;
		border: none;
		border-radius: 5px;
		font-size: 16px;
		font-weight: bold;
		cursor: pointer;
		transition: transform 0.2s, box-shadow 0.2s;
		margin-top: 10px;
	}
	
	.form-group button:hover {
		transform: translateY(-2px);
		box-shadow: 0 5px 15px rgba(102, 126, 234, 0.4);
	}
	
	.form-group button:active {
		transform: translateY(0);
	}
	
	.terms-agreement {
		margin: 15px 0;
		font-size: 13px;
		color: #666;
	}
	
	.terms-agreement input {
		margin-right: 8px;
	}
	
	.terms-agreement a {
		color: #667eea;
		text-decoration: none;
	}
	
	.terms-agreement a:hover {
		text-decoration: underline;
	}
	
	.login-link {
		text-align: center;
		margin-top: 15px;
		color: #666;
		font-size: 14px;
	}
	
	.login-link a {
		color: #667eea;
		text-decoration: none;
		font-weight: bold;
	}
	
	.login-link a:hover {
		text-decoration: underline;
	}
	
	.error-message {
		color: #e74c3c;
		font-size: 12px;
		margin-top: 5px;
	}
</style>
</head>
<body>

	<div class="signup-container">
		<h1>Create Account</h1>
		<form action="/signup" method="post">
			<div class="form-row">
				<div class="form-group">
					<label for="firstname">First Name</label>
					<input type="text" id="firstname" name="firstname" placeholder="John" required>
				</div>
				<div class="form-group">
					<label for="lastname">Last Name</label>
					<input type="text" id="lastname" name="lastname" placeholder="Doe" required>
				</div>
			</div>
			
			<div class="form-group">
				<label for="email">Email Address</label>
				<input type="email" id="email" name="email" placeholder="john.doe@example.com" required>
			</div>
			
			<div class="form-group">
				<label for="phone">Phone Number</label>
				<input type="tel" id="phone" name="phone" placeholder="+1 (555) 123-4567">
			</div>
			
			<div class="form-group">
				<label for="username">Username</label>
				<input type="text" id="username" name="username" placeholder="Choose a username" required>
			</div>
			
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" id="password" name="password" placeholder="At least 8 characters" required>
			</div>
			
			<div class="form-group">
				<label for="confirm-password">Confirm Password</label>
				<input type="password" id="confirm-password" name="confirm-password" placeholder="Re-enter your password" required>
			</div>
			
			<div class="terms-agreement">
				<input type="checkbox" id="terms" name="terms" required>
				<label for="terms" style="display: inline; font-weight: normal; margin: 0;">
					I agree to the <a href="#">Terms and Conditions</a>
				</label>
			</div>
			
			<div class="form-group">
				<button type="submit">Sign Up</button>
			</div>
		</form>
		
		<div class="login-link">
			Already have an account? <a href="/">Login here</a>
		</div>
	</div>

</body>
</html>
